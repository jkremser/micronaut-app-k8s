== Deployment to Kubernetes

==== benchmark the "native setup"

```
minikube start -p native --memory=3g
kubectl apply -f kubernetes/native-deployment.yaml
minikube service quotes-app -p native
minikube service list -p native
// do the load
minikube stop -p native
```

==== benchmark the "jit setup"

```
minikube start -p jit --memory=3g
kubectl apply -f kubernetes/jit-deployment.yaml
minikube service quotes-app -p jit
// do the load
minikube stop -p jit
```

==== Some Ideas for Benchmarking
```
// do the load
hey -n 3000 http://host:port/quotes/random
wrk -t16 -c400 -d30s http://host:port/quotes/random
```

=== optional: ingress setup

```
minikube addons enable ingress
```

```
get pods -l app.kubernetes.io/name=nginx-ingress-controller -n kube-system
```

```
INGRESS=$(kubectl get ingress quotes-app -o=jsonpath='{.status.loadBalancer.ingress[].ip}')
```

```
λ hey -n 3000 http://$INGRESS/quotes/random
```
