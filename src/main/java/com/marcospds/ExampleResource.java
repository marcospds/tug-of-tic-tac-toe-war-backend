package com.marcospds;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.vertx.core.json.Json;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
    	
        return "[{\"name\":\"eaaaaarl of Lemongrab\",\"age\":\"Unknown\",\"species\":\"Lemon Candy\",\"occupation\":\"Earl, Heir to the Candy Kingdom Throne\"},{\"name\":\"Bonnibel Bubblegum\",\"age\":\"19\",\"species\":\"Gum Person\",\"occupation\":\"Returned Ruler of the Candy Kingdom\"}]";
    }
}