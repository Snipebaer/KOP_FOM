package aufgabe3;

public class TestDrucker
{
   public static void main (String[] args)
   {
      LaserDrucker laser1 = new LaserDrucker();
      TintenstrahlDrucker tinten1 = new TintenstrahlDrucker();
      LaserDrucker laser2 = new LaserDrucker();
      MultifunktionsGeraet multi1 = new MultifunktionsGeraet();
      
      Drucker[] alleDrucker = new Drucker[4];
      alleDrucker[0] = laser1;
      alleDrucker[1] = tinten1;
      alleDrucker[2] = laser2;
      alleDrucker[3] = multi1;
      
      
     
//	 for(Drucker drucker : alleDrucker)
//	 {
//		 try
//		 {
////			 drucker.druckerEinschalten();
//			 drucker.testAusdruck();
//		 }
//		 catch(Exception ex)
//		 {
//			 System.out.println(ex.getMessage());
//		 }
//	 }
      try
      {
    	    Scanner scan = (Scanner) alleDrucker[3];
    	    System.out.println(scan.alsTextScannen()); 
      }
      catch (Exception ex)
      {
    	  System.out.println(ex.getMessage());
      }
  
    
      
      
     
   }
}
