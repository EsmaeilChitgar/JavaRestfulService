package myPackage;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Api(value = "hello2", description = "Endpoint for Hello specific operations")
public class MyEndpoint {

    @Path("func1")
    @Produces(MediaType.TEXT_HTML)
    @GET
    @ApiOperation(value = "Returns param", notes = "Returns param", response = MyEndpoint.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful retrieval of param value", response = MyEndpoint.class) })
    public String ping(){
        return "Hello from ping";
    }
}
