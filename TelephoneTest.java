import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

   // Creates Telephone object to use for testing
   Telephone tele = new Telephone();

   // These constant fields hold the input and
   // proper output values for testing isFormatted
   private final String testInput1 = "7174443344";
   private final String testInput2 = "(717)4443344";
   private final String testInput3 = "(717)444-3344";
   private final boolean testOutput1 = false;
   private final boolean testOutput2 = false;
   private final boolean testOutput3 = true;
  
   //this function has 3 test cases for the isFormatted method
   @Test
   public void testIsFormatted() {
      assertEquals(tele.isFormatted(testInput1), testOutput1);
      assertEquals(tele.isFormatted(testInput2), testOutput2);
      assertEquals(tele.isFormatted(testInput3), testOutput3);
   }
 
}
