central-service-payload.txt is present in resources folder

publish payload
kcat -P -b localhost:9092 -t central-kafka-service-consumer-test -K "|" -l < central-service-payload.txt
