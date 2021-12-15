import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class ListProfessor {

	private List<Professor> lista = new ArrayList<Professor>();

	public List<Professor> getLista() {
		return lista;
	}

	public void setLista(List<Professor> lista) {
		this.lista = lista;
	}

	public void add(Professor professor) {
		lista.add(professor);
	}

	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("json/professor.json");
			writer.write(gson.toJson(lista));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Professor> ler() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("json/professor.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Type listType = new TypeToken<ArrayList<Professor>>() {
		}.getType();
		lista = new ArrayList<Professor>();
		lista = new Gson().fromJson(bufferedReader, listType);
		return lista;
	}

	public void mostraLista() {
		System.out.println(ler());
	}

	public void adicionaProfessor(ListProfessor l) {
		Professor p = new Professor();

		Scanner ler = new Scanner(System.in);

		System.out.println("Inclus�o de Professor: \n");

		System.out.println("Digite a data de nascimento: (dd/mm/AAAA)");
		p.setDataNascimento(ler.next());

		System.out.println("Digite o nome: ");
		p.setNome(ler.next());

		System.out.println("Digite a idade: ");
		p.setIdade(ler.nextInt());

		System.out.println("Digite o endere�o: ");
		p.setEndereco(ler.next());

		System.out.println("Digite o CPF: ");
		p.setCpf(ler.next());

		System.out.println("Digite o c�digo de acesso do Professor: ");
		p.setCodigoProfessor(ler.nextInt());

		System.out.println("Digite o c�digo da Turma: ");
		p.setCodigoTurma(ler.nextInt());

		System.out.println("Digite o sal�rio do Professor: ");
		p.setSalario(ler.nextDouble());

		System.out.println("Digite a especialidade do Professor: ");
		p.setEspecialidade(ler.next());

		l.add(p);
		l.gravar();
		l.setLista(l.ler());
	}

	public void excluiProfessor(ListProfessor l) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Exclus�o de professor: \n");

		System.out.println("Digite o c�digo de acesso do professor que deseja excluir: ");
		Integer cdAcesso = ler.nextInt();

		Professor prEncontrado = null;
		for (Professor professor : l.getLista()) {
			if (professor.getCodigoAcessoProfessor() == cdAcesso) {
				prEncontrado = professor;
			} else {
				System.out.println("C�digo de acesso n�o encontrado!");
			}

			if (prEncontrado != null) {
				l.getLista().remove(prEncontrado);
				l.gravar();
				System.out.println("Professor removido com sucesso!");
			}
		}
	}

	public void alterarProfessor(ListProfessor l) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Altera��o de Professor: \n");

		System.out.println("Digite o c�digo de acesso do professor que deseja alterar: ");
		Integer cdAcesso = ler.nextInt();

		Professor prEncontrado = null;
		for (Professor professor : l.getLista()) {
			if (professor.getCodigoAcessoProfessor() == cdAcesso) {
				prEncontrado = professor;

				System.out.println("Digite a nova data de nascimento: (dd/mm/AAAA)");
				professor.setDataNascimento(ler.next());

				System.out.println("Digite o novo nome: ");
				professor.setNome(ler.next());

				System.out.println("Digite a nova idade: ");
				professor.setIdade(ler.nextInt());

				System.out.println("Digite o novo endere�o: ");
				professor.setEndereco(ler.next());

				System.out.println("Digite o novo CPF: ");
				professor.setCpf(ler.next());

				/*System.out.println("Digite o novo c�digo de acesso do Professor: ");
				professor.setCodigoProfessor(ler.nextInt());*/

				System.out.println("Digite o novo c�digo da Turma: ");
				professor.setCodigoTurma(ler.nextInt());

				System.out.println("Digite o novo sal�rio do Professor: ");
				professor.setSalario(ler.nextDouble());

				System.out.println("Digite a nova especialidade do Professor: ");
				professor.setEspecialidade(ler.next());

			} else {
				System.out.println("C�digo de acesso n�o encontrado!");

			}
			if (prEncontrado != null) {
				l.gravar();
				System.out.println("Professor alterado com sucesso!");

			}

		}
	}
}