import java.util.*;

public class h_funcwithpara {

    //Example for getting parameter from a function    
    // void getsoap(int money)
    // {   
    //     System.out.println("Soap bought for : "+money);
    // }

    // void getpaste(int money)
    // {
    //     System.out.println("paste bought for : "+money);
    // }

    // void getvege(int money)
    // {
    //     System.out.println("vegetables bought for : "+money);
    // }

    // public static void main (String[] args)
    // {
    //     h_funcwithpara obj = new h_funcwithpara();
    //     obj.getsoap(20);
    //     obj.getpaste(30);
    //     obj.getvege(35);
    // }

    // //Example 2 getting two parmeter and adding,divinding,sub them in a function
    // void sum(int a , int b)
    // {
    //     System.out.println("Addition of a and b is : "+(a+b));
    // }

    // void multi(int a , int b)
    // {
    //     System.out.println("Multipilaction of a and b is : "+(a*b));
    // }

    // void div(int a, int b)
    // {
    //     System.out.println("Division of a and b is : "+(a/b));
    // }

    // public static void main(String args[])
    // {
    //     h_funcwithpara obj = new h_funcwithpara();
    //     obj.sum(10,20);
    //     obj.multi(30, 2);
    //     obj.div(10,2 );
    // }



    //example 3 - Using return keyword (Passing money for the soap and getting the reminder monery in reurn and printing it in main function)
    // int soap(int a)
    // {
    //     int soap_cost = 18;
    //     int rem = a - soap_cost;
    //     return rem;
    // }

    // public static void main(String[] args) {

    //     h_funcwithpara obj = new h_funcwithpara();
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Enter the amoun to buy soap : ");
    //     int a = scan.nextInt();

    //     int rem = obj.soap(a);

    //     System.out.println("Soap bough and the remaining amount is : " + rem);


    // }




    //example 4 - finding a number is od or even using function (Trying to give fun at end)

    // public static void main(String[] args) {
        
    //     h_funcwithpara obj = new h_funcwithpara();
    //     System.out.println("Enter the number");
    //     Scanner scan = new Scanner(System.in);
    //     int num = scan.nextInt();
    //     String result = obj.even_odd(num);
    //     System.out.println(result);
    
    // }

    //  String even_odd(int a)
    // {
    //     if(a%2==0)
    //     {
    //         return  "Even";
    //     }
    //     else {
    //         return"odd";
    //     }
    // }


    //Method or function over loading
    // void sum()
    // {
    //     System.out.println("Print no sum");
    // }

    // void sum(int a)
    // {
    //     System.out.println("the number a is : "+a);
    // }

    // void sum(int a, int b)
    // {
    //     System.out.println("the sum is " + (a + b));
    // }

    // public static void main(String[] args) {
        
    //     {
    //         h_funcwithpara obj = new h_funcwithpara();
    //         obj.sum();
    //         obj.sum(1);
    //         obj.sum(1,2);

    //     }
    // }

    

    //enhanced for loop
    // public static void main(String[] args) {

    //     int arr[] = {2,3,4,7,34,78};

    //     for(int var:arr)
    //     {
    //         System.out.println(var);
    //     }

    //     String arr1[]= {"Car","Bar","Sar"};

    //     for(String var1 : arr1)
    //     {
    //         System.out.println(var1);
    //     }

    }


}


