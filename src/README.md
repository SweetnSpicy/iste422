# Testing SQL output
Because of the infinite loop when attempting to create the ddl file, we created an example sql file of what the sql output should be. To test this you will need mysql installed. First run the mysql script using the following command
    
    mysql -u username -p < createSQL.sql

Make sure to replace username with the username for your mysql install and put in your password when prompted.
Then run the mysqlchecker using:

    mysqlcheck -u username -p -c edgedb > createSQL.txt

If an error pops up at this step then the database wasn't properly created, but this shouldn't happen in our case. Next you want to run the java tests against the output of the checker we just made so next compile the java test file:

    javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar TestCreateSQL.java

Then run using:

    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestCreateSQL

All the test should pass.

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

