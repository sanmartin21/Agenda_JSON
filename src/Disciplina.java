
public class Disciplina {
	
	private Aluno aluno;
	private Professor p;
	private Turma t; 
	private String descricao;
	private float nota;
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getP() {
		return p;
	}
	public void setP(Professor p) {
		this.p = p;
	}
	public Turma getT() {
		return t;
	}
	public void setT(Turma t) {
		this.t = t;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length()>0)
		this.descricao = descricao;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		if(nota>0)
		this.nota = nota;
	}
	
	int n = 4;
	private int notas[] = new int [n];{
		for (i = 0; i<n; i++) {
			v[i] = i;
	}
	
		
	}
	
	
}

