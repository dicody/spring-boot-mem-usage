# Spring Boot projects with Dockerfiles

The idea behind this project is to find out min memory requirements for Dockerized Spring Boot applications.

## TBD

- non-functional requirements (covered by automated suite)
- reduce boilerplate in templates

## Prerequisite
1. checkout repository
    ```shell
    git clone git@github.com:dicody/spring-boot-projects-for-mem-usage-exp.git
    ```
2. select project
    ```shell
    cd web
    ``` 
3. Docker build
    ```sh
    docker build -t dicody/spring-boot-web .
    ```
4. Docker run
    ```sh
    docker run -it --rm -p 8080:8080 dicody/spring-boot-web
    ```

## Theory

### [Docker memory limits](https://docs.docker.com/config/containers/resource_constraints/#memory)

TBD

### Java versions

TBD

## Experiments

TBD

## Useful links:
 - [All about Docker](https://github.com/veggiemonk/awesome-docker)
 - [Tweaks to increase Sprint Boot start up time](https://spring.io/guides/topicals/spring-boot-docker/#:~:text=the%20layering%20feature.-,Tweaks,-If%20you%20want)
