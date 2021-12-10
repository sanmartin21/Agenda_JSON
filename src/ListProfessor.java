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

}