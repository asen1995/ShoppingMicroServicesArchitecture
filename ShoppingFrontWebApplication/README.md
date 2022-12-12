example POST curls

curl http://localhost:9000/registerArticule -d '{"name": "Iphone" , "price" : 2000.20 }' -H 'Content-Type: application/json'

Building steps: 

.\gradlew clean build
.\gradlew.bat clean build -x test



Swagger 

http://localhost:9000/swagger-ui/index.html


Invertory-client-module is REST microservice. we generate classes from its swagger file in order to 
call it.

