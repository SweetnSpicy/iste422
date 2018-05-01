# Milestone 5 Writup

## Running the program
It's just as before there is a jar file and an output definition path folder provided.

To run jar:
Double click or right click and open with Java.
File name is iste422.jar

OR

On Linux open a terminal in the current directory and run:
    java -jar iste422.jar

To run through build:
Make sure you have ant installed.
**Make sure to make directories bin, bin/test, and bin/build.**

To run use 

    ant run

## Extending the functionality

To use a different kind of diagramming software the file must be converted into the same format that the default diagrammer uses. This means that each element needs to be references as:

    Figure 1
    {
        Style "Entity"
        Text "STUDENT"

If someone wants to add a DDL then they need to program a java class to convert the data in the program into the DDL. This is done by creating a class that extends EdgeConvertCreateDLL.java.

## What we changed and why

In the CreateDDLMySQL file, the large CreateDDL function was split into two. The CreateDDL now only starts the creation of the SQL File and hands the loops off to the anonymous run() function

In EdgeTable file, the moveFieldUp() and MoveFieldDown() methods were combined into MoveField with a parameter of ‘direction’ as to stop the repeating of code.

The GUI file was altered to add help to the program for the user and was altered to fix the infinite loop issue.

Also here is our github feel free to look at it: https://github.com/SweetnSpicy/iste422/tree/master 

## The Org

Regina Locicero

Cauldierre McKay

David Luong

Joshua Berk

