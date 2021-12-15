public class Turma {
	private String nomeTurma;
	private int codigoTurma;
	protected Professor professor;
	protected Aluno aluno;

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		if (nomeTurma.length() > 0)
			this.nomeTurma = nomeTurma;
	}

	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		if (codigoTurma > 0)
			this.codigoTurma = codigoTurma;
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
		builder.append(", codigoTurma=");
		builder.append(codigoTurma);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append("]");
		return builder.toString();
	}

}
