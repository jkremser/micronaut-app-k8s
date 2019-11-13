#!/bin/sh
$@ &
MY_PID=$!
sleep 0.02
psrecord $MY_PID --plot myplot.png &
PSRECORD_PID=$!
sleep 1
while [[ "$(curl -s -o /dev/null -w ''%{http_code}'' http://localhost:8080/quotes/random)" != "200" ]]; do sleep 0.02; done
sleep 1
curl http://localhost:8080/quotes/random
sleep 1
curl http://localhost:8080/quotes/random
sleep 1
curl http://localhost:8080/quotes/random
kill -9 $MY_PID

echo "\n"
echo $(pwd)/myplot.png
