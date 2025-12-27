import java.util.*;

public class c_datatye_if_comparsion {
    
    public static void main(String args[])
    {
        //data types
        // byte a = 127;
        // short b = 32450;
        // int c= 354756848;
        // long d = 74864477976976l;
        // float e = 3.7363f;
        // double f = 5.836387262;
        // boolean g = true;
        // char h = 'A';
        // String i = "Hi Charan";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
        // System.out.println(e);
        // System.out.println(f);
        // System.out.println(g);
        // System.out.println(h);
        // System.out.println(i);


        // //if else
        // Scanner a = new Scanner(System.in);
        // System.out.println("Is it raining");
        // String Weather = a.nextLine();
        
        // if(Weather == "yes")
        // {
        //     System.out.println("take a umberela");
        // }
        // else
        // {
        //     System.out.println("Enjoy the sunlight");
        // }



        // //comparsion operator

        // int num1 = 30;
        // int num2 = 40;
        
        // if(num1>num2)
        // {
        //     System.out.println(num1+" is greater than "+num2);
        // }
        // else if (num1==num2)
        // {
        //     System.out.println(num1+" is equal to "+num2);
        // }
        // else 
        // {
        //     System.out.println(num1+" is lesser than "+num2);
        // }

        //there are != , >=,<= etc



        //get input from user
        // Scanner a = new Scanner(System.in);
        
        // int num1 = a.nextInt();
        // int num2 = a.nextInt();
        
        // if(num1>num2)
        // {
        //     System.out.println(num1+" is greater than "+num2);
        // }
        // else if (num1==num2)
        // {
        //     System.out.println(num1+" is equal to "+num2);
        // }
        // else 
        // {
        //     System.out.println(num1+" is lesser than "+num2);
        // }


        //comparsion of string value
        // String a = "Car";
        // String b = "Car";

        //the above two will not create two string in te memory as both are same string,rather it will just create one memory and just point the addres to that string.
        //but thera are case sebsivite, if the case is different then they will create two memory


        // //now lets create two string with two memoryby creating them as object
        // String c = new String("car");
        // String d = new String("car");
        
        
        // System.out.println(a==b);//this will just compare the addres andsay it is true 
        // System.out.println(c==d);//here as the adddress are not same,this will throw an error.

        // System.out.println(a.equals(b));
        // System.out.println(c.equals(d));
        // System.out.println(!a.equals(b));// to see if not equals



        //Q& A get string value from user and use it if if else to compare
        // Scanner a = new Scanner(System.in);
        // System.out.println("Will RCB win or loose this IPL");
        // String win = a.nextLine();

        // if(win.equals("win"))
        // {
        //     System.out.println("ee sala cup namdhey");
        // }
        // else 
        // {
        //     System.out.println("Cup illa");
        // }



        //Challenge 1 - get input fo variable mark frm user, if mark > 35 print pass, else fail
        // Scanner scan =new Scanner(System.in);
        // System.out.println("Enter the mark");
        // int mark = scan.nextInt();

        // if (mark>=35)
        // {
        //     System.out.print("Pass");
        // }
        // else{
        //     System.out.print("Fail");
        // }


        //challenge 2 - get input , if income more than 7000 , scholarship is avaliable, if less then not eligible for schlorship
        // Scanner scan =new Scanner(System.in);
        // System.out.println("Enter your income");
        // int mark = scan.nextInt();

        // if (mark>=7000)
        // {
        //     System.out.print("Schlorship is avaliable");
        // }
        // else{
        //     System.out.print("Schlorship is not avaliable");
        // }



        //challenge 3 - get an input and check wheather the number is divisible by 3 and 5, if yes then pring it is divisible , else print not.

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = scan.nextInt();

        // if(num%3==0)
        // {
        //     if(num%5==0)
        //     {
        //         System.out.println("the number is divisible by 3 and 5");
        //     }
        //     else
        //     {
        //         System.out.println("the number is not divisible by 5");
        //     }
        // }
        // else if(num%3!=0)
        // {
            
        //         System.out.println("the number is not divisible by 3");
        // }

        //logical operator && for AND || for OR

        // Boolean Hungry = true;
        // Boolean Icecream = false;

        // //gives if output onlt if both the values are true
        // if (Hungry && Icecream)
        // {
        //     System.out.println("Eat");
        // }
        // else{
        //     System.out.println("Don't eat");
        // }

        // boolean cricket = true;
        // boolean football = false;
        
        // if(cricket || football)
        // {
        //     System.out.println("Play");
        // }
        // else
        // {
        //     System.out.println("Don't play");
        // }



        //the divide by both 3 and 5 challenge using logical operators

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = scan.nextInt();

        // if(num%3==0 && num%5==0)
        // {
        //     System.out.println("The number is divisible by both 3 and 5");
        // }
        // else{
        //     System.out.println("The numebr is not divisible by 3 and 5");
        // }


        //get inputfrom user and see if it is even or odd
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int num = scan.nextInt();

        // if(num%2==0)
        // {
        //     System.out.println("the number is a even number");

        // }
        // else{
        //     System.out.println("the number is a odd number");
        // }

        
        //else if learning - if mark> 35 video game, if >60 i Phone, if >90 Macbook pro
        // Scanner scan = new Scanner(System.in);
        // int mark = scan.nextInt();
        
        // if(35 < mark && mark <60)
        // {
        //     System.out.println("Video Game");

        // }

        // else if (60 < mark && mark <90)
        // {
        //     System.out.println("iPhone");

        // }

        // else if(mark >90)
        // {
        //     System.out.println("MacBoook Pro");

        // }

        // else
        // {
        //     System.out.println("Nothing");
        // }


        //Q&A - What i your gamescore
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your score");
        // int score = scan.nextInt();

        // if (score<50)
        // {
        //     System.out.println("You need to improve");
        // }

        // else if (score>=50 && score<=70)
        // {
        //     System.out.println("Good job");
        // }

        // else if (score>70)
        // {
        //     System.out.println("Excellent Performane");
        // }

        //Get five subject mark, add and find teh average, if less than 35 print additional class is reuired else good to go
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the mark of 5 subject");
        // int mark1 = scan.nextInt();
        // int mark2 = scan.nextInt();
        // int mark3 = scan.nextInt();
        // int mark4 = scan.nextInt();
        // int mark5 = scan.nextInt();
          
        // int Avg = (mark1+mark2+mark3+mark4+mark5)/5;
        // if(Avg<35)
        // {
        //     System.out.println("Additional class is required :"+Avg);
        // }

        // else if(Avg>=35){
        //     System.out.println("you are good to go :"+Avg);
        // }

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the color");
        // String color = scan.nextLine();

        // if(color.equals("red"))
        // {
        //     System.out.println("Stop");
        // }
        // else if (color.equals("yellow"))
        // {
        //     System.out.println("Get Ready");
        // }
        // else if(color.equals("green"))
        // {
        //     System.out.println("Go");
        // }


        //salary shoudlbe more than 20,000 or age less than 25 o ask fro laon and the loan amount should be less than 50,00
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter your salary");
        // int salary = scan.nextInt();
        // System.out.println("Enter your age");
        // int age = scan.nextInt();

        // if(salary>=20000 || age<=25)
        // {
        //     System.out.println("Enter the loan amount");
        //     int loan=scan.nextInt();
        //     if(loan<=50000)
        //     {
        //         System.out.println("you are eligible for the loan");
        //     }
        //     else{
        //         System.out.println("Maximum loan amount is 50,000");
        //     }
        // }
        // else
        // {
        //     System.out.println("Your are not eligible for the loan");
        // }


        //ternary operator example
        // boolean rain =false;

        // String go = rain?"Take an umberalla":"Enjoy the sunlight";
        // System.out.println(go);


        //Q&A- get two int and find which is max using the ternary operator
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the first and secod numebr");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // int max = num1>num2?num1:num2;

        // System.out.println(max+" is the greatest number");


        //print number from one to 10 using for loop
        // for(int i = 1 ; i<=10;i=i+1)
        // {
        //     System.out.println(i);
        // }

        //print number from 10 to 1 using for loop
        // for(int i = 10 ; i>=1;i=i-1)
        // {
        //     System.out.println(i);
        // }


        //get input for a and b  and print number froma to b
        // Scanner scan = new Scanner(System.in); 
        // System.out.println("Enter the number for a :");
        // int a = scan.nextInt();
        // System.out.println("Enter the number for b :");
        // int b = scan.nextInt();
        // System.out.println("The numbers are");

        // for(int i =a; i<=b;i=i+1)
        // {
        //     System.out.println(i);
        // }
     

        //print even number from 1 to 10 using for loop and if else
        // for(int i = 1; i<=10;i++)
        // {
        //     if(i%2==0)
        //     {
        //         System.out.println(i);
        //     }
        // }


        //self try- above one just by using for loop
        // for(int i = 2;i<=10;i=i+2)
        // {
        //     System.out.println(i);
        // }

        
        //count the no of odd numbers from 1 to 10
        // int count = 0;
        // for(int i=1;i<=10;i++)
        // {
        //     if(i%2 != 0)
        //     {
        //         count = count+1;
        //     }  
        // }
        // System.out.println(count);

        //Print teh the number which is divisible by both 3 and 5 in range 1 to 100
        // for(int i = 1; i<=100;i++)
        // {
        //     if(i%3==0 && i%5==0)
        //     {
        //         System.out.println("The number divisible by both 3 and 5 are :"+i);
        //     }
        // }


        //Array 
        // String[] playlist = new String[3];
        // playlist[0]="Song 1";
        // System.out.println(playlist[0]);
        // playlist[1]="Song 2";
        // System.out.println(playlist[1]);
        // playlist[2]="Song 3";
        // System.out.println(playlist[2]);
        
        //to pre define array
        // String [] playlist = {"Song1","Song2","Song3"};

        // System.out.println(playlist[0]);

        //create an integer array and get input of 5 numbers  and print the sum or total
        // Scanner scan = new Scanner(System.in);
        // int[] num = new int[5];
        // System.out.println("Enter the 5 numbers for the array");
        // num[0]=scan.nextInt();
        // num[1]=scan.nextInt();
        // num[2]=scan.nextInt();
        // num[3]=scan.nextInt();
        // num[4]=scan.nextInt();

        // int sum=0;
        // for(int i=0;i<5;i++)
        // {
        //     sum=sum+num[i];
        // }
        // System.out.println(sum);

        
        //self try, abpve code with for loop to get a input and sum as well
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int arr = scan.nextInt();
        // int[] num = new int[arr];

        // int sum=0;
        // for(int j=0;j<arr;j++)
        // {
        //     System.out.println("Enter the number for the array index "+j);
        //      num[j]=scan.nextInt();
        //      sum=sum+num[j];
        // }
        // System.out.println("The sum of the numbers in array is "+sum);



        //Print 10 number from an array of forloop
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int arr = scan.nextInt();
        // int[] num = new int[arr];

        // int sum=0;
        // for(int j=0;j<arr;j++)
        // {
        //     System.out.println("Enter the number for the array index "+j);
        //     num[j]=scan.nextInt();
        // }

        // for(int i=0;i<arr;i++)
        // {
        //     System.out.println("The number in array from index "+i+" is "+num[i]);
        // }

        
        //print 2 tabel using for loop
        // for(int i =1;i<=10;i++)
        // {
        //         System.out.println("2 x "+i+" = "+i*2);
        // } 

        //print any table
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the tableyou want to print");
        // int num = scan.nextInt();

        // for(int i=1;i<=10;i++)
        // {
        //     System.out.println(num+" x "+i+" = "+num*i);
        // }

        //get input of size of an array, then ger input for each element in that array and then find the middleelement of the array
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the size of the array");
        // int arr = scan.nextInt();
        // int[] num = new int[arr];

        // int sum=0;
        // for(int j=0;j<arr;j++)
        // {
        //     System.out.println("Enter the number for the array index "+j);
        //     num[j]=scan.nextInt();
        // }

        // if(arr%2!=0) 
        // {
        // int mid = arr/2;
        // System.out.println("The middle number is "+num[mid]);
        // }
        // else
        // {
        // int mid1 = arr/2;
        // int mid2 = mid1+1;
        // System.out.println("The middle number is "+num[mid1]+" and "+num[mid2]);

        // }



        //nested for loop
        // for(int i=1;i<=2;i=i+1)
        // {
        //     for(int j=1;j<=2;j=j+1)
        //     {
        //         System.out.println("John");
        //     }
        // }


        //pattern with nested for loop
        //***
        //***
        //***

        // for(int i=1;i<=3;i=i+1)
        // {
        //     for(int j=1;j<=3;j=j+1)
        //     {
        //         System.out.print("*");   
        //     }
        //     System.err.println("");
        // }
        

        //using nested for loop
        //*
        //**
        //***

        // for(int i =1;i<=3;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //self try diamond pattern

        // int num=1;
        // for(int n =1;n<=10;n=n+2)
        // {
        //     for(int i =4;i>=num;i--)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     num=num+1;
        // }

        // int num1=1;
        // for(int n1 =9;n1>=1;n1=n1-2)
        // {
        //     for(int i1 =1;i1<num1;i1++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int j1=1;j1<=n1;j1++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     num1=num1+1;
        // }
   

        //using random keyword

        // Random rand = new Random();
        // int num= rand.nextInt(11);
        // System.out.println(num);

        
        //Rand and while loop
        // Random rand =new Random();
        // int num=0;

        // while(num!=5)
        // {
        //     num=rand.nextInt(11);
        //     System.out.println(num);
        // }


        //do while
        // int count = 0;
        // do{
        //     System.out.println("Hello");
        //     count = count+1;
        // }while(count<=1);


        //get input for a variable a, the value shuld be greater than 10, if the value is not greater, ask them to inputuntill it is greater
        // int a =0;
        // Scanner scan= new Scanner(System.in);
        // do{
        //     System.out.println("Enter a value greater than 10");
        //     a = scan.nextInt();

        // }while(a<=10);

        //self try to try this in while loop20

        // int a = 0;
        // Scanner scan= new Scanner(System.in);
        // while(a<=10)
        // {
        //     System.out.println("Enter a value greater than 10");
        //     a = scan.nextInt();
        // }







    }

}
