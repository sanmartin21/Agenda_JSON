import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ListPessoa {

	private List<Pessoa> lista = new ArrayList<Pessoa>();

	public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public void add(Pessoa pessoa) {
		lista.add(pessoa);
	}


	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/pessoa.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Pessoa> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/pessoa.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Pessoa>>(){}.getType();
	    lista = new ArrayList<Pessoa>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

	public void mostraLista(){
		System.out.println(ler());
	}

	public void adicionaALuno(ListPessoa l){
		Pessoa a = new Pessoa();

		Scanner ler = new Scanner(System.in);
		ler.useDelimiter("\n");
		System.out.println("Inclusão de pessoa: \n");

		System.out.println("Digite a data de nascimento: (dd/mm/AAAA)");
		a.setDataNascimento(ler.next());

		System.out.println("Digite o nome: ");
		a.setNome(ler.next());

		System.out.println("Digite a idade: ");
		a.setIdade(ler.nextInt());

		System.out.println("Digite o endereço: ");
		a.setEndereco(ler.next());

		System.out.println("Digite o CPF: ");
		a.setCpf(ler.next());

		l.add(a);
		l.gravar();
		l.setLista(l.ler());
		}

	}