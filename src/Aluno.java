
public class Aluno extends Pessoa {

	private int codigoAcesso;
	private int codigoTurma;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [codigoAcesso=");
		builder.append(codigoAcesso);
		builder.append(", codigoTurma=");
		builder.append(codigoTurma);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
