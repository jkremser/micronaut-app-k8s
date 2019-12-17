ORG=${ORG:-"jkremser/"}

docker build . -f Dockerfile.native -t ${ORG}micronaut-graal-app:native
docker build . -f Dockerfile.jit -t ${ORG}micronaut-graal-app:jit
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 micronaut-graal-app:native"
