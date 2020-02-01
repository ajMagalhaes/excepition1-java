package model.exceptions;

//class serialLisible
/**
 * classes que podem ser convertidas para bytes
 * e assim, podem trafegar em redes, arquivos, etc
 * elas precisam ter uma versão
 * 
 * runtimeException - fala que a exceção nao precisa ser
 * tratada na class principal
**/
public class DomainException extends RuntimeException{

	/**
	 * declarando versão da class serial
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
