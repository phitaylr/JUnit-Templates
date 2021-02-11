import java.io.*;
import java.lang.reflect.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

// Replace All "TEMPLATE" "LabClassName"
public class TEMPLATETest {

   private static TEMPLATE tester = null;
   private static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
   private static PrintStream systemOut = System.out;
   private static String log="";
   private static boolean debug=false;


   @Before  //runs before every test
     public void setupBeforeEachTest() throws Exception {
      System.setOut(new PrintStream(outContent));
      tester = new TEMPLATE();
   }
   
   @After   //runs after every test
   public  void tearDownAfterEachTest() throws Exception {
      System.setOut(systemOut);
   }

      
   @Test   //Default Test
   public void testOne() throws Exception{
      assertTrue("Default test; replace!", false);
   }
     
   // Run after all tests complete         
   @AfterClass 
   public static void runafter(){
      System.out.println("\n"+tester.getClass());
      System.out.println("\nUser:\t\t\t" + System.getProperty("user.name"));
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime now = LocalDateTime.now();   
   
      System.out.println("Time:\t\t\t" + dtf.format(now));
      System.out.println("Dir:\t\t\t" + System.getProperty("user.dir"));
      System.out.println("JAVAHome:\t" + System.getProperty("java.home"));
      System.out.println("JAVA Ven:\t" + System.getProperty("java.vendor"));
      System.out.println("OS Arch:\t\t" + System.getProperty("os.arch"));
      System.out.println("OS Name:\t\t" + System.getProperty("os.name"));
      
      if(debug)
         System.out.println(log);
   }
   
   //Run the main method and return output from stdout
   public static String runMain(){
      return runMain("");
   }
   
   //Run the main method, sending input to stdin, and return output from stdout
   public static String runMain(String input){
      System.setIn(new ByteArrayInputStream(input.getBytes()));
      
       // set stdout
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      System.setOut(ps);
      
      tester.main(null);
      return baos.toString();
   
   }


}