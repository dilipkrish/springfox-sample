package com.concur.service.api;

import com.concur.service.model.*;

import com.wordnik.swagger.annotations.*;

import com.sun.jersey.multipart.FormDataParam;

import com.concur.service.model.Pet;
import java.io.File;

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
@RequestMapping("/pet",produces = {APPLICATION_JSON_VALUE})
@Api(value = "/pet", description = "the pet API")
public class PetApi {
  

  
  @Consumes({ "application/json", "application/xml" })
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Update an existing pet", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 405, message = "Validation exception"),
    
    @ApiResponse(code = 404, message = "Pet not found"),
    
    @ApiResponse(code = 400, message = "Invalid ID supplied") })

  public Response updatePet(@ApiParam(value = "Pet object that needs to be added to the store"  ) Pet body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  
  @Consumes({ "application/json", "application/xml" })
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Add a new pet to the store", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 405, message = "Invalid input") })

  public Response addPet(@ApiParam(value = "Pet object that needs to be added to the store"  ) Pet body)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/findByStatus", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Finds Pets by status", notes = "Multiple status values can be provided with comma seperated strings", response = Pet.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid status value") })

  public Response findPetsByStatus(@ApiParam(value = "Status values that need to be considered for filter") @QueryParam("status") List<String> status)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/findByTags", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Finds Pets by tags", notes = "Muliple tags can be provided with comma seperated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid tag value") })

  public Response findPetsByTags(@ApiParam(value = "Tags to filter by") @QueryParam("tags") List<String> tags)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{petId}", method = RequestMethod.GET )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Find pet by ID", notes = "Returns a pet when ID < 10.  ID > 10 or nonintegers will simulate API error conditions", response = Pet.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 404, message = "Pet not found"),
    
    @ApiResponse(code = 200, message = "successful operation"),
    
    @ApiResponse(code = 400, message = "Invalid ID supplied") })

  public Response getPetById(@ApiParam(value = "ID of pet that needs to be fetched",required=true ) @PathParam("petId") Long petId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{petId}", method = RequestMethod.POST )
  @Consumes({ "application/x-www-form-urlencoded" })
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Updates a pet in the store with form data", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 405, message = "Invalid input") })

  public Response updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true ) @PathParam("petId") String petId,
    @ApiParam(value = "Updated name of the pet" )@FormParam("name")  String name,
    @ApiParam(value = "Updated status of the pet" )@FormParam("status")  String status)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{petId}", method = RequestMethod.DELETE )
  
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "Deletes a pet", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 400, message = "Invalid pet value") })

  public Response deletePet(@ApiParam(value = ""  )@HeaderParam("apiKey") String apiKey,
    @ApiParam(value = "Pet id to delete",required=true ) @PathParam("petId") Long petId)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  

  @RequestMapping(value = "/{petId}/uploadImage", method = RequestMethod.POST )
  @Consumes({ "multipart/form-data" })
  @Produces({ "application/json", "application/xml" })
  @ApiOperation(value = "uploads an image", notes = "", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 0, message = "successful operation") })

  public Response uploadFile(@ApiParam(value = "ID of pet to update",required=true ) @PathParam("petId") Long petId,
    @ApiParam(value = "Additional data to pass to server" )@FormParam("additionalMetadata")  String additionalMetadata,
    @ApiParam(value = "file to upload") @FormDataParam("file") InputStream inputStream,
    @ApiParam(value = "file detail") @FormDataParam("file") FormDataContentDisposition fileDetail)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }

  
}
