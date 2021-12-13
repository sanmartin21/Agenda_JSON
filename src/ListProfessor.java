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
		bufferedReader = new BufferedReader(
						 new FileReader("json/professor.json"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
    Type listType = new TypeToken<ArrayList<Professor>>(){}.getType();
    lista = new ArrayList<Professor>();
    lista = new Gson().fromJson(bufferedReader, listType);
    return lista;
}

public void mostraLista(){
	System.out.println(ler());
}

public void adicionaProfessor(ListProfessor l){
	Professor a = new Professor();

	Scanner ler = new Scanner(System.in);
	ler.useDelimiter("\n");
	System.out.println("Inclusão de Professor: \n");

	System.out.println("Digite a data de nascimento: (dd/mm/AAAA)");
	a.setDataNascimento(ler.next());

	System.out.println("Digite o nome: ");
	String nome = ler.next();
	a.setNome(nome);

	System.out.println("Digite a idade: ");
	a.setIdade(3);

	System.out.println("Digite o endereço: ");
	a.setEndereco(ler.next());

	System.out.println("Digite o CPF: ");
	a.setCpf(ler.next());

	System.out.println("Digite o código de acesso do Professor: ");
	a.setCodigoProfessor(444);
	
	System.out.println("Digite o salário do Professor: ");
	a.setSalario(5.5);
	
	System.out.println("Digite a especialidade do Professor: ");
	a.setEspecialidade(ler.nextLine());

	l.add(a);
	l.gravar();
	l.setLista(l.ler());
}

	public void excluiProfessor(List<Professor> l){
		Scanner ler = new Scanner(System.in);

		System.out.println("Exclusão de professor: \n");

		System.out.println("Digite o código de acesso do professor que deseja excluir: ");
		Integer cdAcesso = ler.nextInt();

		Professor alEncontrado = null;
		for(Professor professor : l){
			if(professor.getCodigoAcessoProfessor() == cdAcesso){
				alEncontrado = professor;
			}
			else {
				System.out.println("Código de acesso não encontrado!");
			}
		}

		if(alEncontrado != null){
			l.remove(alEncontrado);
			System.out.println("Professor removido com sucesso!");
		}

	}

}