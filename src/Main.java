import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Carga de dados inicial

		ListPessoa l = new ListPessoa();

		Pessoa pes = new Pessoa();
		pes.setDataNascimento("21/02/2003");
		pes.setNome("Joao Vitor");
		pes.setIdade(18);
		pes.setEndereco("Rua Karl Schott");
		pes.setCpf("095.434.544-89");
		l.add(pes);

		l.gravar();
		l.setLista(l.ler());


		pes = new Pessoa();
		pes.setDataNascimento("26/07/2009");
		pes.setNome("Carlos");
		pes.setIdade(40);
		pes.setEndereco("Rua Conceicao");
		pes.setCpf("565.444.543-32");
		l.add(pes);

		l.gravar();

		l = new ListPessoa();

		l.setLista(l.ler());

		// PROFESSOR

		ListProfessor pr = new ListProfessor();

		Professor prof = new Professor();
		prof.setDataNascimento("26/07/2009");
		prof.setNome("Carlos");
		prof.setIdade(40);
		prof.setEndereco("Rua Conceicao");
		prof.setCpf("565.444.543-32");
		prof.setSalario(1500);
		prof.setEspecialidade("Matemática");
		prof.setCodigoProfessor(8486);
		pr.add(prof);

		pr.gravar();

		pr = new ListProfessor();

		pr.setLista(pr.ler());

		for (Professor j : pr.getLista()) {
			//System.out.println(j);
		}

		// Aluno

		ListAluno al = new ListAluno();

		Aluno alun = new Aluno();
		alun.setDataNascimento("21/02/2003");
		alun.setNome("Joao Vitor");
		alun.setIdade(18);
		alun.setEndereco("Rua Karl Schott");
		alun.setCpf("095.434.544-89");
		alun.setCodigoAcesso(1500);

		al.add(alun);

		al.gravar();

		al.setLista(al.ler());

		for (Aluno s : al.getLista()) {
			//System.out.println(s);
		}
		
		
		// Turma
		
		ListTurma tu = new ListTurma();

		Turma tur = new Turma();
		tur.setNomeTurma("2A");
		tur.setQuantidadeAlunos(40);
		tur.professor = prof;
		tur.aluno = alun;
		
		tu.add(tur);

		tu.gravar();

		tu = new ListTurma();

		tu.setLista(tu.ler());

		for (Turma t : tu.getLista()) {
			//System.out.println(t);
		}



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
			System.out.print("\n");
			switch (opcao) {
				case 1:
					al.adicionaAluno(al);
					break;
				case 2:
					break;
				case 3:
					al.excluiAluno(al.getLista());
					break;
				case 4:
					al.mostraLista();
					break;
				case 5:
					pr.adicionaProfessor(pr);
					break;
				case 6:
					break;
				case 7:
					pr.excluiProfessor(pr.getLista());
					break;
				case 8:
					pr.mostraLista();
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
