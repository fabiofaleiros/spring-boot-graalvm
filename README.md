<h1 align="center">
  GraalVM + SpringBoot
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Youtube&message=@DevCollab&color=8257E5&labelColor=000000" alt="@DevCollab" />
 <img src="https://img.shields.io/static/v1?label=Type&message=Learning&color=8257E5&labelColor=000000" alt="Learning" />
</p>

API to test graalvm native compile

## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Web](https://docs.spring.io/spring-framework/reference/web.html)
- [Spring GraalVM Native Support](https://docs.spring.io/spring-boot/docs/current/reference/html/native-image.html)

## Adopted practices

- GraalVM native compile

## Prerequisites

- On Windows, install Visual Studio 2022 + Desktop development with C++ Workload.
- Install a [graalvm-jdk-17.0.11](https://download.oracle.com/graalvm/17/latest/graalvm-jdk-17_windows-x64_bin.zip).
- Set maven to use this jdk.

### Locally
- Clone git [repository](https://github.com/fabiofaleiros/spring-boot-graalvm.git)
- Build project:
```
./mvnw clean package
```
- Make a native compile (this may take a few minutes do complete):
```
./mvnw -Pnative native:compile
```
- Load the executable generated on target dir (~\spring-boot-graalvm\target>spring-boot-graalvm.exe):
```
cd target
spring-boot-graalvm.exe
```

Link API [localhost:8080](http://localhost:8080).

## API Endpoints

Tool [postman](https://www.postman.com):

- GET localhost:8080
```
HTTP/1.1 200 OK
Content-Type: text/plain;charset=UTF-8

Hello GraalVM
```