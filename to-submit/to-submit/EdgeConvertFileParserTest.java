import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

/**
* This test file contains tests on the remaining files from the finalProjCode, using methods from the already defined classes,
*  and reusing some of them within only the methods that are responsible for file handling.
*/
public class EdgeConvertFileParserTest {
  EdgeConvertFileParser testParser;
  File file = new File("Courses.edg");

  @Before
  public void prepareParser() throws Exception {
    testParser = new EdgeConvertFileParser(file);
  }


  /**
   * Test the testParseEdgeFile() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode
   * This test method will be reused.
   */
  @Test
  public void testParseEdgeFile() {
     try{
       testParser.parseEdgeFile();
       fail(); 
     } catch(Exception e){ 
        assertEquals("File is not readable. Please try again.", e.getMessage());
     }
  }
    
  /**
   * Test the testParseSaveFile() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode
   * This test method will be reused.
   */
  @Test
  public void testParseSaveFile() {
     try{
       testParser.parseSaveFile();
       fail(); 
     } catch(Exception e){ 
        assertEquals("The file you entered cannot be saved. Try a different file.", e.getMessage());
     }
  }

  /**
   * Test the testGetEdgeTables() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode
   * This test method will be reused.
   */
  @Test
  public void testGetEdgeTables() {
     try{
       testParser.getEdgeTables();
       fail();
     }
     catch(Exception e){
       assertEquals("The table is not defined. Please retrieve a different table.", e.getMessage());
     }
  }

  /**
   * Test the testGetEdgeFields() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode
   * This test method will be reused.
   */
  @Test
  public void testGetEdgeFields() {
     try{
       testParser.getEdgeFields();
       fail();
     }
     catch(Exception e){
       assertEquals("There's no such field defined. Please select a different field.", e.getMessage());
     }
  }

  /**
   * Test the openFile() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode.
   */
	  @Test
	  public void test1OpenFile() { 
	     try{
               file = new File("Courses.edg");
	       testParser.openFile(file);
	       fail(); 
	     } catch(Exception e){ 
		assertEquals("File not found, and cannot open. Please use a different file.", e.getMessage());
	     }
	  }

	  @Test
	  public void test2OpenFile() { 
	     try{
               file = new File("CreateDDLMySQL.java");
	       testParser.openFile(file);
	       fail(); 
	     } catch(Exception e){ 
		assertEquals("File not found, and cannot open. Please use a different file.", e.getMessage());
	     }
	  }

	  @Test
	  public void test3OpenFile() { 
	     try{
               file = new File("EdgeConvertCreateDDL.java");
	       testParser.openFile(file);
	       fail(); 
	     } catch(Exception e){ 
		assertEquals("File not found, and cannot open. Please use a different file.", e.getMessage());
	     }
	  }

	  @Test
	  public void test4OpenFile() { 
	     try{
               file = new File("RunEdgeConvert.java");
	       testParser.openFile(file);
	       fail(); 
	     } catch(Exception e){ 
		assertEquals("File not found, and cannot open. Please use a different file.", e.getMessage());
	     }
	  }
}
