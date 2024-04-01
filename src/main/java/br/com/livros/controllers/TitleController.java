package br.com.livros.controllers;



import br.com.livros.dto.TitleDto;
import br.com.livros.models.Title;
import br.com.livros.services.TitleService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/title")
@Tag(name = "Titulo")
public class TitleController {

    @Autowired
    TitleService titleService;


    @CrossOrigin(origins = "http://localhost:4200")
    @Operation(summary = "Saves Media Title", description = "Descricao")

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Title Saved Successfuly "),
            @ApiResponse(responseCode = "400", description = "Invalid Path" ),
            @ApiResponse(responseCode = "404", description = "Title Not Saved" ),
    })
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Title> save(@RequestBody TitleDto authorDto) {
        return new ResponseEntity<Title>(titleService.save(authorDto), HttpStatus.CREATED);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @Operation(summary = "Gets All Titles Available")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Title Found "),
            @ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ),
            @ApiResponse(responseCode = "404", description = "Title Not Found" )})
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<List<Title>> findAll() {

        List<Title> titles = titleService.findAll();
        return new ResponseEntity<List<Title>> (titles, HttpStatus.OK) ;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @Operation(summary = "Deletes Title ")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Title Deleted Successfuly "),
            @ApiResponse(responseCode = "400", description = "Invalid Path" ),
            @ApiResponse(responseCode = "404", description = "Title Not Deleted" )})
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Title> delete(@RequestBody @Valid Title title) {
        return new ResponseEntity<Title>(titleService.delete(title), HttpStatus.CREATED);
    }
 }
