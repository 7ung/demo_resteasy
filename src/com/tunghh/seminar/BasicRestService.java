package com.tunghh.seminar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * @Path Dùng để quy định url, có thể đặt tại class hoặc tại hàm.
 * @GET @POST @PUT @DELETE các HTTP METHOD ứng với function
 *
 * Created by Stevie on 05/04/2017.
 */
@Path("/hello-resteasy")            // Path phải đặt ở đây
public class BasicRestService {

    @GET
    public String getTest()
    {
        // this will show hello text
        return "hello newbie";
    }
}
