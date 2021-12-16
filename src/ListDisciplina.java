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
		bufferedReader = new BufferedReader(
						 new FileReader("json/disciplina.json"));
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
    Type listType = new TypeToken<ArrayList<Disciplina>>(){}.getType();
    lista = new ArrayList<Disciplina>();
    lista = new Gson().fromJson(bufferedReader, listType);
    return lista;
}



}