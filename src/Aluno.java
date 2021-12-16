
public class Aluno extends Pessoa {

	private int codigoAcesso;
	private int codigoTurma;
	private int codigoDisciplina;

	public int getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(int codigoAcesso) {
		if (codigoAcesso > 0)
			this.codigoAcesso = codigoAcesso;
	}

	public int getCodigoTurma() {
		return codigoTurma;
	}

	public void setCodigoTurma(int codigoTurma) {
		if (codigoTurma > 0)
			this.codigoTurma = codigoTurma;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		if (codigoDisciplina > 0)
			this.codigoDisciplina = codigoDisciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [codigoAcesso=");
		builder.append(codigoAcesso);
		builder.append(", codigoTurma=");
		builder.append(codigoTurma);
		builder.append(", codigoDisciplina=");
		builder.append(codigoDisciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
