package matematica;

public enum Operacao {
	
	// Constantes.
	SOMA("Soma"),
	SUBTRACAO("Subtração"),
	MULTIPLICACAO("Multiplicação"),
	DIVISAO("Divisão");
	
	// Atributo que armazena um char de uma Constante.
	private String s;
	
	// Construtor que recebe um char e o atribui para uma constante.
	private Operacao(String s) {
		this.s = s;
	}
	
	// Método que verifica qual operação foi solicitada e a realiza.
	public  double calcular(double x, double y) {
		if (this == SOMA) {
			return x + y;
		} else if (this == MULTIPLICACAO) {
			return x * y;
		} else if (this == DIVISAO) {
			return x / y;
		} else if (this == SUBTRACAO) {
			return x -y;
		
		// Lança uma exceção caso não seja informado uma das operações fornecidas.	
		} else {
			throw new UnsupportedOperationException("O calculo não pode ser realizado");
		}
	}
	
	// Recebe o char e o transforma em uma String caso se deseja apresentar qual é a operação realizada.
	public String toString() {
		return s;
	}
	
}
