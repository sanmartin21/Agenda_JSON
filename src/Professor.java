public class Professor extends Pessoa {
	private int codigoAcessoProfessor;
	private String especialidade;
	private double salario;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if (especialidade.length() > 0)
			this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0)
			this.salario = salario;
	}

	public int getCodigoAcessoProfessor() {
		return codigoAcessoProfessor;
	}

	public void setCodigoProfessor(int codigoAcessoProfessor) {
		if (codigoAcessoProfessor > 0)
			this.codigoAcessoProfessor = codigoAcessoProfessor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [codigoProfessor=");
		builder.append(codigoAcessoProfessor);
		builder.append(", especialidade=");
		builder.append(especialidade);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
