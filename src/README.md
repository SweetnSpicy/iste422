Each person has their own readme, which is copied and pasted below.

## EdgeTableTest README
You should have our files and both the jars and source code comiled as done in the workingExample.tar. You hsould have them all in the same directory.
First you need to compile the file (this command assumes the necessary jar is in the same directory as all the files):

    javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeTableTest.java

Next you can run the tests using:

    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeTableTest

Important to note that some of these tests fail and will have their code fixed later in the project. For those tests I made comments directly above the test in the testing file for explanation.



# Test for "EdgeConvertFileParser.java":

## Steps to run the tests:
1. Install JUnit on your machine (refer to JUnit 4 website). Simply google search it.
2. Compile this file by executing the following command:<br>
        **java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar EdgeConvertFileParserTest.java**<br>

   (NOTE: Skip this step, and move onto the next, if it's already compiled.)<br>

3. Run this file by executing the following command:<br>
        **java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore EdgeConvertFileParserTest**
       

## What's included:
#### prepareParser() method
* Instantiates a new EdgeConvertFileParser object that accepts a file to be parsed.
* Call the JUnit's runner() method declared in this test class.


#### runner() method
* Uses the JUnit version.
* Runs all methods from the "EdgeConvertFileParser.java" file at the same time.
 

#### testParseEdgeFile() method
* Try the parseEdgeFile() method from the "EdgeConvertFileParser.java" file.
* Use JUnit's fail() method to make this test fail, and record the error message in a dialog box.

#### testParseSaveFile() method
* Try the parseSaveFile() method from the "EdgeConvertFileParser.java" file.
* Use JUnit's fail() method to make this test fail, and record the error message in a dialog box.

#### testGetEdgeTables() method
* Try the getEdgeTables() method from the "EdgeConvertFileParser.java" file.
* Use JUnit's fail() method to make this test fail, and record the error message in a dialog box.

#### testGetEdgeFields() method
* Try the getEdgeFields() method from the "EdgeConvertFileParser.java" file.
* Use JUnit's fail() method to make this test fail, and record the error message in a dialog box.

#### testOpenFile() method
* Four individual methods declared for testing for each of the 4/5 files from the 'finalProjectCode' folder.

* In each case, try the openFile() method from the "EdgeConvertFileParser.java" file.
* Use JUnit's fail() method to make each test case fail, and record the error message in a dialog box.

