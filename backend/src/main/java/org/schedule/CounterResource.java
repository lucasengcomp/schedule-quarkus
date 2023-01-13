package org.schedule;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/counter")
public class CounterResource {

    @Inject
    CounterScheduler counter;

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String getScheduler() {
        return "O valor do scheduler é: " + counter.get();
    }
}
