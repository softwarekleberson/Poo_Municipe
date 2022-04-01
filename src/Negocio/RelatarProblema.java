package Negocio;
import java.util.ArrayList;
import java.util.List;

import Endereco.Endereco;
import Municipio.Equipe;
import Municipio.FuncionarioZeladoria;
import Municipio.Municipe;
import ValidacaoDadosNegocio.ExcecaoNaoPodeSerNulo;
import ValidacaoDadosNegocio.ExcecaoTamanhoMinimo;
import ValidacaoDadosNegocio.Validador;


public class RelatarProblema extends Endereco {
	
	private static final int Tamanho_Minimo_Variavel = 3;
	
	private String tipoProblema;
	private String foto;
	private boolean statusProblema;
	private Municipe municipe;
	private FuncionarioZeladoria funcionarioZeladoria;
	private List<Equipe> equipe = new ArrayList<>();
	
	
	public RelatarProblema(String bairro, String rua, String numero, Municipe municipe, String tipoProblema, String foto) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		super(bairro, rua, numero);
		this.statusProblema = true;
		
		setTipoProblema(tipoProblema);
		setFoto(foto);		
	}
	
	
	public Municipe getMunicipe() {
		return municipe;
	}

	public void setMunicipe(Municipe municipe) {
		this.municipe = municipe;
	}

	public String getTipoProblema() {
		return tipoProblema;
	}
	
	public void setTipoProblema(String tipoProblema) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		Validador.validarNaoNulo(tipoProblema, "tipoProblema");
		this.tipoProblema = Validador.validarTamanhoMinimo(tipoProblema, Tamanho_Minimo_Variavel, "tipoProblema");
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) throws ExcecaoNaoPodeSerNulo, ExcecaoTamanhoMinimo {
		Validador.validarNaoNulo(foto, "foto");
		this.foto = Validador.validarTamanhoMinimo(foto, Tamanho_Minimo_Variavel, "foto");
	}
	
	public boolean isStatusProblema() {
		return statusProblema;
	}


	public void setStatusProblema(boolean statusProblema) {
		this.statusProblema = statusProblema;
	}


	public FuncionarioZeladoria getFuncionarioZeladoria() {
		return funcionarioZeladoria;
	}


	public void setFuncionarioZeladoria(FuncionarioZeladoria funcionarioZeladoria) {
		this.funcionarioZeladoria = funcionarioZeladoria;
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


	@Override
	public String toString() {
		return "RelatarProblema [tipoProblema=" + tipoProblema + ", foto=" + foto + ", status=" + statusProblema + ", municipe="
				+ municipe + "]";
	}
	
	
}
