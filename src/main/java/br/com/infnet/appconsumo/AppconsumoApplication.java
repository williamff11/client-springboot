package br.com.infnet.appconsumo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.com.infnet.appconsumo.model.service.EnderecoService;

@SpringBootApplication
@EnableFeignClients
public class AppconsumoApplication implements CommandLineRunner{

	@Autowired private EnderecoService service;
	
	public static void main(String[] args) {
		SpringApplication.run(AppconsumoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Endereco: " + service.obterPorCep("76907668"));
		
	}

}
