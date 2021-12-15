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

public class ListAluno {

	private List<Aluno> lista = new ArrayList<Aluno>();

	public List<Aluno> getLista() {
		return lista;
	}

	public void setLista(List<Aluno> lista) {
		this.lista = lista;
	}

	public void add(Aluno aluno) {
		lista.add(aluno);
	}

	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("json/aluno.json");
			writer.write(gson.toJson(lista));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Aluno> ler() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("json/aluno.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Type listType = new TypeToken<ArrayList<Aluno>>() {
		}.getType();
		lista = new ArrayList<Aluno>();
		lista = new Gson().fromJson(bufferedReader, listType);
		return lista;
	}

	public void mostraLista() {
		System.out.println(ler());
	}

	public void adicionaAluno(ListAluno l) {
		Aluno a = new Aluno();

		Scanner ler = new Scanner(System.in);


		System.out.println("Inclus�o de aluno: \n");

		System.out.println("Digite a data de nascimento: (dd/mm/AAAA)");
		a.setDataNascimento(ler.next());

		System.out.println("Digite o nome: ");
		a.setNome(ler.next());

		System.out.println("Digite a idade: ");
		a.setIdade(ler.nextInt());

		System.out.println("Digite o endere�o: ");
		a.setEndereco(ler.next());

		System.out.println("Digite o CPF: ");
		a.setCpf(ler.next());

		System.out.println("Digite o c�digo da Turma: ");
		a.setCodigoTurma(ler.nextInt());

		System.out.println("Digite o c�digo de acesso: ");
		a.setCodigoAcesso(ler.nextInt());

		l.add(a);
		l.gravar();
		l.setLista(l.ler());
	}

	public void excluiAluno(ListAluno l) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Exclus�o de aluno: \n");

		System.out.println("Digite o c�digo de acesso do aluno que deseja excluir: ");
		Integer cdAcesso = ler.nextInt();

		Aluno alEncontrado = null;
		for (Aluno aluno : l.getLista()) {
			if (aluno.getCodigoAcesso() == cdAcesso) {
				alEncontrado = aluno;
			} else {
				System.out.println("C�digo de acesso n�o encontrado!");
			}
		}

		if (alEncontrado != null) {
			l.getLista().remove(alEncontrado);
			l.gravar();
			System.out.println("Aluno removido com sucesso!");
		}
	}

	public void alterarAluno(ListAluno l) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Altera��o de aluno: \n");

		System.out.println("Digite o c�digo de acesso do aluno que deseja alterar: ");
		Integer cdAcesso = ler.nextInt();

		Aluno alEncontrado = null;
		for (Aluno aluno : l.getLista()) {
			if (aluno.getCodigoAcesso() == cdAcesso) {
				alEncontrado = aluno;
				
				System.out.println("Digite a nova data de nascimento: (dd/mm/AAAA)");
				aluno.setDataNascimento(ler.next());

				System.out.println("Digite o novo nome: ");
				aluno.setNome(ler.next());

				System.out.println("Digite a nova idade: ");
				aluno.setIdade(ler.nextInt());

				System.out.println("Digite o novo endere�o: ");
				aluno.setEndereco(ler.next());

				System.out.println("Digite o novo CPF: ");
				aluno.setCpf(ler.next());

				/*System.out.println("Digite o novo c�digo da Turma: ");
				aluno.setCodigoTurma(ler.nextInt());

				System.out.println("Digite o novo c�digo de acesso: ");
				aluno.setCodigoAcesso(ler.nextInt());*/

			} else {
				System.out.println("C�digo de acesso n�o encontrado!");

			}
			if (alEncontrado != null) {
				l.gravar();
				System.out.println("Aluno alterado com sucesso!");
			}
		}
	}
}
