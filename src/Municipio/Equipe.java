package Municipio;

import java.util.Iterator;
import java.util.List;

import Negocio.RelatarProblema;

public class Equipe {
	
	private String membros;
	private FuncionarioZeladoria funcionarioZeladoriaChefe;
	private RelatarProblema relatarProblema;

	public Equipe(String membros) {
		this.membros = membros;
	}
	
	public String localDoConserto(List<RelatarProblema> relatarProblemas, int index) {
		
		String localDoConserto = "Local Do Conserto ";
		for (RelatarProblema relatarProblema : relatarProblemas) {
			
			localDoConserto += "\n\n";
			localDoConserto += String.format("Bairro -> %20s  Rua -> %20s  Numero ->  %20s \n", relatarProblema.getBairro(), relatarProblema.getRua(),
					relatarProblema.getNumero());
		}
		
		localDoConserto += "\n";
		return localDoConserto;
		
	}
	
	public boolean solucionarProblema(Municipe municipe, List<RelatarProblema> relatarProblema ,int index, boolean resolucao) {
		if(municipe.isConsertou() != resolucao) {
			
		relatarProblema.get(index).setStatusProblema(false);;
		municipe.setConsertou(true);
		
		return true;
		
		}
		return false;
	}

	public String getMembros() {
		return membros;
	}

	public void setMembros(String membros) {
		this.membros = membros;
	}
	
	public FuncionarioZeladoria getFuncionarioZeladoriaChefe() {
		return funcionarioZeladoriaChefe;
	}
	
	public void setFuncionarioZeladoriaChefe(FuncionarioZeladoria funcionarioZeladoriaChefe) {
		this.funcionarioZeladoriaChefe = funcionarioZeladoriaChefe;
	}

	public RelatarProblema getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(RelatarProblema relatarProblema) {
		this.relatarProblema = relatarProblema;
	}
	
	
	

}
