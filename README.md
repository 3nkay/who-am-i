# who-am-i
HTTP docker app that prints container ID

### Usage
```
$ docker run -d -p 8080:8080 nkavtur/who-am-i:latest
2e794259718739854468842fea2bebbcef89299d1fe0217c64067f0f63c06f43

$ curl $(hostname --all-ip-addresses | awk '{print $1}'):8080/who-am-i
2e7942597187
```

