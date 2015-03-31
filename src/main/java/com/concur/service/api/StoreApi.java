package com.concur.service.api;

import com.concur.service.model.*;

import com.wordnik.swagger.annotations.*;

import com.sun.jersey.multipart.FormDataParam;

import java.util.Map;
import com.concur.service.model.Order;

import java.util.List;
import com.concur.service.api.NotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping("/store",produces = {APPLICATION_JSON_VALUE})
@Api(value = "/store", description = "the store API")
public class StoreApi {
  

  @RequestMapping(value = "/inventory", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "map")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation") })

  public Response getInventory()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/order", method = RequestMethod.POST )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid Order") })

  public Response placeOrder(@ApiParam(value = "order placed for purchasing the pet"  ) Order body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/order/{orderId}", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions", response = Order.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "Order not found"),
    
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid ID supplied") })

  public Response getOrderById(@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathParam("orderId") String orderId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/order/{orderId}", method = RequestMethod.DELETE )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "Order not found"),
    
    @ApiResponse(code = 400, message = "Invalid ID supplied") })

  public Response deleteOrder(@ApiParam(value = "ID of the order that needs to be deleted",required=true ) @PathParam("orderId") String orderId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
