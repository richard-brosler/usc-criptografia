package br.usc.segusc.criptografia.services;

import br.usc.segusc.criptografia.impl.Criptografia;

public class CriptografiaFactory {
	
	private static CriptografiaFactory inst;
	private Criptografia cripto;
	
	private CriptografiaFactory() {
		cripto = new Criptografia();
	}
	public static CriptografiaFactory getInstance(){
		if (inst==null)
			inst = new CriptografiaFactory();
		return inst;
	}
	public static ICriptografiaService getCriptografiaServiceImpl(){
		return getInstance().cripto;
	}
}
