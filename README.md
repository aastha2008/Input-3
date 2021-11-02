## Input
There are many different ways to get user input. We are going to use the `Scanner` class. In order to use the class to get input, we must 

1. `import java.util.Scanner;
2. Create a Scanner object 
3. Output prompt to guide user

`Scanner user = new Scanner(System.in);`

###Input Types
1. `nextInt()` reads integer value from user
2. `nextFloat()' or `nextDouble()` reads a decimal value from user
3. `nextBoolean()` reads boolean value from user
4. `nextLine()` reads a String value

## Strings
A collection of characters. Strings are immutable, which means they cannot be changed

### What are Strings?


Ex: "My name is Mr. Nick"

Ex: "I have 4 dogs" 

Ex: "I like to go walking"

Strings are immutable, which means that you can't change them after they've been constructed. However, you can always take parts of a string for a New String.

### Constructing String Objects

We can create string objects similar to primitve data types 

`String name = "Nick"`;

### Concatentation of Strings

String can be added together using an operator called concatentation. (+) With concatentation you can produce a single string given two or more strings.

Example:

`String firstName = "Matt;`

`String lastName = "Jones";`

`String fullName = firstName + lastName;`

### Comparing Strings

In Java, you can compare strings using two different methods.
- `equals()` method
- `compareTo()` methods

**For the equals() method:**

`string1.equals(string2);`, this returns a boolean value, either true if the two strings are equal, or false otherwise.

Example:

`String dog = "Dog";`

`String cat = "Cat";`

`System.out.println(dog.equal(cat));` results in false

**For the compareTo() method:**

`string1.compareTo(string2);`

This method returns:
- Returns 0 if the two strings are equal
- Returns a value less than 0 if the first string pecedes the second string in the dictionary
- Returns a value greater than 0 if the second string precedes the first string in the dictionary

"Miles" 

"Ryan"

"Miles.compareTo("Ryan");

First Character: "M" - "R" = 77 - 82 = -5

### Indexing String

Even though strings are immutable, you are able to take parts of a string to use for a new string.

**Method: Substring()**

The substring() method has two different forms:
- string1.substring(5) - includes the index 5
  - The first form takes a single integer input and returns the character of the string from the index of the input to the end. 

Example:

`String dinosaur = "Triceratops";`

`String half = dinosaur.substring(5);` half results to "ratops"

Keep in mind that with this method the 5 is inclusive, meaning the substring includes the character that the index is referring to.

  - `string1.substring(Integer num1, Integer num2);`
  - The second form takes two integer inputs and returns the characters of the string from the index of the first input to the character before the index of the second input.

  Example:

  `String dinosaur = "Triceratops";`

  `String half = dinosaur.substring(2, 5);` half results to "ice"

  ### Other String Methods ###

  There are other string methods that are useful for you!!

  String Length:

  To find the length of a string, you can use the method length(). This method returns the length of the string as an integer.

  Example:

  `String name = "Nicholas";`

  `int length = name.length();` returns the integer value 8.
  
