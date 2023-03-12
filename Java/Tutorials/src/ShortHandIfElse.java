// Short Hand If...Else
// There is also a short-hand if else, which is known as the ternary operator because it consists of three 
// operands.

// It can be used to replace multiple lines of code with a single line, and is most often used to 
// replace simple if else statements:


public class ShortHandIfElse {
    public static void main(String[] args){
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
