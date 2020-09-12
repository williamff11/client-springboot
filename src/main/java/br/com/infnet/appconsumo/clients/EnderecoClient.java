package br.com.infnet.appconsumo.clients;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.infnet.appconsumo.model.negocio.Endereco;

@Component
public class EnderecoClient {

	public Endereco obterPorCep(String cep) {		
		return new RestTemplate().getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
	}
}
