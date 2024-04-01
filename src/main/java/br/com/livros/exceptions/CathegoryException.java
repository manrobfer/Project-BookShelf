package br.com.livros.exceptions;

public class CathegoryException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CathegoryException(Long id) {
	        super(String.format("Category with id (%d) not found",id));
	}

	public CathegoryException(String msg){
		super(msg);
	}
}
