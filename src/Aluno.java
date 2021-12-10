
public class Aluno extends Pessoa {

	private int codigoAcesso;

	public int getCodigoAcesso() {
		return codigoAcesso;
	}

	public void setCodigoAcesso(int codigoAcesso) {
		if (codigoAcesso > 0)
			this.codigoAcesso = codigoAcesso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [codigoAcesso=");
		builder.append(codigoAcesso);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
