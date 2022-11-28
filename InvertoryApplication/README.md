example POST curls

curl http://localhost:8442/createInvertory -d '{"name": "Iphone" , "price" : 2000.20 }' -H 'Content-Type: application/json'

Building steps: 

.\gradlew clean build
.\gradlew.bat clean build -x test



Swagger 

http://localhost:8442/swagger-ui/index.html


SSL


keytool -genkeypair -alias invertory-service-keystore -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore invertory.p12 -validity 3650
