import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Carga de dados inicial

		// PROFESSOR

		ListProfessor pr = new ListProfessor();

		/*Professor prof = new Professor();

		pr.add(prof);

		pr.gravar();

		pr = new ListProfessor();

		pr.setLista(pr.ler());*/

		// Aluno

		ListAluno al = new ListAluno();

		/*Aluno alun = new Aluno();

		al.add(alun);

		al.gravar();

		al.setLista(al.ler());*/

		// Turma

		ListTurma tu = new ListTurma();

		/*Turma tur = new Turma();

		tu.add(tur);

		tu.gravar();

		tu = new ListTurma();

		tu.setLista(tu.ler());*/

		int opcao = 0;
		do {
			System.out.println("\n\n### SISTEMA PARA CONTROLE DE ALUNOS ###");
			System.out.println("\n                   ===============================");
			System.out.println("                  |     1 - Adicionar Aluno       |");
			System.out.println("                  |     2 - Editar Aluno	  |");
			System.out.println("                  |     3 - Excluir Aluno         |");
			System.out.println("                  |     4 - Listar Alunos	  |");
			System.out.println("                  |     5 - Adicionar Professor   |");
			System.out.println("                  |     6 - Editar Professor      |");
			System.out.println("                  |     7 - Excluir Professor	  |");
			System.out.println("                  |     8 - Listar Professores    |");
			System.out.println("                  |     0 - Sair          	  |");
			System.out.println("                   ===============================\n");
			System.out.println("Escolha uma opção -> ");
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				al.adicionaAluno(al);
				break;
			case 2:
				al.alterarAluno(al);
				break;
			case 3:
				al.excluiAluno(al);
				break;
			case 4:
				al.mostraLista();
				break;
			case 5:
				pr.adicionaProfessor(pr);
				break;
			case 6:
				pr.alterarProfessor(pr);
				break;
			case 7:
				pr.excluiProfessor(pr);
				break;
			case 8:
				pr.mostraLista();
				break;
			case 9:
				tu.adicionaTurma(tu);
			case 10:
				tu.mostraLista(tu.getLista(), pr.getLista(), al.getLista());
				break;
			case 11:
				//tu.excluiTurma(tu.getLista());
				break;
				
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);

	}
}
