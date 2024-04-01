package br.com.livros.exceptions;

public class NoDataFoundException  extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoDataFoundException() {
		super("No Data Found");
	}

}
