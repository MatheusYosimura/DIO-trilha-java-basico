
public class ParametrosInvalidosException extends RuntimeException{
	public ParametrosInvalidosException() {
	}
	public void mostrarMensagem() {
		System.out.println("O segundo parâmetro deve ser maior que o primeiro");
	}
}
