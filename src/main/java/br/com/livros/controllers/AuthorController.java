package br.com.livros.controllers;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import br.com.livros.dto.AuthorDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.livros.models.Author;
import br.com.livros.services.impl.AthorsServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/author")
@Tag(name = "Autores")
public class AuthorController  {
	private  Logger logger = Logger.getLogger(this.getClass().getName());
	@Autowired
	AthorsServiceImpl authorsService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Saves Books Authors ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Author Saved Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Author Not Saved" )}) 
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AuthorDto> save(@RequestBody AuthorDto authorDto) {
        return new ResponseEntity<AuthorDto>(authorsService.save(authorDto),HttpStatus.CREATED);
}
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Finds All Books Authors ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Author Found Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Author Not Saved" )}) 
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Author>> findAll(){
		logger.info("Passou no find...");
		List<Author> authors = authorsService.findAll();
		return new ResponseEntity<List<Author>>(authors,HttpStatus.OK);
			
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Finds Books Author ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Author Found Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Author Not Saved" )}) 
	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Author> findById(@PathVariable Long id){
		logger.info("id encontrado -> "+ id);
		return authorsService.findById(id);
			
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Deletes Books Author ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Author Deleted Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Author Not Deleted" )}) 
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)		
	public Author delete(@PathVariable Long id ){
		return authorsService.deleteById(id);
			
	}
	
	

}
