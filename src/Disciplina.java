public class Disciplina {

	private String descricao;
	private Aluno aluno;
	private Professor professor;
	private Turma turma;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 0)
			this.descricao = descricao;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [descricao=");
		builder.append(descricao);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", turma=");
		builder.append(turma);
		builder.append("]");
		return builder.toString();
	}

}
