package streamingexception;

public class CardNotWorkingException extends Exception {
	String mes;
	public CardNotWorkingException ( String unchecked_exception )
	{
		this.mes = unchecked_exception;
	}
	public String toString () {
		return this.mes;
	}
}
