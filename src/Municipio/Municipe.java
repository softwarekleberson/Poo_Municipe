package Municipio;
import java.util.ArrayList;
import java.util.List;

import Negocio.RelatarProblema;
import Pessoa.Pessoa;
import ValidacaoDadosNegocio.ExcecaoNaoPodeSerNulo;
import ValidacaoDadosNegocio.ExcecaoTamanhoMinimo;

public class Municipe extends Pessoa {
	
	private String historicoSolicitacao;
	private boolean consertou = false;
	private Zeladoria zeladoria;
	private List<RelatarProblema>relatarProblema = new ArrayList<>();

	public Municipe(String nome, String cpf, String email) {
		super(nome, cpf, email);
		
	}
	

	public void avaliarZeladoria(Zeladoria zeladoria, double avalicao) {
		zeladoria.setAvaliacao(avalicao);
	}
	
	public void aberturaChamadoConserto(Zeladoria zeladoria, boolean aberturaChamada) {
		if(aberturaChamada == true) {
			zeladoria.setAvisarFuncionarioZelador(true);

		}
	}
	
	
	public boolean isConsertou() {
		return consertou;
	}

	public void setConsertou(boolean consertou) {
		this.consertou = consertou;
	}

	
	public String getHistoricoSolicitacao() {
		return historicoSolicitacao;
	}

	public void setHistoricoSolicitacao(String historicoSolicitacao) {
		this.historicoSolicitacao = historicoSolicitacao;
	}
	
	public Zeladoria getZeladoria() {
		return zeladoria;
	}
	
	public void setZeladoria(Zeladoria zeladoria) {
		this.zeladoria = zeladoria;
	}

	public void addRelatarProblea(RelatarProblema obj) {
		relatarProblema.add(obj);
	}	
	
	public void removeRelatarPrblema(RelatarProblema obj) {
		relatarProblema.add(obj);
	}

	public List<RelatarProblema> getRelatarProblema() {
		return relatarProblema;
	}

	public void setRelatarProblema(List<RelatarProblema> relatarProblema) {
		this.relatarProblema = relatarProblema;
	}


	@Override
	public String toString() {
		return "Municipe [historicoSolicitacao=" + historicoSolicitacao + ", consertou=" + consertou + ", zeladoria="
				+ zeladoria + ", relatarProblema=" + relatarProblema + "]";
	}


	
}
