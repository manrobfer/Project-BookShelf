package br.com.livros;

import org.apache.logging.log4j.LogManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class LivrosStarter {
	static Logger log = Logger.getLogger(LivrosStarter.class.getName());
	public static void main(String[] args) {
        SpringApplication.run(LivrosStarter.class, args);	
        
	}
}