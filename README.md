Project I carried out for learning with the help of a tutorial by Fernanda Kipper about a back end challenge.

Main functionality of the application: The application aims to deposit and transfer money between users. We have 2 types of users, ordinary users and retailers, both have wallets with money and make transfers between them.

## Technologies:
* Java
* Spring Boot
* RESTful API
* JUnit
* Mockito
* Postman

## I added some features like:
* OpenAPI 3 - Springdoc library for Swagger UI
* Docker
* CI/CD

## How to use with docker compose:
Have docker installed and running
```
docker compose up
```
Or detached mode:
```
docker compose up -d
```
You can then use "docker compose down" to delete the container, "docker compose stop" to stop, "docker compose start" or "docker compose up -d" again... Remember to delete it from your local docker if you want so it doesn't get saved on your machine. To do this, you can do for example: "docker ps -a", get the container id and delete it "docker rm {id here without the keys}". Then you can delete the image, see the image id: "docker images" and use: "docker rmi {id here without the keys}".
