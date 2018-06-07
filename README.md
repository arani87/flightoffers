# flightoffers

```bash
git clone https://github.com/arani87/flightoffers.git
cd flightoffers
mvnw.cmd clean install
docker build -t ssh/flightoffers .
docker run -p 8080:8080 -i ssh/flightoffers
```
