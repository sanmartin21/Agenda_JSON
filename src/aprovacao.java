
public enum aprovacao {
	
	Aprovado(1), Reprovado(2), Exame(3);

	
	private final int valor;
	
	aprovacao(int aprovacao) {
		valor = aprovacao;
	}
	
	public int getValor() {
		return valor;
	}
	
}
