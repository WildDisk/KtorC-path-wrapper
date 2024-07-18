# Ktor-client path wrapper

## Wrapper over ktor-client to determine the path to the endpoint

How to use

Configure client
```kotlin
val client = Ktor.Configure(CIO)
    .client
    .config { //if we need include something
        install(ContentNegotiation) {
            json()
        }
    }
    .host("http://localhost:8080")
```

Add endpoint and parameters
```kotlin
//http://localhost:8080/api/v2/post?id=1&value=1
val clientWithURI = client
    .withPath()
        .with("api")
        .with("v2")
        .with("post")
    .withParam()
        .with("id", "1")
        .with("value", "1")
    .build() 
```

Methods

GET
```kotlin
clientWithURI.method()
    .get()
    .body()
```

POST
```kotlin
clientWithURI.method()
    .post {
        contentType(ContentType.Application.Json)
        setBody("{\"message\":\"hello world!\"}")
    }
    .body()
```