package org.acme;

import io.quarkus.resteasy.reactive.server.EndpointDisabled;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
@EndpointDisabled(name = "hello.enabled", stringValue = "false", disableIfMissing = true)
public class GreetingResource {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public String hellos() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/{test}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(String test) {
        return "Hello from RESTEasy Reactive";
    }
}
