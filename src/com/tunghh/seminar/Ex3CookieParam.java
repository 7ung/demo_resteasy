package com.tunghh.seminar;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Stevie on 05/04/2017.
 */
@Path("")
public class Ex3CookieParam {

    @Path("ssid")
    @GET()
    public int getSessionId(@CookieParam("sessionid") int id)
    {
        return id;
    }
}
