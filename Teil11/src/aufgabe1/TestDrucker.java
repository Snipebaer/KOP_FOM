package aufgabe1;

public class TestDrucker
{
   public static void main (String[] args)
   {
      LaserDrucker laser1 = new LaserDrucker();
      TintenstrahlDrucker tinten1 = new TintenstrahlDrucker();
      LaserDrucker laser2 = new LaserDrucker();
      
      try
      {
    	  laser1.druckerEinschalten();
    	  laser2.druckerEinschalten();
    	  tinten1.druckerEinschalten();
    	  
    	  laser1.testAusdruck();
          tinten1.testAusdruck();
          laser2.testAusdruck();
          
          laser1.drucken("Hallo, dies ist mein Text für Laser 1!");
          tinten1.drucken("Hallo dies ist mein Text für Tinti!");
          laser2.drucken("Hallo dies ist mein Text für Laser 2!");
      }
      catch(Exception ex)
      {
    	  System.out.println(ex.getMessage());
      }
      
      
     
   }
}
