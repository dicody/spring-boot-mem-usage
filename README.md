# Spring Boot templates with Dockerfiles for memory experiments

This project provides different Spring Boot project configurations for min memory experiments. 

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

## Spring Boot Web



## Spring Boot Webflux


