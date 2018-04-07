import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.fail;
import java.io.*;

/**
 * This test file contains tests on the remaining files from the finalProjCode, using methods from the already defined classes,
 *  and reusing some of them within only the methods that are responsible for file handling.
 */
public class EdgeConvertFileParserTest {
  EdgeConvertFileParser testParser;
  File file;

  @Before
  public void initialize() throws Exception {
    file = new File("createSQL.sql");
    testParser = new EdgeConvertFileParser(file);
  }
  
  public void prepareParser() throws Exception {
    runner();  
  }

  public void runner(){
    testParseEdgeFile();
    testParseSaveFile();
    testGetEdgeTables();
    testGetEdgeFields();
    test1OpenFile();
    test2OpenFile();
    test3OpenFile();
    test4OpenFile();
  }

  /**
   * Test the testParseEdgeFile() method from EdgeConvertFileParser.java file, on 4 of the 5 files from finalProjCode
   * This test method will be reused.
   */
  @Test
  public void testParseEdgeFile() {
     try{
       testParser.parseEdgeFile();
        
     } catch(Exception e){ 
        fail("File is not readable. Please try again.");
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
        
     } catch(Exception e){ 
        fail("The file you entered cannot be saved. Try a different file.");
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
       
     }
     catch(Exception e){
       fail("The table is not defined. Please retrieve a different table.");
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
       
     }
     catch(Exception e){
       fail("There's no such field defined. Please select a different field.");
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
	        
	     } catch(Exception e){ 
		fail("File not found, and cannot open. Please use a different file.");
	     }
	  }

	  @Test
	  public void test2OpenFile() { 
	     try{
               file = new File("CreateDDLMySQL.java");
	       testParser.openFile(file);
	        
	     } catch(Exception e){ 
		fail("File not found, and cannot open. Please use a different file.");
	     }
	  }

	  @Test
	  public void test3OpenFile() { 
	     try{
               file = new File("EdgeConvertCreateDDL.java");
	       testParser.openFile(file);
	        
	     } catch(Exception e){ 
		fail("File not found, and cannot open. Please use a different file.");
	     }
	  }

	  @Test
	  public void test4OpenFile() { 
	     try{
               file = new File("RunEdgeConvert.java");
	       testParser.openFile(file);
	        
	     } catch(Exception e){ 
		fail("File not found, and cannot open. Please use a different file.");
	     }
	  }
}
