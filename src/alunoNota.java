public class alunoNota extends Aluno {

	private float nota;

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		if (nota > 0)
			this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("alunoNota [nota=");
		builder.append(nota);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
