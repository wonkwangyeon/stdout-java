# What is this?
Logging service for fluentbit(or etc...) test
Callable by log level.

# Prerequisites
Java version >= 17

# Build
> ctr -n=k8s.io images import stdout.tar

Using container build
```
docker build -t stdout:latest .
```

# K8S Deploy
Need to modify hosts field in k8s.yaml file
```
kubectl apply -f k8s.yaml
```

# How to use?
Request Url
-  /logStdout?level=info&msg=HelloWorld
    - LEVEL : TRACE, DEBUG, INFO, WARN, ERROR, ETC
    - The default value for the level parameter is all.
    - The default value for the msg parameter is 'Log Hellow World'.
-  /print?msg=HelloWorld
    - The default value for the msg parameter is 'Print Hellow World'.
