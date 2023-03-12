// You can also use the + character to add a variable to another variable:

public class Variable2{
    public static void main(String[] args){
        String name = "Talha";
        System.out.println("Hello " + name);
        // You can also use the + character to add a variable to another variable:
        String firstName = "Talha ";
        String lastName = "Sheikh";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        // For numeric values, the + character works as a mathematical operator 
        // (notice that we use int (integer) variables here):
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
    }
}