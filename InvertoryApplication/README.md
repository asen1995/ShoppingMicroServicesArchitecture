example POST curls

curl http://localhost:8442/createInvertory -d '{"name": "Iphone" , "price" : 2000.20 }' -H 'Content-Type: application/json'

Building steps: 

.\gradlew clean build
.\gradlew.bat clean build -x test
