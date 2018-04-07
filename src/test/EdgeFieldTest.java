import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest
{
  private EdgeField testObj;
  private Integer numFigure = 5;
  private String name = "Test Edge";
  
  @Before
  public void setUp() throws Exception
  {
    String initStr  = numFigure.toString() + "|" + name;
    testObj = new EdgeField(initStr);
    
    // runner();
  }
  
  public void runner()
  {
    testGetNumFigure();
    testGetName();
    testGetTableID();
    testSetTableID();
    testGetTableBound();
    testSetTableBound();
    testGetFieldBound();
    testGetDisallowNull();
    testSetDisallowNull();
    testGetIsPrimaryKey();
    testSetIsPrimaryKey();
    testGetDefaultValue();
    testSetDefaultValue();
    testGetVarcharValue();
    testSetVarcharValue();
    testGetDataType();
    testSetDataType();
    testToString();
  }

  
  @Test
  public void testGetNumFigure()
  {
    String tstMsg = "numFigure was set to " + numFigure.toString();
    assertEquals( tstMsg, (int) numFigure, testObj.getNumFigure() );
  }
  
  @Test
  public void testGetName()
  {
    String tstMsg = "name was set to " + name;
    assertEquals( tstMsg, name, testObj.getName() );
  }
  
  @Test
  public void testGetTableID()
  {
    String tstMsg = "tableID was initialized to 0";
    assertEquals( tstMsg, 0, testObj.getTableID() );
  }
  
  @Test
  public void testSetTableID()
  {
    Integer testValue = 1;
    String tstMsg = "tableID was set to 1";
    testObj.setTableID(1);
    assertEquals( tstMsg, 1, testObj.getTableID() );
  }
  
  @Test
  public void testGetTableBound()
  {
    String tstMsg = "tableBound initialized to 0";
    assertEquals( tstMsg, 0, testObj.getTableBound() );
  }
  
  @Test
  public void testSetTableBound()
  {
    Integer testValue = 1;
    String tstMsg = "tableBound set to " + testValue.toString();
    testObj.setTableBound(testValue);
    assertEquals( tstMsg, (int) testValue, testObj.getTableBound() );
  }
  
  @Test
  public void testGetFieldBound()
  {
    String tstMsg = "fieldBound initialized to 0";
    assertEquals( tstMsg, 0, testObj.getFieldBound() );
  }
  
  @Test
  public void testSetFieldBound()
  {
    Integer testValue = 1;
    String tstMsg = "fieldBound set to " + testValue.toString();
    testObj.setFieldBound(testValue);
    assertEquals( tstMsg, (int) testValue, testObj.getFieldBound() );
  }
  
  @Test
  public void testGetDisallowNull()
  {
    String tstMsg = "dissallowNull initialized to false";
    assertEquals( tstMsg, false, testObj.getDisallowNull() );
  }
  
  @Test
  public void testSetDisallowNull()
  {
    Boolean testValue = true;
    String tstMsg = "dissallowNull set to " + testValue.toString();
    testObj.setDisallowNull( testValue );
    assertEquals( tstMsg, true, testObj.getDisallowNull() );
  }
  
  @Test
  public void testGetIsPrimaryKey()
  {
    String tstMsg = "isPrimaryKey initialized to false";
    assertEquals( tstMsg, false, testObj.getIsPrimaryKey() );
  }
  
  @Test
  public void testSetIsPrimaryKey()
  {
    Boolean testValue = true;
    String tstMsg = "isPrimaryKey set to " + testValue.toString();
    testObj.setIsPrimaryKey( testValue );
    assertEquals( tstMsg, testValue, testObj.getIsPrimaryKey() );
  }
  
  @Test
  public void testGetDefaultValue()
  {
    String tstMsg = "defaultValue initialized to ''";
    assertEquals( tstMsg, "", testObj.getDefaultValue() );
  }
  
  @Test
  public void testSetDefaultValue()
  {
    String testValue = "test";
    String tstMsg = "defaultValue set to " + testValue;
    testObj.setDefaultValue(testValue);
    assertEquals( tstMsg, testValue, testObj.getDefaultValue() );
  }
  
  @Test
  public void testGetVarcharValue()
  {
    String tstMsg = "varCharValue initialized to 1";
    assertEquals( tstMsg, 1, testObj.getVarcharValue() );
  }
  
  @Test
  public void testSetVarcharValue()
  {
    Integer testValue = 2;
    String tstMsg = "varcharValue set to " + testValue.toString();
    testObj.setVarcharValue(testValue);
    assertEquals( tstMsg, (int) testValue, testObj.getVarcharValue() );
    
    Integer testValue2 = -1;
    tstMsg = "varcharValue set to " + testValue2.toString() + ", should be " + testValue.toString();
    testObj.setVarcharValue(testValue2);
    assertEquals( tstMsg, (int) testValue, testObj.getVarcharValue() );
  }
  
  @Test
  public void testGetDataType()
  {
    String tstMsg = "dataType initialized to 0";
    assertEquals( tstMsg, 0, testObj.getDataType() );
  }
  
  @Test
  public void testSetDataType()
  {
    Integer testValue = 1;
    String tstMsg = "dataType set to " + testValue.toString();
    testObj.setDataType( testValue );
    assertEquals( tstMsg, (int) testValue, testObj.getDataType() );
    
    Integer testValue2 = -1;
    tstMsg = "dataType set to " + testValue2.toString() + ", should be " + testValue.toString();
    testObj.setDataType( testValue2 );
    assertEquals( tstMsg, (int) testValue, testObj.getDataType() );
    
    Integer testValue3 = 4;
    tstMsg = "dataType set to " + testValue3.toString() + ", should be " + testValue.toString();
    testObj.setDataType( testValue3 );
    assertEquals( tstMsg, (int) testValue, testObj.getDataType() );
  }
  
  @Test
  public void testToString()
  {
    String testValue =
    "5|" +
    "Test Edge|" +
    "[1|" +
    "1|" +
    "1|" +
    "1|" +
    "1|" +
    "true|" +
    "true|" +
    "2]";
    String tstMsg = "toString should return " + testValue;
    assertEquals( tstMsg, testObj.toString(), testValue );
  }
}
