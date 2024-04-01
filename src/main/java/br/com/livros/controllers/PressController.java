package br.com.livros.controllers;

import br.com.livros.dto.PressDto;
import br.com.livros.dto.TitleDto;
import br.com.livros.models.Press;
import br.com.livros.models.Title;
import br.com.livros.services.PressService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Midias")
@RestController
@RequestMapping("/press")
public class PressController {

    @Autowired
    PressService pressService;

    @CrossOrigin("*")
    @Operation(summary = "Saves Press Title", description = "Press")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Press Saved Successfuly "),
            @ApiResponse(responseCode = "400", description = "Invalid Path" ),
            @ApiResponse(responseCode = "404", description = "Press Not Saved" ),
    })
    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Press> save(@RequestBody PressDto pressDto) {
        return new ResponseEntity<Press>(pressService.save(pressDto), HttpStatus.CREATED);
    }

    @CrossOrigin("*")
    @Operation(summary = "Gets All Press Available")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "All Press Found "),
            @ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ),
            @ApiResponse(responseCode = "404", description = "Press Not Found" )})
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<List<Press>> findAll() {

        List<Press> press = pressService.findAll();
        return new ResponseEntity<List<Press>> (press, HttpStatus.OK) ;
    }
}
