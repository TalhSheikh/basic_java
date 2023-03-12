// Java Booleans
// Very often, in programming, you will need a data type that can only have one of two values, like:
// YES / NO
// ON / OFF
// TRUE / FALSE
// For this, Java has a boolean data type, which can store true or false values.

public class JavaBooleans {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;    
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Boolean Expression
        // A Boolean expression returns a boolean value: true or false.
        // This is useful to build logic, and find answers.
        // For example, you can use a comparison operator, such as the greater than (>) operator, 
        // to find out if an expression (or a variable) is true or false:

        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9
        // In the examples below, we use the equal to (==) operator to evaluate an expression:
        // Example:
        int b = 10;
        System.out.println(b == 10); // returns true, because the value of x is equal to 10
        
        // Real Life Example
        // Let's think of a "real life example" where we need to find out if a person is old enough to vote.   
        // In the example below, we use the >= comparison operator to find out if the age (25) is greater than
        // OR equal to the voting age limit, which is set to 18:
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge); // returns true (25 year olds are allowed to vote!) 
      }
}
