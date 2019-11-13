docker build . -f Dockerfile.native -t micronaut-graal-app:native
docker build . -f Dockerfile.jit -t micronaut-graal-app:jit
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 micronaut-graal-app:native"
