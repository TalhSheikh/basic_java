// Java Strings
// Strings are used for storing text.
// A String variable contains a collection of characters surrounded by double quotes:
public class JavaStrings {
    public static void main(String[] args){
        String greeting = "Hello";
        System.out.print(greeting);

        // String Length
        // A String in Java is actually an object, which contain methods that can perform certain 
        // operations on strings. For example, the length of a string can be found with the length() method:

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        // More String Methods
        // There are many string methods available, for example toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"
        // Finding a Character in a String
        // The indexOf() method returns the index (the position) of the first occurrence of 
        // a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7
        // String Concatenation
        // The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "Talha";
        String lastName = "Sheikh";
        System.out.println(firstName + " " + lastName); 
        String fname = "Talha ";
        String lname = "Sheikh";
        System.out.println(fname.concat(lname));
    }
}
