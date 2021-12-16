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

public class ListDisciplina {

	private List<Disciplina> lista = new ArrayList<Disciplina>();

	public List<Disciplina> getLista() {
		return lista;
	}

	public void setLista(List<Disciplina> lista) {
		this.lista = lista;
	}

	public void add(Disciplina disciplina) {
		lista.add(disciplina);
	}

	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("json/disciplina.json");
			writer.write(gson.toJson(lista));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Disciplina> ler() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("json/disciplina.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Type listType = new TypeToken<ArrayList<Disciplina>>() {
		}.getType();
		lista = new ArrayList<Disciplina>();
		lista = new Gson().fromJson(bufferedReader, listType);
		return lista;
	}

	public void mostraLista(List<Disciplina> di, List<Turma> tu, List<Professor> pr, List<Aluno> al) {
		for (Disciplina d : di) {
			System.out.println(d);
			mostraListaProfessor(d.getCodigoDisciplina(), pr);
			mostraListaAluno(d.getCodigoDisciplina(), al);
			mostraListaTurma(d.getCodigoDisciplina(), tu);

		}
		System.out.println(ler());

	}

	public void adicionaDisciplina(ListDisciplina di) {
		Disciplina d = new Disciplina();

		Scanner ler = new Scanner(System.in);

		System.out.println("Inclusão de Turma: \n");

		System.out.println("Digite o Código da disciplina: ");
		d.setCodigoDisciplina(ler.nextInt());

		System.out.println("Digite a descrição da Disciplina:");
		d.setDescricao(ler.next());

		di.add(d);
		di.gravar();
		di.setLista(di.ler());
	}

	public void mostraListaProfessor(int cdDisciplina, List<Professor> pr) {
		for (Professor p : pr) {
			if (p.getCodigoDisciplina() == cdDisciplina) {
				System.out.println(p);
			}

		}
	}

	public void mostraListaAluno(int cdDisciplina, List<Aluno> al) {
		for (Aluno a : al) {
			if (a.getCodigoDisciplina() == cdDisciplina) {
				System.out.println(a);
			}
		}
	}

	public void mostraListaTurma(int cdDisciplina, List<Turma> tu) {
		for (Turma t : tu) {
			if (t.getCodigoDisciplina() == cdDisciplina) {
				System.out.println(t);
			}
		}
	}

	public void excluiDisciplina(ListDisciplina di) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Exclusão de disciplina: \n");

		System.out.println("Digite o código de acesso da disciplina que deseja excluir: ");
		Integer cdAcesso = ler.nextInt();

		Disciplina disciplinaEncontrada = null;
		for (Disciplina disciplina : di.getLista()) {
			if (disciplina.getCodigoDisciplina() == cdAcesso) {
				disciplinaEncontrada = disciplina;
			} else {
				if (disciplinaEncontrada == null)
					System.out.println("Código de acesso não encontrado!");
			}
		}

		if (disciplinaEncontrada != null) {
			System.out.println("Disciplina removida com sucesso!");
			di.getLista().remove(disciplinaEncontrada);
			di.gravar();
		}
	}

	public void alterarDisciplina(ListDisciplina di) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Alteração de Disciplina: \n");

		System.out.println("Digite o código de acesso da disciplina que deseja alterar: ");
		Integer cdAcesso = ler.nextInt();

		Disciplina disciplinaEncontrado = null;
		for (Disciplina disciplina : di.getLista()) {
			if (disciplina.getCodigoDisciplina() == cdAcesso) {
				disciplinaEncontrado = disciplina;

				System.out.println("Digite o novo Código da disciplina: ");
				disciplina.setCodigoDisciplina(ler.nextInt());

				System.out.println("Digite a nova descrição da disciplina:");
				disciplina.setDescricao(ler.next());

			}
		}

		if (disciplinaEncontrado != null) {
			di.gravar();
			System.out.println("Disciplina alterada com sucesso!");
		} else {
		}if (disciplinaEncontrado == null) {
			System.out.println("Código de acesso não encontrado!");
		}

	}
}