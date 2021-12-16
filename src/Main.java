import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Carga de dados inicial

		// PROFESSOR

		ListProfessor pr = new ListProfessor();

		Professor prof = new Professor();
		
		prof.setDataNascimento("21/02/2003");
		prof.setNome("João");
		prof.setIdade(21);
		prof.setEndereco("Rua Karl");
		prof.setCpf("096.433.545-88");
		prof.setCodigoAcessoProfessor(1);
		prof.setCodigoTurma(1);
		prof.setCodigoDisciplina(1);
		prof.setSalario(4222);
		prof.setEspecialidade("Matemática");
		
		pr.add(prof);

		pr.gravar();

		pr = new ListProfessor();

		pr.setLista(pr.ler());
	
		prof = new Professor();
		
		prof.setDataNascimento("24/08/2010");
		prof.setNome("Luis");
		prof.setIdade(40);
		prof.setEndereco("Avenida Paulinsta");
		prof.setCpf("016.553.345-83");
		prof.setCodigoAcessoProfessor(2);
		prof.setCodigoTurma(2);
		prof.setCodigoDisciplina(2);
		prof.setSalario(422332);
		prof.setEspecialidade("Portugues");
		
		pr.add(prof);

		pr.gravar();

		pr = new ListProfessor();

		pr.setLista(pr.ler());
		
		prof = new Professor();
		
		prof.setDataNascimento("02/05/2000");
		prof.setNome("Paulo");
		prof.setIdade(33);
		prof.setEndereco("Taio");
		prof.setCpf("323.543.545-83");
		prof.setCodigoAcessoProfessor(3);
		prof.setCodigoTurma(3);
		prof.setCodigoDisciplina(3);
		prof.setSalario(34242);
		prof.setEspecialidade("Ciencia");
		
		pr.add(prof);

		pr.gravar();

		pr = new ListProfessor();

		pr.setLista(pr.ler());

		// Aluno

		ListAluno al = new ListAluno();

		Aluno alun = new Aluno();
		
		alun.setDataNascimento("21/02/1975");
		alun.setNome("Ricardo");
		alun.setIdade(23);
		alun.setEndereco("Timbo");
		alun.setCpf("323.545.657-65");
		alun.setCodigoTurma(1);
		alun.setCodigoDisciplina(1);
		alun.setCodigoAcesso(1);

		al.add(alun);

		al.gravar();

		al.setLista(al.ler());
		
		alun = new Aluno();
		
		alun.setDataNascimento("05/05/1988");
		alun.setNome("Jean");
		alun.setIdade(32);
		alun.setEndereco("Palmeira");
		alun.setCpf("212.766.643-65");
		alun.setCodigoTurma(2);
		alun.setCodigoDisciplina(2);
		alun.setCodigoAcesso(2);

		al.add(alun);

		al.gravar();

		al.setLista(al.ler());
		
		alun = new Aluno();
		
		alun.setDataNascimento("03/09/2000");
		alun.setNome("Carlos");
		alun.setIdade(17);
		alun.setEndereco("Salete");
		alun.setCpf("233.733.333-33");
		alun.setCodigoTurma(3);
		alun.setCodigoDisciplina(3);
		alun.setCodigoAcesso(3);

		al.add(alun);

		al.gravar();

		al.setLista(al.ler());	

		// Turma

		ListTurma tu = new ListTurma();

		Turma tur = new Turma();
		
		tur.setCodigoTurma(1);
		tur.setCodigoDisciplina(1);
		tur.setNomeTurma("3A");
	
		

		tu.add(tur);

		tu.gravar();

		tu = new ListTurma();

		tu.setLista(tu.ler());
		
		
		tur = new Turma();
		
		tur.setCodigoTurma(2);
		tur.setCodigoDisciplina(2);
		tur.setNomeTurma("1b");

		tu.add(tur);

		tu.gravar();

		tu = new ListTurma();

		tu.setLista(tu.ler());
		

		tur = new Turma();
		
		tur.setCodigoTurma(3);
		tur.setCodigoDisciplina(3);
		tur.setNomeTurma("BCC-1");

		tu.add(tur);

		tu.gravar();

		tu = new ListTurma();

		tu.setLista(tu.ler());
		
		// Disciplina

			ListDisciplina di = new ListDisciplina();

			Disciplina dis = new Disciplina();
			
			dis.setCodigoDisciplina(1);
			dis.setDescricao("Matemática");
			
			di.add(dis);

			di.gravar();

			di = new ListDisciplina();

			di.setLista(di.ler());
			
		
			dis = new Disciplina();
			
			dis.setCodigoDisciplina(2);
			dis.setDescricao("Portugues");
			
			di.add(dis);

			di.gravar();

			di = new ListDisciplina();

			di.setLista(di.ler());
			
			dis = new Disciplina();
			
			dis.setCodigoDisciplina(3);
			dis.setDescricao("Ciencia");
			
			di.add(dis);

			di.gravar();

			di = new ListDisciplina();

			di.setLista(di.ler());
		
		
		
		int opcao = 0;
		do {
			System.out.println("\n\n### SISTEMA PARA CONTROLE DE ALUNOS - ADM PROFESSOR ###");
			System.out.println("                   ===============================");
			System.out.println("                  |     1 - Adicionar Aluno       |");
			System.out.println("                  |     2 - Editar Aluno          |");
			System.out.println("                  |     3 - Excluir Aluno         |");
			System.out.println("                  |     4 - Listar Alunos         |");
			System.out.println("                  |     5 - Adicionar Professor   |");
			System.out.println("                  |     6 - Editar Professor      |");
			System.out.println("                  |     7 - Excluir Professor	  |");
			System.out.println("                  |     8 - Listar Professores    |");
			System.out.println("                  |     9 - Adicionar Turma   	  |");
			System.out.println("                  |     10 - Editar Turma         |");
			System.out.println("                  |     11 - Excluir Turma   	  |");
			System.out.println("                  |     12 - Listar Turma    	  |");
			System.out.println("                  |     13 - Adicionar Disciplina |");
			System.out.println("                  |     14 - Editar Disciplina    |");
			System.out.println("                  |     15 - Excluir Disciplina   |");
			System.out.println("                  |     16 - Listar Disciplina    |");
			System.out.println("                  |     0 - Sair                  |");
			System.out.println("                   ===============================");
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
				break;
			case 10:
				tu.alterarTurma(tu);
				break;
			case 11:
				tu.excluiTurma(tu);
				break;
			case 12:
				tu.mostraLista(tu.getLista(), pr.getLista(), al.getLista());
				break;
			case 13:
				di.adicionaDisciplina(di);
				break;
			case 14:
				di.alterarDisciplina(di);
				break;
			case 15:
				di.excluiDisciplina(di);
				break;
			case 16:
				di.mostraLista(di.getLista(),tu.getLista(), pr.getLista(), al.getLista());
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
