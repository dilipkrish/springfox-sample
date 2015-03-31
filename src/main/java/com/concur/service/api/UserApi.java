package com.concur.service.api;

import com.concur.service.model.*;

import com.wordnik.swagger.annotations.*;

import com.sun.jersey.multipart.FormDataParam;

import com.concur.service.model.User;
import java.util.*;

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
@RequestMapping("/user",produces = {APPLICATION_JSON_VALUE})
@Api(value = "/user", description = "the user API")
public class UserApi {
  

  
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Create user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "successful operation") })

  public Response createUser(@ApiParam(value = "Created user object"  ) User body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/createWithArray", method = RequestMethod.POST )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "successful operation") })

  public Response createUsersWithArrayInput(@ApiParam(value = "List of user object"  ) List<User> body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/createWithList", method = RequestMethod.POST )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Creates list of users with given input array", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "successful operation") })

  public Response createUsersWithListInput(@ApiParam(value = "List of user object"  ) List<User> body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/login", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Logs user into the system", notes = "", response = String.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid username/password supplied") })

  public Response loginUser(@ApiParam(value = "The user name for login") @QueryParam("username") String username,
    @ApiParam(value = "The password for login in clear text") @QueryParam("password") String password)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/logout", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Logs out current logged in user session", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "successful operation") })

  public Response logoutUser()
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{username}", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Get user by user name", notes = "", response = User.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "User not found"),
    
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid username supplied") })

  public Response getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true ) @PathParam("username") String username)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{username}", method = RequestMethod.PUT )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Updated user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "User not found"),
    
    @ApiResponse(code = 400, message = "Invalid user supplied") })

  public Response updateUser(@ApiParam(value = "name that need to be deleted",required=true ) @PathParam("username") String username,
    @ApiParam(value = "Updated user object"  ) User body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{username}", method = RequestMethod.DELETE )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Delete user", notes = "This can only be done by the logged in user.", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "User not found"),
    
    @ApiResponse(code = 400, message = "Invalid username supplied") })

  public Response deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true ) @PathParam("username") String username)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
