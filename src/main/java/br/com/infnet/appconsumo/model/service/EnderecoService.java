package br.com.infnet.appconsumo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.appconsumo.clients.EnderecoClient;
import br.com.infnet.appconsumo.model.negocio.Endereco;

@Service
public class EnderecoService {

	@Autowired private EnderecoClient client;
	public Endereco obterPorCep(String cep) {
		return client.obterPorCep(cep);
	}
}
