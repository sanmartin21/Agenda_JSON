
public class Turma {
	private String nomeTurma;
	private int quantidadeAlunos;
	protected Professor professor;
	protected Aluno aluno;

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		if (nomeTurma.length() > 0)
			this.nomeTurma = nomeTurma;
	}

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		if (quantidadeAlunos > 0)
			this.quantidadeAlunos = quantidadeAlunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Turma [nomeTurma=");
		builder.append(nomeTurma);
		builder.append(", quantidadeAlunos=");
		builder.append(quantidadeAlunos);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append("]");
		return builder.toString();
	}

}
