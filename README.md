# Dockerfile-multi-stage_server
Petit demonstration de docker multi-stage (shisptone.org)

Cette exemple propose d'intégrer le fichier de build docker (Dockerfile) au niveau des sources.
Ce n'est pas forcement une solution satisfaisante.

Pour lancer le build de l'image :
```bash
docker build -t shipstone/multistage:0.9.0-docker .
```

Pour executer l'image:
```bash
docker run -p 8080:8080 --name multistage shipstone/multistage:0.9.0-docker
````


et pour le test : 

```bash
http :8080/ping/version
```

qui renvera comme résultat : 

```bash
HTTP/1.1 200
Content-Length: 12
Content-Type: text/plain;charset=UTF-8
Date: Tue, 13 Jun 2017 22:37:08 GMT

0.9.0-docker
```