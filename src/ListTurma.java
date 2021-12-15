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

public class ListTurma {

	private List<Turma> lista = new ArrayList<Turma>();

	public List<Turma> getLista() {
		return lista;
	}

	public void setLista(List<Turma> lista) {
		this.lista = lista;
	}

	public void add(Turma turma) {
		lista.add(turma);
	}

	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		FileWriter writer;
		try {
			writer = new FileWriter("json/turma.json");
			writer.write(gson.toJson(lista));
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Turma> ler() {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("json/turma.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Type listType = new TypeToken<ArrayList<Turma>>() {
		}.getType();
		lista = new ArrayList<Turma>();
		lista = new Gson().fromJson(bufferedReader, listType);
		return lista;
	}

	public void mostraLista(List<Turma> tu, List < Professor> pr, List< Aluno> al) {
		for (Turma t : tu) {
			//System.out.println("turma: ");
			System.out.println(t);
			mostraListaProfessor(t.getCodigoTurma(),pr);
			

		}
		System.out.println(ler());

	}

	public void adicionaTurma(ListTurma tu) {
		Turma t = new Turma();

		Scanner ler = new Scanner(System.in);

		System.out.println("Inclusão de Turma: \n");

		System.out.println("Digite o Código da turma: ");
		t.setCodigoTurma(ler.nextInt());

		System.out.println("Digite o nome da turma:");
		t.setNomeTurma(ler.next());

		tu.add(t);
		tu.gravar();
		tu.setLista(tu.ler());
	}

	public void mostraListaProfessor(int cdTurma, List<Professor> pr){
		//System.out.println("Professores");
		for(Professor p : pr){
			if (p.getCodigoTurma() == cdTurma) {
				System.out.println(p);
			}
	
			
		}
	}

	public void mostraListaAluno(int cdTurma, List<Aluno> l) {
		System.out.println(ler());
	}

	public void excluiProfessor(List<Professor> l) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Exclusão de professor: \n");

		System.out.println("Digite o código de acesso do professor que deseja excluir: ");
		Integer cdAcesso = ler.nextInt();

		Professor alEncontrado = null;
		for (Professor professor : l) {
			if (professor.getCodigoAcessoProfessor() == cdAcesso) {
				alEncontrado = professor;
			} else {
				System.out.println("Código de acesso não encontrado!");
			}
		}

		if (alEncontrado != null) {
			l.remove(alEncontrado);
			System.out.println("Professor removido com sucesso!");
		}

	}

}
