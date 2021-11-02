import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {
    /*String name1 = "Dog";
    String name2 = "Dog";
    System.out.println(name1.equals(name2));
    String dino = "Triceratops"
    String half = dino.substring(2, 5);
    System.out.println(half);
    String name = "Nicholas"
    System.out.println(half);
    String name = "Nicholas";
    System.out.println(name.length());*/

    String name = "Nicholas";
    int length = name.length();
    System.out.println(length);
    
    /*
    // Input Continuation
    Scanner user = new Scanner(System.in);

    System.out.print("Enter your full name: ");
    String userName = user.nextLine();

    System.out.println("Enter a number: ");
    int userNumber = user.nextInt();

    System.out.println(userNumber);

    System.out.println("Hi" + userName);

    System.out.println(userName.length));
    System.out.println(userName.substring(1,6));
    System.out.println(userName.indexOf(' '));

    System.out.println(userName.substring(0, userName.indexOf(' ')));


    
    // Strings
    String name = "Nick";
    String firstName = "Matt";

    String lastName = "Jones";

    String fullName = firstName + " " + lastName;
    
    //System.out.println(fullname);

    int number = 5;

    String value = Integer.toString(number);
    //System.out.println(value);
    String dog = "Dog";
    String cat = "dog";
    System.out.println(dog.equals(cat)); // this will be false because of the capital and lowercase d

    String name1 = "Miles";
    String name2 = "Ryan";
    
    System.out.println(name1.compareTo(name2));
    
    String dinosaur = "Triceratops";

    String half = dinosaur.substring(5); 
    System.out.println(half);

    String part = dinosaur.substring(2, 6);
    System.out.println(part);
 
    // ***********************************************
    // EXAMPLE : String charcter printing
    // For string mystr, print last 2 char, 3 times
    // ***********************************************

    String mystr = "hello";
  
   // Step 1: get the index/address of last and second last chars
   // <string_var_name>.length returns the lenght of the string
   int last_index = mystr.length() - 1;
   int second_last_index = mystr.length() - 2;
   
   // Step 2: get actual charecters at two index/address from Step 1:
   // <string_var_name>.charAt(<index>) returns char at the <index>
   char z = mystr.charAt(last_index);
   char y = mystr.charAt(second_last_index);
   
   // Step 3: convert the "char" from Step 2 to "String"
   // Charater.toString(<char_var_name>) converts char --> string
   String zs = Character.toString(z);
   String ys = Character.toString(y);
   
   // Step 4: print or return the string of interest
   // return(ys + zs + ys + zs +ys +zs);
   System.out.println(ys + zs + ys + zs); */
   

  }
}