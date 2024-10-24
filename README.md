docker build -t stdout:latest .

ctr -n=k8s.io images import stdout.tar
