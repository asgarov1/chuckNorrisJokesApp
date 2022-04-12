# myApp

Spring Boot app that has a single landing page which everytime generates a new Chuck Norris joke

### Build:
`docker build -t chuck-norris-app .`

### Run:
`docker run -p 8080:8080 -p 7007:7007 -d chuck-norris-app`

*port 7007 is exposed for remote debugging*