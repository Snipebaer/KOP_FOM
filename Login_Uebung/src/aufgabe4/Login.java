package aufgabe4;

public class Login {
	
	private boolean angemeldet;
	private String benutzer;
	private String passwort;
	
	public Login(String benutzer, String passwort)
	{
		this.benutzer = benutzer;
		this.passwort = passwort;
	}
	
	
	public void anmelden(String benutzer, String passwort) throws ZugriffUngueltigException
	{
		if(angemeldet)
		{
			throw new ZugriffUngueltigException("Benutzer [" + this.benutzer + "] ist bereits angemeldet.");
		}
		
		if(benutzer != this.benutzer || passwort != this.passwort)
		{
			throw new ZugriffUngueltigException("Benutzername oder Passwort falsch.");
		}
		
		this.angemeldet = true;
		
		System.out.println("Benutzer [" + this.benutzer + "] angemeldet");
	}
	
	public void abmelden() throws ZugriffUngueltigException
	{
		if(!angemeldet)
		{
			throw new ZugriffUngueltigException("Sie sind bereits abgemeldet.");
		}
		
		this.angemeldet = false;
		
		System.out.println("Benutzer [" + this.benutzer + "] erfolgreich abgemeldet.");
	}
	
	public void bearbeiten() throws KeineBerechtigungException
	{
		if(!angemeldet)
		{
			throw new KeineBerechtigungException("Kein Benutzer angemeldet. Es kann nicht bearbeitet werden.");
		}
		
		System.out.println("Doing things......");
	}

}
