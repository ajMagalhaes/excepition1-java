package model.exceptions;

//class serialLisible
/**
 * classes que podem ser convertidas para bytes
 * e assim, podem trafegar em redes, arquivos, etc
 * elas precisam ter uma vers�o
 * 
 * runtimeException - fala que a exce��o nao precisa ser
 * tratada na class principal
**/
public class DomainException extends RuntimeException{

	/**
	 * declarando vers�o da class serial
	 */
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	
}
