package matematica;

public enum Operacao {
	
	// Constantes.
	SOMA("Soma"),
	SUBTRACAO("Subtra��o"),
	MULTIPLICACAO("Multiplica��o"),
	DIVISAO("Divis�o");
	
	// Atributo que armazena um char de uma Constante.
	private String s;
	
	// Construtor que recebe um char e o atribui para uma constante.
	private Operacao(String s) {
		this.s = s;
	}
	
	// M�todo que verifica qual opera��o foi solicitada e a realiza.
	public  double calcular(double x, double y) {
		if (this == SOMA) {
			return x + y;
		} else if (this == MULTIPLICACAO) {
			return x * y;
		} else if (this == DIVISAO) {
			return x / y;
		} else if (this == SUBTRACAO) {
			return x -y;
		
		// Lan�a uma exce��o caso n�o seja informado uma das opera��es fornecidas.	
		} else {
			throw new UnsupportedOperationException("O calculo n�o pode ser realizado");
		}
	}
	
	// Recebe o char e o transforma em uma String caso se deseja apresentar qual � a opera��o realizada.
	public String toString() {
		return s;
	}
	
}
