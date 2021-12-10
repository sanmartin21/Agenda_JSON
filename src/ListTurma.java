import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
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

}