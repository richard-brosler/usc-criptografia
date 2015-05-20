package br.usc.segusc.criptografia.services;

import br.usc.segusc.criptografia.entity.AlgoritmoCriptografia;

public interface ICriptografiaService {
	public String encriptar(String mensagem, AlgoritmoCriptografia algoritmo);
}
