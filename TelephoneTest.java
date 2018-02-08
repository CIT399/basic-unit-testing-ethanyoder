import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestJunit {

   // Creates Telephone object to use for testing
   Telephone tele;

   // These constant fields hold the input and
   // proper output values for testing isFormatted
   private final String testInput1 = "7174443344";
   private final String testInput2 = "(717)4443344";
   private final String testInput3 = "(717)444-3344";
   
   // These functions are used to set up and tear down for the test methods
   @Before
   public void setUp() {
      tele = new Telephone();
   }
   
   @After
   public void tearDown() {
      tele = null;  
   }
  
   // These functions have 3 test cases for the isFormatted method
   @Test
   public void testIsFormatted1() {
      assertFalse(tele.isFormatted(testInput1));
   }
   
   @Test
   public void testIsFormatted2() {
      assertFalse(tele.isFormatted(testInput2));
   }
   
   @Test
   public void testIsFormatted3() {
      assertTrue(tele.isFormatted(testInput3));
   }
 
}
