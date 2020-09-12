package br.com.infnet.appconsumo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.infnet.appconsumo.model.service.EnderecoService;

@Controller
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;

	@RequestMapping(value = "/cep/{cep}", method = RequestMethod.GET)
	public String obterPorCep(Model model, @PathVariable String cep) {

		model.addAttribute("endereco", enderecoService.obterPorCep(cep));

		return "/endereco";

	}

}
