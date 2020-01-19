package shop.test;

import shop.entity.ProductList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.stream.Collectors;

@Path("test")
public class TestRest {

    @GET
    public Response all() {
        return Response.ok("Working test....").build();
    }
}
