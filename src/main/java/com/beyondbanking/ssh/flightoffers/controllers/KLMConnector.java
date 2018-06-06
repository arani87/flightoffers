package com.beyondbanking.ssh.flightoffers.controllers;


import com.beyondbanking.ssh.flightoffers.model.*;
import com.beyondbanking.ssh.flightoffers.model.response.FlightOffersResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/flightoffers")
public class KLMConnector {


    private RestTemplate restTemplate;


    @Autowired
    public KLMConnector(RestTemplateBuilder builder) {
        restTemplate = builder.build();
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public FlightOffersResponseModel searchOffers(@RequestParam(value = "source") String source, @RequestParam(value = "destination") String destination) {
        List<RequestedConnection> requestedConnectionList = new ArrayList<>();
        FlightOffersRequestModel flightOffersRequestModel = new FlightOffersRequestModel();
        flightOffersRequestModel.setCabinClass("ECONOMY");
        PassengerCount passengerCount = new PassengerCount();
        passengerCount.setADULT(1);
        flightOffersRequestModel.setPassengerCount(passengerCount);
        flightOffersRequestModel.setCurrency("EUR");
        flightOffersRequestModel.setType("OVERALL");
        RequestedConnection requestedConnection = new RequestedConnection();
        requestedConnection.setMaxDaysOfStay(7);
        requestedConnection.setMinDaysOfStay(2);
        requestedConnection.setDateInterval("2018-06-01/2019-06-01");
        Origin origin = new Origin();
        Airport airport = new Airport();
        airport.setCode(source);
        origin.setAirport(airport);
        requestedConnection.setOrigin(origin);

        Destination dest = new Destination();
        Airport_ airport_ = new Airport_();
        airport_.setCode(destination);
        dest.setAirport(airport_);
        requestedConnection.setDestination(dest);

        requestedConnectionList.add(requestedConnection);

        flightOffersRequestModel.setRequestedConnections(requestedConnectionList);

        HttpHeaders headers = new HttpHeaders();
        headers.set("accept", "application/hal+json");
        headers.set("Api-Key", "ypjj6fuwfeqyrzjvj6pvmd9a");
        headers.set("afkl-travel-host", "KL");
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<FlightOffersRequestModel> request = new HttpEntity<>(flightOffersRequestModel, headers);
        return restTemplate.postForObject("https://api.klm.com/opendata/flightoffers/lowest-fare-offers?expand-suggested-flights=true", request, FlightOffersResponseModel.class);
    }
}
