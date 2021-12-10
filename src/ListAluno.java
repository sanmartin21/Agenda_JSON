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
		bufferedReader = new BufferedReader(
						 new FileReader("json/aluno.json"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
    Type listType = new TypeToken<ArrayList<Aluno>>(){}.getType();
    lista = new ArrayList<Aluno>();
    lista = new Gson().fromJson(bufferedReader, listType);
    return lista;
}

}