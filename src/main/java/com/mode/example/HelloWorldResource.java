package com.mode.example;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.Optional;

@Path("/hello-world")
@ApiResponse(description = "Hello World Resource", responseCode = "200")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    public String sayHi(@QueryParam("name") String name) {
        return "Hello, %s!".formatted(Optional.ofNullable(name).orElse("world"));
    }
}
