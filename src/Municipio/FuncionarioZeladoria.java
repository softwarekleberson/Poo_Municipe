package Municipio;

import java.util.ArrayList;
import java.util.List;

import Negocio.RelatarProblema;
import Pessoa.Pessoa;
import ValidacaoDadosNegocio.ExcecaoNecessitaEquipe;

public class FuncionarioZeladoria extends Pessoa {
	
	private boolean funcionarosDisponiveis;
	private Zeladoria zeladoria;
	private List<Equipe> equipe = new ArrayList<>();
	private List <RelatarProblema> relatarProblema = new ArrayList<>();
	
	public FuncionarioZeladoria(String nome, String cpf, String email, Zeladoria zeladoria) {
		super(nome, cpf, email);
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.zeladoria = zeladoria;
	}
	
	public boolean EquipeResponsavelConserto(Zeladoria zeladoria) {
		if(zeladoria.isAvisarFuncionarioZelador() == true  && this.funcionarosDisponiveis == true) {
			return true;
		}
		return false;
	}
	
	
	public boolean isFuncionarosDisponiveis() {
		return funcionarosDisponiveis;
	}

	public void setFuncionarosDisponiveis(boolean funcionarosDisponiveis) {
		this.funcionarosDisponiveis = funcionarosDisponiveis;
	}

	public List<RelatarProblema> getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(List<RelatarProblema> relatarProblema) {
		this.relatarProblema = relatarProblema;
	}

	public void addRelatarProblema(RelatarProblema obj) {
		relatarProblema.add(obj);
	}
	
	public void removeRelatarProblema(RelatarProblema obj) {
		relatarProblema.remove(obj);
	}
	
	public Zeladoria getZeladoria() {
		return zeladoria;
	}

	public void setZeladoria(Zeladoria zeladoria) {
		this.zeladoria = zeladoria;
	}

	public List<Equipe> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Equipe> equipe) {
		this.equipe = equipe;
	} 
	
	public void addEquipe(Equipe obj) {		 
		equipe.add(obj);
	}
		
		
	public void removeEquipe(Equipe obj) {
		equipe.remove(obj);
	}
	
	public int countEquipe() {
		return equipe.size();
	}
	
	public Equipe getEquipe(int i) {
		return equipe.get(i);
	}
	
	
	
}
