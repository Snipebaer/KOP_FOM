package aufgabe4;

public class KeineBerechtigungException extends Exception{
	
	public KeineBerechtigungException(String errorMessage)
	{
		super(errorMessage);
	}

}