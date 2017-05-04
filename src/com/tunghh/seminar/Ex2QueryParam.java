package com.tunghh.seminar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * @QueryParam .../my-path/my-resource?queryparam=value4
 * Created by Stevie on 05/04/2017.
 */
@Path("")
public class Ex2QueryParam {

    @Path("student")
    @GET
    public String getStudent(@QueryParam("name") String studentName){
        return studentName + " is gay";
    }

    @Path("resources")
    @GET
    public Object getResourceByName(@QueryParam("name") String name){
        Object res = null; // Find Resource By Name
        return res;
    }


    /**
     * @QueryParam
     * Cũng giống Path Param,
     * Query param cũng có thể dứng trước một class có constructor với String
     * hoặc một kiểu dữ liệu cơ sở có hàm String.valueOf()
     */
}
