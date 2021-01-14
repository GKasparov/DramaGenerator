# DramaGenerator
Drama Generator is a program that generates random sentences using place holder variables such as %person or %game that you may customize. To create a sentence structure open the lists.txt and create a sentence structure. For variables that will be randomized use %(Variable), E.g. %game . Then create a file in the lists folder named by that variable, E.g game.txt . In the game.txt you will type your possibilities for that word, seperating each possibility with a new line. 

For example a game.txt may look like:
chess
checkers

This generator uses SparkJava and hosts over the port of your choice. The port is configurable in web.java on the 6th line: "port (8080);" . You have the choice to change the 8080 to the port of your choice for the Drama Generator to be hosted. To generate another sentence, just refresh the webpage.

For example once you've started the web.java file (Which will in turn run the gen.java), navigate to localhost:8080 . 
