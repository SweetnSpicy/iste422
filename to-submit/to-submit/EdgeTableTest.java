import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * Java class that tests the EdgeTable class
 * author: Regina Locicero
 */
public class EdgeTableTest {
    EdgeTable defaultTest;
    EdgeTable negativeTest;

    @Before
    public void setUp() throws Exception {
        defaultTest = new EdgeTable("13|COURSES");
        negativeTest = new EdgeTable("-1|COURSES");
        runner();
    }

    public void runner(){
    }

    @Test
    public void testGetNumFigure(){
        assertEquals("Num Figure was initialized at 13 should be 13", 13, defaultTest.getNumFigure());
    }

    @Test
    public void testGetName(){
        assertEquals("Name initialized to COURSES, so should say COUSES", "COURSES", defaultTest.getName());
    }

    /*
     * Note this test should fail becuase the code just assumes the given input is correct
     * You should not be able to input a negative number of figures, that's impossible
     * This should be fixed in the future
     */
    @Test
    public void testGetNumFigureNeg(){
        assertEquals("Should be able to handle negative input for num Figure, should convert to zero", 0, negativeTest.getNumFigure());
    }

    @Test
    public void testGetRelatedTablesArrayEmpty(){
        assertEquals("Should be initialized to null", null, defaultTest.getRelatedTablesArray());
    }

    @Test
    public void testGetRelatedFieldsArrayEmpty(){
        assertEquals("Should be initialized to null", null, defaultTest.getRelatedFieldsArray());
    }

    @Test
    public void testGetNativeFieldsArrayEmpty(){
        assertEquals("Should be initialized to null", null, defaultTest.getNativeFieldsArray());
    }


    /*
     * Notes although this test passes we have to call the makeArrays function, this is inefficient
     * The call should be done inside of addRelatedTables or those arrays should be altered so that you don't have to do the conversion in makeArrays()
     */
    @Test
    public void testAddRelatedTable(){
        defaultTest.addRelatedTable(1);
        defaultTest.makeArrays();
        int [] relTables = defaultTest.getRelatedTablesArray();
        assertEquals("Should have added table 1 to the Related Tables Array", 1, relTables[0]);
    }

    @Test
    public void testAddNativeField(){
        defaultTest.addNativeField(1);
        defaultTest.makeArrays();
        int [] nativeTables = defaultTest.getNativeFieldsArray();
        assertEquals("Should have added 1 to the array", 1, nativeTables[0]);
    }

    /*
     * Note this failed, the makeArray overrides the setRelatedField
     * I believe refactoring the array system would get rid of this problem.
     */
    @Test
    public void testSetRelatedField(){
        defaultTest.setRelatedField(0,10);
        int [] relatedFields = defaultTest.getRelatedFieldsArray();
        assertEquals("Should have set the 0 index of related fields to 10", 10, relatedFields[0]);
    }

    /*
     * Fails needs to be fixed along with the other array issues
     */
    @Test
    public void testMoveFieldUp(){
        defaultTest = new EdgeTable("13|COURSES");
        defaultTest.addRelatedTable(1);
        defaultTest.addNativeField(1);
        defaultTest.addRelatedTable(2);
        defaultTest.addNativeField(2);
        defaultTest.makeArrays();
        defaultTest.moveFieldUp(1);
        int [] aray = defaultTest.getRelatedFieldsArray();
        assertEquals("Should have returned the field we just made, 2", 2, aray[0]);
    }
    
    /*
     * Fails needs to be fixed along with the other array issues
     */
    @Test
    public void testMoveFieldDown(){
        defaultTest = new EdgeTable("13|COURSES");
        defaultTest.addRelatedTable(1);
        defaultTest.addNativeField(1);
        defaultTest.addRelatedTable(2);
        defaultTest.addNativeField(2);
        defaultTest.makeArrays();
        defaultTest.moveFieldDown(0);
        int [] aray = defaultTest.getRelatedFieldsArray();
        assertEquals("Should have returned the field we just made, 2", 2, aray[0]);
    }
}

