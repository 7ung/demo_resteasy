package com.tunghh.seminar;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

/**
 * @FormParam (aka Post Param) parse from HTML form tag or POST request
 * Created by Stevie on 05/04/2017.
 */
@Path("")
public class Ex4FormParam {

    @Path("login")
    @POST
    public String login(@FormParam("username") String username,
                         @FormParam("password") String pwrd){
        return "username is: " + username + ". Password is: " + pwrd;
    }
}
