package com.tunghh.seminar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @PathParam .../my-path/{my-path-param}
 * Created by Stevie on 05/04/2017.
 */
@Path("")
public class Ex1PathParamRestService {

    @GET
    @Path("/ex1/{your-name}")           // Path có thể đặt ở đây
    public String pathParamExample(@PathParam("your-name") String username){
        return "hello " + username;
    }

    @GET
    @Path("resources/{id}")
    public Object getResources(@PathParam("id") int id)
    {
        Object res = null; // Find Resource By Id
        return res;
    }

    /**
     * @ParhParam
     * Không chỉ có thể đứng trước String
     * Path Param có thể đứng trước một class có constructor với param là String,
     * hoặc một kiểu dữ liệu cơ sở tương ứng với một hàm String.valueOf();
     */

}
