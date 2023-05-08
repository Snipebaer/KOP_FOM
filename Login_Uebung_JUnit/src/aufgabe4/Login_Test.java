package aufgabe4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class Login_Test {
	
private final PrintStream standardOut = System.out;
private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	@Test
	public void testeAnmeldenSuccess()
	{
		Login l1 = new Login("Max", "1234");
		
		try
		{
			l1.anmelden("Max", "1234");
		}
		catch (Exception ex)
		{
			
		}	
		
		assertEquals("Benutzer [Max] angemeldet", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void testeAnmeldenFailure()
	{
		Login l1 = new Login("Max", "1234");		
		
		try
		{
			l1.anmelden("Max", "wrongPassword");			
			Assert.fail("Should have thrown Exception");			
		}
		catch(Exception ex)
		{
			String expectedMessage = "Benutzername oder Passwort falsch.";
			Assert.assertEquals("Exception must be correct", expectedMessage, ex.getMessage());
		}
	}
	
	@Test
	public void testeAnmeldenBereitsAngemeldet()
	{
		Login l1 = new Login("Max", "1234");
		
		try
		{
			l1.anmelden("Max", "1234");
			l1.anmelden("Max", "1234");	
			
			Assert.fail("Should have thrown Exception");
		}
		catch (Exception ex)
		{
			String expectedMessage = "Benutzer [Max] ist bereits angemeldet.";
			Assert.assertEquals("Exception must be correct", expectedMessage, ex.getMessage());
		}
	}
	
	
	
}
	
	
	
	



