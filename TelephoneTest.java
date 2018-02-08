import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestJunit {

   // Creates Telephone object to use for testing
   Telephone tele = new Telephone();

   // These constant fields hold the input and
   // proper output values for testing isFormatted
   private final String testInput1 = "7174443344";
   private final String testInput2 = "(717)4443344";
   private final String testInput3 = "(717)444-3344";
  
   //this function has 3 test cases for the isFormatted method
   @Test
   public void testIsFormatted() {
      assertFalse(tele.isFormatted(testInput1));
      assertFalse(tele.isFormatted(testInput2));
      assertTrue(tele.isFormatted(testInput3));
   }
 
}
