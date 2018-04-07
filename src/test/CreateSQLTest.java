import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Java class that tests the SQL output
 * author: Regina Locicero
 */
public class CreateSQLTest {

    File result;

    @Before
    public void setUp() throws Exception {
        result = null;
    }

    @Test
    public void testFileExists(){
        result = new File("createSQL.txt");
        assertEquals("File should return that it exists", true, result.exists());
    }

    @Test
    public void testTablesExist(){
        boolean tablesExist = false;
        try{
            BufferedReader br = new BufferedReader(new FileReader("createSQL.txt"));  
            String line = null;  
            if((line = br.readLine()) != null){
                tablesExist = true;
            }
        } catch (Exception e){
            System.out.println(e);
        }
        assertEquals("File doesn't show that tables exist", true, tablesExist);
    }

    @Test
    public void testCoursesOk(){
        boolean tableOk = false;
        try{
            BufferedReader br = new BufferedReader(new FileReader("createSQL.txt"));  
            String line = null;  
            while((line = br.readLine()) != null){
                if(line.matches("edgedb\\.courses.*OK")){
                    tableOk = true;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
        assertEquals("Courses table doesn't exist or has an error", true, tableOk);
    }

    @Test
    public void testFacultyOk(){
        boolean tableOk = false;
        try{
            BufferedReader br = new BufferedReader(new FileReader("createSQL.txt"));  
            String line = null;  
            while((line = br.readLine()) != null){
                if(line.matches("edgedb\\.faculty.*OK")){
                    tableOk = true;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
        assertEquals("Faculty table doesn't exist or has an error", true, tableOk);
    }

    @Test
    public void testStudentOk(){
        boolean tableOk = false;
        try{
            BufferedReader br = new BufferedReader(new FileReader("createSQL.txt"));  
            String line = null;  
            while((line = br.readLine()) != null){
                if(line.matches("edgedb\\.student.*OK")){
                    tableOk = true;
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
        assertEquals("Student table doesn't exist or has an error", true, tableOk);
    }
}
