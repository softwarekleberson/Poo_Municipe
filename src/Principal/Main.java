package Principal;

import Municipio.Equipe;
import Municipio.FuncionarioZeladoria;
import Municipio.Municipe;
import Municipio.Zeladoria;
import Negocio.RelatarProblema;
import ValidacaoDadosNegocio.ExcecaoNaoPodeSerNulo;
import ValidacaoDadosNegocio.ExcecaoTamanhoMinimo;

public class Main {
		public static void main(String[] args) {
			
			Municipe kleberson = new Municipe("kleberosn","400.018.578-30" , "santossilvakleberson@gmail.com");
			System.out.println("Nome municipe : " + kleberson.getNome());
			System.out.println("CPF : " + kleberson.getCpf());
			
			try {
				
				RelatarProblema posteSemLuz = new RelatarProblema("vila da horta", "tres de fevereiro", "170", kleberson, "luz queimada", "xxx");
				kleberson.addRelatarProblea(posteSemLuz);
				System.out.println("Status problema : " + posteSemLuz.isStatusProblema());

			}catch (ExcecaoNaoPodeSerNulo | ExcecaoTamanhoMinimo e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Problema relatado por -> " + kleberson.getNome() + " Tipo de problema : " + kleberson.getRelatarProblema());
			
			Zeladoria zelador = new Zeladoria("Maciel de andrade");
			zelador.addMunicipe(kleberson);
			
			kleberson.avaliarZeladoria(zelador, 8.8);
			System.out.println(zelador.toString());
			
			kleberson.aberturaChamadoConserto(zelador, true);
			
			FuncionarioZeladoria funcionarioConserto = new FuncionarioZeladoria("Andre","135.741.558-40", "andresilva@gmail.com", zelador);
			funcionarioConserto.setFuncionarosDisponiveis(true);
			
			if(funcionarioConserto.EquipeResponsavelConserto(zelador) == true) {
				Equipe equipeK = new Equipe("Pedro");
				
				System.out.println("equipe criada, acessando o local do conserto \n\n");
				System.out.println(equipeK.localDoConserto(kleberson.getRelatarProblema(), 0));
				
				equipeK.solucionarProblema(kleberson, kleberson.getRelatarProblema(), 0, true);
				
								
			}
			
			else {
				System.out.println("não é necessario fazer nada");
			}
			
			
			System.out.println("Status problema se true -> consertou " + kleberson.isConsertou());
			System.out.println(kleberson.toString());
			
				
	}
}
