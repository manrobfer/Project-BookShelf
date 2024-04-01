package br.com.livros.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Main")
@RestController
public class MainController {


    @Operation(summary = "Checks if application runs ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Loaded Successfuly "),
            @ApiResponse(responseCode = "400", description = "Invalid Path" ),
            @ApiResponse(responseCode = "404", description = "Not found" )})
    @GetMapping(value ="/")
    public String getPage(){
        return "<h1 style='color: green'> Starting project BookShelf </h1> <hr /> <p> Welcome to this brand new web page! </p>  ";
    }
}
