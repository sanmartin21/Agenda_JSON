public class Main {

	public static void main(String[] args) {

		ListPessoa l = new ListPessoa();

		Pessoa pes = new Pessoa();
		pes.setDataNascimento("21/02/2003");
		pes.setNome("Joao Vitor");
		pes.setIdade(18);
		pes.setEndereco("Rua Karl Schott");
		pes.setCpf("095.434.544-89");
		l.add(pes);

		l.gravar();

		l = new ListPessoa();

		l.setLista(l.ler());

		for (Pessoa p : l.getLista()) {
			System.out.println(p);
		}
		
		ListPessoa l2 = new ListPessoa();

		Pessoa pes2 = new Pessoa();
		pes2.setDataNascimento("26/07/2009");
		pes2.setNome("Carlos");
		pes2.setIdade(40);
		pes2.setEndereco("Rua Conceicao");
		pes2.setCpf("565.444.543-32");
		l2.add(pes2);

		l2.gravar();

		l2 = new ListPessoa();

		l2.setLista(l2.ler());

		for (Pessoa p : l2.getLista()) {
			System.out.println(p);
		}

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
			System.out.println(j);
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

		al = new ListAluno();

		al.setLista(al.ler());

		for (Aluno s : al.getLista()) {
			System.out.println(s);
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
			System.out.println(t);
		}
		
		

	}
}
