import java.util.Scanner;

class a_hello
{

    public static void main(String[] args) {
        
        // System.out.println("Hello World");

        // int a = 10;
        // int b = 30;
        // int c = 40;
        // System.out.println("The sum of three numbers are "+(a+b+c));


        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int num2 = b.nextInt();

        System.err.println("The total of num1 and num 2 is :"+ (num1 +num2));
        
        //Git test command


    }
}