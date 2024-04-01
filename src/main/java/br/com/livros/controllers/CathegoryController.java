package br.com.livros.controllers;

import java.util.List;



import br.com.livros.dto.CategoryDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.livros.models.Cathegory;
import br.com.livros.services.impl.CathegoryServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/category")
@Tag(name = "Categoria")
public class CathegoryController {
	
	private static Logger log = LogManager.getLogger(CathegoryController.class);

	@Autowired
	CathegoryServiceImpl categoriaservico;

	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Gets All Cathegories Available")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "All Cathegories Found "), 
			@ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ), 
			@ApiResponse(responseCode = "404", description = "Cathegories Not Found" )}) 
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public ResponseEntity<List<Cathegory>> findAll() {

			List<Cathegory> cathegories = categoriaservico.findAll();
			return new ResponseEntity<List<Cathegory>> (cathegories, HttpStatus.OK) ;
	}
	
	@Operation(summary = "Gets Required Cathegory Available")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Cathegory Found "), 
			@ApiResponse(responseCode = "400", description = "Invalid Info Supplied" ), 
			@ApiResponse(responseCode = "404", description = "Cathegory Not Found" )}) 	
	@RequestMapping(value = "find/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cathegory> findCathegory(@PathVariable Long id){
		return new ResponseEntity<Cathegory>(categoriaservico.findById(id),HttpStatus.OK);
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Saves Books Cathegories ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Cathegory Saved Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Cathegory Not Saved" )}) 
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cathegory> save(@RequestBody @Valid CategoryDto categorias) {
	        return new ResponseEntity<Cathegory>(categoriaservico.save(categorias),HttpStatus.CREATED);

	}
	@CrossOrigin(origins = "http://localhost:4200")
	@Operation(summary = "Deletes Cathegories of Books ")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Cathegory Deleted Successfuly "), 
			@ApiResponse(responseCode = "400", description = "Invalid Path" ), 
			@ApiResponse(responseCode = "404", description = "Cathegory Not Deleted" )}) 
	@RequestMapping(value = "/delete/{codigo}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable int codigo) {
		System.out.println("Codigo da categoria recebida " + codigo);
		categoriaservico.delete(codigo);
        return new ResponseEntity(HttpStatus.OK);

   }
	
	

}
