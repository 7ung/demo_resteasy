package com.tunghh.seminar;

import com.tunghh.seminar.DummyData.User;
import javafx.scene.media.Media;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Stevie on 05/05/2017.
 */
@Path("")
public class Ex5SubResources {

    @GET
    @Path("user/{id}")
    @Produces("application/json; charset=UTF-8")
    public User getUser(@PathParam("id") int id) {
        return User.collections.get(0);
    }

    @GET
    @Path("user")
    @Produces("application/json; charset=UTF-8")
    public List<User> getUsers() {
        return User.collections;
    }
}