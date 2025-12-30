package Error_makes_clever_java;

import javax.print.Doc;

//public class Demo {
	
//	//Constructor
//	Demo()
//	{
//		System.out.println("Hello World");
//	}
//	
//	public static void main(String args [])
//	{
//		Demo obj = new Demo();// here we did not call this function, we just created the object, hello world was printed
//	}

	
	//constructor with calling
//	int mark;// these mark and nsmae we have just initilized but did not give any value, normally without constructor this will throw error
//	String name ;
//	
//	
//	Demo()
//	{
//		System.out.println("Hello");
//	}
//	
//	public static void main (String args[])
//	{
//		Demo obj1 = new Demo();
//		Demo obj2 = new Demo();
//		
//		System.out.println(obj1.mark);
//		System.out.println(obj2.name);
//		
	
	
	//Constructor overloading
	
//	int mark;
//	String name;
//	
//	Demo()
//	{
//		System.out.println("Empty constructor");
//	}
//	
//	Demo(int a, String b)
//	{
//		mark = a;
//		name = b;
//		System.out.println(mark);
//		System.out.println(name);
//	}
//	
//	
//	public static void main(String args[])
//	{
//		
//		Demo obj1 = new Demo();
//		Demo obj2 = new Demo(10,"john");
	
	
	
	//Use of this keyword
	
//	String myname;
//	
//	void demo() //constructor
//	{
//		System.out.println("hello");
//	
//	}
//	
//	void setname(String myname)
//	{
//		this.myname= myname;//by using this keyword we have said that I would like to assign the value to the myname defined just below the class
//	}
//	
//	public static void main (String arge[])
//	{
//		Demo obj = new Demo();//this constructor is going to get called automataclly as we have created object
//		obj.setname("mark");
//		//now let see if myname is under setname is assigned with string "mark" or not
//		System.out.println(obj.myname);//calling the myname value that is defined just undder class
//		
//	}

//}
	
	
	
	//using concept of inheritance(single inheritance), here we have close the Demo class that we created at first of this page and we are creating new new classes 
	
//	class Dad
//	{
//		int money = 2000;
//		
//	}
//	
//	class Son extends Dad  //this extend keyword will will make the class son to access all the properties inside dad
//	{
//		//this extend keyword will will make the class son to access all the properties inside dad
//	}
//	
//	public class Demo {
//	
//		public static void main(String args[])
//		{
//			Son obj = new Son();
//			System.out.println(obj.money);
//			
//			
//		}
//	
//}



//multilevel inheritance 

//	class Eat
//	{
//		void eat()
//		{
//			System.out.println("Eat");
//		}
//	}
//	
//	class Bark extends Eat
//	{
//		void bark() {
//			System.out.println("Bark");
//		}
//	}
//	
//	class weep extends Bark
//	{
//		void weep()
//		{
//			System.out.println("weep");
//		}
//	}
//	
//	
//	public class Demo{
//		
//	public static void main (String args[])
//	{
//		weep obj = new weep();
//		obj.weep();
//		obj.bark();
//		obj.eat();
//	}
//	
//	}
//	



//Hirehical inheritance 
//Here instead of calling the super class through another subclass, each subclass class the superclass separately

//	class Eat{
//		void eat()
//		{
//			System.out.println("Eat");
//		}
//		
//	}
//	
//	class Dog extends Eat
//	{
//		void bark()
//		{
//			System.out.println("Bark");
//		}
//	}
//	
//	class Cat extends Eat
//	{
//		void meow()
//		{
//			System.out.println("Meow");
//		}
//	}
//	
//	public class Demo
//	{
//		public static void main(String args[])
//		{
//			Cat obj1 = new Cat();
//			obj1.eat();
//			obj1.meow();
//			Dog obj2 = new Dog();
//			obj2.bark();
//			obj2.eat();
//		}
//		
//	}
	

//Hybrid In-heritance(Mixture of multilevel and Hirechical) 
//class Eat{
//	void eat()
//	{
//		System.out.println("Eat");
//	}
//	
//	}
//	
//class Dog extends Eat
//	{
//	void bark()
//	{
//		System.out.println("Bark");
//	}
//	}
//	
//class Cat extends Eat
//	{
//	void meow()
//	{
//		System.out.println("Meow");
//	}
//	}
//
//class smallcat extends Cat
//{
//		void weep()
//		{
//			System.out.println("Weep");
//		}
//}
//	
//public class Demo
//	{
//	public static void main(String args[])
//	{
//		smallcat obj1 = new smallcat();
//		obj1.eat();
//		obj1.meow();
//		obj1.weep();
//		Dog obj2 = new Dog();
//		obj2.bark();
//		obj2.eat();
//	}
//	
//	}



//Exercise question
//
//	class Vechile
//	{
//		String brand;
//		String year;
//		void startEngine()
//		{
//			System.out.println("Engine starts");
//		}
//	}
//	
//	class Car extends Vechile
//	{
//		String Fueltype;
//		void startEngine()
//		{
//			System.out.println("Car Engine starts");
//		}
//		
//		void drive()
//		{
//			System.out.println("Car is driving");
//		}
//	}
//	
//	class Truck extends Vechile
//	{
//		int Loadcapacity;
//		void startEngine()
//		{
//			System.out.println("Truck Engine starts");
//		}
//		
//		void haul()
//		{
//			System.out.println("Truck is hauling");
//		}
//	}
//
//
//	public class Demo
//	{
//		public static void main (String args[])
//		{
//			Car obj1 = new Car();
//			obj1.brand="Benz";
//			obj1.year="2008";
//			obj1.Fueltype= "Petrol";
//			System.out.println("The fuel type is "+obj1.Fueltype+" "+obj1.brand+" "+obj1.year);
//			obj1.startEngine();
//			obj1.drive();
//			
//			
//			Truck obj2 = new Truck();
//			obj2.brand="Barath_Benz";
//			obj2.year="2013";
//			obj2.Loadcapacity= 2000;
//			System.out.println("The fuel type is "+obj2.Loadcapacity+" "+obj1.brand+" "+obj1.year);
//			obj2.startEngine();
//			obj2.haul();
//			
//			
//			
//		}
//	}


	//Super keyword
//	class Animal
//	{
//		Animal(String name)
//		{
//			System.out.println("The animal is "+name);
//		}
//		
//		void makesound()
//		{
//			System.out.println("Make animal sound");
//		}
//	}
//	
//	class Dog extends Animal
//	{
//		Dog()
//		{
//			super("Monkey");
//			super.makesound();
//			System.out.println("This is a dog");
//		}
//	}
//	
//	public class Demo{
//
//	
//	public static void main(String args[])
//	{
//		Dog obj = new Dog();
//	}
//	
//	}



////superclass Exercise
//
//	class Person
//	{
//		String name ;
//		Person(String name1)
//		{
//			this.name=name1;
//			System.out.println("The name of the employee "+name);
//		}
//	}
//	
//	class Employee extends Person
//	{
//		int Employee_id;
//		Employee(String n)
//		{
//			super(n);
//			super.name="Raja";
//			
//		}	
//		void details()
//			{
//				System.out.println("the name of the employee "+super.name);
//			}
//		
//	}
//
//	public class Demo
//	{
//		public static void main(String args[])
//		{
//			Employee obj = new Employee("Ram");
//			obj.details();
//		}
//	}




//Static keyword - with static keyword if we create an object ad then assign it tosome value, then the static variablegets assigened to teh last sssigend 
//		class student
//		{
//			static int name = 30; 
//		
//		static void rr()
//			{
//				System.out.println("Hello");
//			}
//		}
//		
//		
//		class Demo
//		{
//			public static void main(String[] args) {
//				student s1 = new student();
//				s1.name = 40;
//				student s2 = new student();
//				s2.name = 50;
//				
//				System.out.println(s2.name);
//				System.out.println(s1.name);//here this will alos give value as 50 nstead of 50 as static belongs to class not to object
//				
//				//the static keyword can be called without creating an object - this is the correct way to access
//				
//				student.rr();
//				student.name = 60;//this the static way of calling and editing
//				System.out.println(student.name);
//				
//				
//				
//			}
//			
//		}
		


// static block - will be executed every time when a class is called

//	class teacher{
//		static
//		{
//			System.out.println("hello from static block of other class ");
//		}
//		
//	}
//	
//	class Demo{
//		
//		static
//		{
//			System.out.println("hello from static block of same class ");
//		}
//		
//		public static void main(String[] args) {
//			
//			teacher obj = new teacher(); //just creating this object so that it will call the static block automatically 
//			
//			
//		}
//	}


//	//exercise
//	class Person
//	{
//		public String name ;
//		protected int  age ;
//		private String social_security_number;
//		String address;
//	
//		Person(String name, int age, String ssn, String address) //constructor
//		{
//			this.name = name;
//			this.age = age;
//			this.social_security_number = ssn;
//			this.address = address;
//		}
//	
//	}
//	
//	
//	class Employee extends Person{
//
//		Employee(String name,int age,String ssn, String address) //creating constructor
//		{
//			super(name,age,ssn,address);
//			System.out.println("Hi from Emploee constructor");
//			
//			
//		}
//		
//	}
//	
//	public class Demo{
//		
//		public static void main(String[] args) {
//			Employee obj = new Employee("charan",26,"GDD798","Chennai");
//			
//			System.out.println(obj.name);
//			System.out.println(obj.age);
//			System.out.println(obj.address);
//			//System.out.println(obj.social_security_number); //cannot call as it a private to only that class
//			
//		}
		
//	}


	//Exercise 2
//	class Counter{
//		
//		static int count = 0;
//		int instance_number = 0;
//		
//		Counter()
//		{
//			count = count+1;
//			instance_number = instance_number + 1;
//		}
//		
//	}
//	
//	class Demo{
//		public static void main(String[] args) {
//			Counter obj = new Counter();
//			System.out.println(obj.count);
//			System.out.println(obj.instance_number);
//			Counter obj1 = new Counter();
//			System.out.println(obj.count);
//			System.out.println(obj.instance_number);
//		}
//	}
	
	
	//Exercise 3
//	final class constantValues{
//		
//			final float PI = 3.14f;
//			
//	}
//
//	
//	class con2 extends constantValues {
//		
//		float PI = 22.7f;
//	}

	//Exercise 4

//	abstract class	Animal
//	{
//		abstract void makesound();
//		
//		String name;
//		
//		Animal(String name)
//		{
//			this.name = name;
//		}
//		
//	
//	}
//	
//	class Dog extends Animal
//	{
//		
//		Dog(String name) {
//			super(name);
//		}
//
//		void makesound()
//		{
//			System.out.println("Bow Bow");
//		}
//
//	}
//	
//	class Cat extends Animal
//	{
//		Cat(String name)
//		{
//			super(name);
//		}
//		
//		
//		void makesound()
//		{
//			System.out.println("Mew Mew");
//		}
//	}
//	
//	class Demo
//	{
//		public static void main(String[] args) {
//			Dog obj1 = new Dog("Tommy");
//			obj1.makesound();
//			System.out.println(obj1.name);
//			
//			Cat obj2 = new Cat("Bobby");
//			obj2.makesound();
//			System.out.println(obj2.name);
//		}
//	}

//	Exercise 5
//	abstract class Vechile{
//		final void StartEngine()
//		{
//			System.out.println("Start Engine");
//		}
//		
//		static String getVechileType()
//		{
//			return "the vechile type is Disel";
//			
//		}
//		
//		void drive()
//		{
//			System.out.println("Abstract classdrive");
//		}
//		
//	}
//	
//	class Car extends Vechile
//	{
//		void drive()
//		{
//			System.out.println("car drive");
//		}
//	}
//	
//	class Mototcycle extends Vechile
//	{
//		void drive()
//		{
//			System.out.println("Mototcycle drive");
//		}
//	}
//	
//
//	
//	class Demo{
//		public static void main(String[] args) {
//			Car obj1 = new Car();
//			System.out.println(Vechile.getVechileType());//as that is a static method we can directly call using class
//			obj1.StartEngine();
//			obj1.drive();
//		
//			Mototcycle obj2 = new Mototcycle();
//			System.out.println(Vechile.getVechileType());//as that is a static method we can directly call using class
//			obj2.StartEngine();
//			obj2.drive();
//		
//		}
//	}



//	//interface exercise
//	interface playable{
//		void play();
//	}
//	
//	class Guitar implements playable {
//		public void play()
//		{
//			System.out.println("Play Guitar");
//		}
//	}
//	
//	class Piano implements playable{
//		public void play()
//		{
//			System.out.println("Play Piano");
//		}
//	}
//
//	class Demo{
//		
//		public static void main(String[] args) {
//			Guitar obj1 = new Guitar();
//			obj1.play();
//		
//			Piano obj2 = new Piano();
//			obj2.play();
//		}
//		
//	}


//	//interface for multiple inheritance
//	interface Printable{
//		static void display() {
//			System.out.println("Display Printable");
//		}
//		
//	}
//	
//	interface Showable{
//		static void display() {
//			System.out.println("Display Showable");
//		}
//	}
//
//	class Document implements Printable,Showable{
//		
//		public void display()
//		{
//			System.out.println("Display Document");
//		}
//	}
//	
//	class Demo{
//		public static void main(String[] args) {
//			Document obj = new Document();
//			obj.display();
//		}
//	}


	//Exercise - interface for multiple inheritance
//	interface Readable{
//		String read();
//	}
//	
//	interface Writable{
//		String write();
//	}
//	
//	interface Storable{
//		String store();
//	}
//
//	
//	class File implements Readable, Writable, Storable{
//		
//		public String read() {
//			return "Reading";
//		}
//		
//		public String write() {
//			return "Writing";
//		}
//		
//		public String store() {
//			return "Storing";
//		}
//	}
//
//	
//	class Demo{
//		public static void main(String[] args) {
//			File obj = new File();
//			System.out.println(obj.read());
//			System.out.println(obj.write());
//			System.out.println(obj.store());
//				
//		}
//	}



	//Exception Handling
//import java.util.*;
//
//	class Demo{
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			
//			
//			try {
//				int a = scan.nextInt();
//			}
//			
//			catch(InputMismatchException e){
//				System.out.println("Error handeled "+e);
//				
//			}
//			
//			try {
//				int b = 10/0; 
//			}
//			
//			catch(ArithmeticException f){
//				System.out.println("Error handeled "+f);
//				
//			}
//			
//			
//			System.out.println("Program Ended");
//		}
//		
//		
//		
//	}

	//Exception handling Exercise
//	import java.util.*;
	
//	class Demo{
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			int a=0;
//			int b=0;
//			int c = 0;
//			
//			try
//			{
//				a = scan.nextInt();
//				b = scan.nextInt();
//				
//			}
//			catch(InputMismatchException e)
//			{
//				System.out.println("Wrong input type,please input int");
//			}
//			
//			
//			
//			try {
//				c = a/b;
//			}
//			catch(ArithmeticException f) {
//				System.out.println("Arthematic Exception, Please retry");
//			
//			}
//			
//			System.out.println("The division of A and B is :"+c);
//		}
//	}


//	//Finally keyword
//	import java.util.*;
//	
//	class Demo{
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			
//			try {
//				System.out.println("Enter the valuse for a: ");
//				int a = scan.nextInt();
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//			finally {
//				System.out.println("Hi I'm finally");
//			}
//			
//			
//		}
//	}

	//Using finally keyword saying if the and exception occured or not
	
	import java.util.*;
	
//	class Demo{
//		public static void main(String[] args) {
//			
//			Scanner scan = new Scanner(System.in);
//			int error = 0;
//			
//			try {
//				System.out.println("Enter the input for A :");
//				int a = scan.nextInt();
//			}
//			catch(Exception e){
//				error = 1;
//			}
//			
//			finally {
//				if(error == 1)
//				{
//					System.out.println("Error occured");
//				}
//				else if(error == 0)
//				{
//					System.out.println("No Error occured");
//				}
//				
//			}
//			
//			
//		}
//	}
	
	
//		//Throw keyword
//		import java.util.*;
//		
//		class Demo{
//			
//			public static void main(String[] args) {
//				Scanner scan = new Scanner(System.in);
//				
//				try {
//					int age = scan.nextInt();
//					
//					throw new ArithmeticException ("Error occured"); //if an erro occur in above then this line will not be captured by catch, else yes
//				}
//				catch(Exception e){
//					System.out.println(e);
//				}	
//			}
//		}
	
	
//	//Throw keyword with if
//	import java.util.*;
//	
//	class Demo{
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			
//			try
//			{
//				int age =scan.nextInt();
//				
//				if(age<1) {
//					throw new ArithmeticException("Enter more than or eaual to 1");
//				}
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//			System.out.println("Program Ended");
//		}
//	}


	//Custom Exception - to print an exception if age is below 18
//	import java.util.*;
//	
//	
//	class NotValidAge extends Exception{
//	
//		public NotValidAge(String s)
//		{
//			super(s);
//		}
//		
//	}	
//	
//	class Demo{
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			
//			try {
//				System.out.println("Enter your age : ");
//				int age = scan.nextInt();
//				if(age<18)
//				{
//					throw new NotValidAge("The age must be more than 18");
//				}
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//			
//			System.out.println("Program ended");
//						
//		}
//	}
	
	
		//Exception exercise
//	import java.util.*;
//	
//	class DivisionExample{
//		public int dividenumbers() {
//			int c = 0;
//			Scanner scan = new Scanner(System.in);
//			
//		try {
//			System.out.println("Enter the numerator :");
//			int a = scan.nextInt();
//			System.out.println("Enter the Denomator :");
//			int b = scan.nextInt();	
//			if(b==0)
//			 {
//				 throw new ArithmeticException("Cannot be divided by 0");
//			 }
//			c = a/b;
//			
//		}
//			catch(Exception e){
//				System.out.println(e);
//			}
//			return c;
//		}
//	}
//	
//	class Demo{
//		public static void main(String[] args) {
//			
//			int output = 0;
//			
//			DivisionExample obj = new DivisionExample();
//			output = obj.dividenumbers();
//			
//			System.out.println("The division is : "+output);
//			
//		}
//	}
	

	
//	//Exercise with custom exception
//	import java.util.*;
//	
//	
//	class InvalidAgeException extends Exception{
//		
//		InvalidAgeException(String A)
//		{
//			super(A);
//		}
//	}
//	
//	
//	class Agevalidator
//	{
//		void Agecheck(int b)
//		{
//			try {
//				if(b<0 || b>50)
//				{
//					throw new InvalidAgeException ("Age must be between 1 to 49");
//				}
//				
//				else {
//
//					System.out.println("Congrauglation you are eligible");
//					
//				}
//			}
//			catch(Exception e){
//				System.out.println(e);
//			}
//		}
//	}
//	
//	class Demo{
//		public static void main(String[] args) {
//			Agevalidator obj = new Agevalidator();
//			Scanner scan = new Scanner(System.in);
//			try {
//				
//			System.out.println("Enter your age : ");
//			int age = scan.nextInt();
//			obj.Agecheck(age);
//			}
//			catch(Exception f)
//			{
//				System.out.println(f);
//			}
//			
//		}
//	}
	

	
//	//File writring using file writer
//	
//	import java.io.FileWriter;
//	
//	class Demo{
//		public static void main(String[] args) {
//			
//			try {
//			FileWriter Fw = new FileWriter("output.txt");
//			Fw.write("Hello World");
//			Fw.close();
//			System.out.println("Success");	
//			}
//			
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//	}

	
	
	//Adding more text into the file created above using append keyword
//	import java.io.FileWriter;
//	class Demo{
//		public static void main(String[] args) {
//			
//			try {
//			FileWriter Fw = new FileWriter("output.txt",true);
//			Fw.append(" Happy to connect with you");
//			Fw.close();
//			System.out.println("Success");	
//			}
//			
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//	}
	
	
	//Trying different output path
//	
//	import java.io.FileWriter;
//	class Demo{
//		public static void main(String[] args) {
//			
//			try {
//			FileWriter Fw = new FileWriter("D:\\Java\\Java_tutorials_notes\\output.txt");
//			Fw.write(" Happy to connect with you");
//			Fw.close();
//			System.out.println("Success");	
//			}
//			
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//	}
	
	
	//file writing using buffered writing 
//	import java.io.FileWriter;
//	import java.io.BufferedWriter;
//	
//	class Demo{
//		public static void main(String[] args) {
//			
//			try {
//			FileWriter Fw = new FileWriter("output.txt");
//			BufferedWriter bw = new BufferedWriter(Fw);
//			bw.write("Hello g");
//			bw.newLine();
//			bw.write("How are you");
//			bw.close();
//			System.out.println("Success");
//			}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//		}
//	}
	
	
	//File reader - reads char  by char
//	import java.io.FileReader;
	
//	class Demo{
//		public static void main(String[] args) {
//			
//			try {
//			FileReader fr = new FileReader("output.txt");
//			int c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			c = fr.read();
//			System.out.print((char)c);
//			fr.close();
//			}	
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//			
//		}
//	}
	
	
	//File reader - wraping the above code into while loop
//		import java.io.FileReader;
//		
//		class Demo{
//			public static void main(String[] args) {
//				
//				try {
//				FileReader fr = new FileReader("output.txt");
//				
//				int c = fr.read();
//				while(c!=-1) {
//				System.out.print((char)c);
//				c = fr.read();
//				}
//				fr.close();
//				}	
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}		
//				
//			}
//		}
	
		
		//Buffer reader - reads line by line
//		import java.io.BufferedReader;
//		import java.io.FileReader;
//		
//		class Demo{
//			public static void main(String[] args) {
//				
//				try {
//				FileReader fr = new FileReader("output.txt");	
//				BufferedReader br = new BufferedReader(fr);
//				
//				String line = br.readLine();
//				
//				while(line!=null)
//				{
//					System.out.println(line);
//					line = br.readLine();
//				}
//				
//				br.close();
//				
//				}
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}
//			}
//		}
//	
	
	
	// Threads 
	
//	class A extends Thread {
//		
//		public void run() {
//			for(int i = 0; i<10;i++)
//			{
//				System.out.println("Hello...");
//				
////				try {
////					Thread.sleep(10);
////				} catch (InterruptedException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
//			}
//		}
//	}
//	
//	class B extends Thread {
//			
//			public void run() {
//				for(int i = 0; i<10;i++)
//				{
//					System.out.println("Hi...");
//					
////					try {
////						Thread.sleep(10);// we can put this thread if we want - the bewlo code for thread.sleep was suggested by eclipse itself I don't know
////					} catch (InterruptedException e) {
////						// TODO Auto-generated catch block
////						e.printStackTrace();
////					}
//				}
//			}
//		}
//	
//	class Demo{
//		public static void main(String[] args) {
//			A a1 = new A();
//			B b1 = new B();
//			
//			b1.setPriority(10);
//			a1.start();
//			b1.start();
//		}
//	}
//	
	
	
	//Joins in thread
//	class A extends Thread{
//		int a = 0 ;
//		public void run()
//		{
//			for(int i =0 ; i<50 ;i++)
//			{
//				a = i;
//			}
//		}
//	}
//	
//	class Demo{
//		public static void main(String[] args) {
//			A a1 = new A();
//			
//			a1.start();
//			try {
//				a1.join();
//			} catch (InterruptedException e) {//note sure what this code is, eclipse added it
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(a1.a);
//			
//		}
//	}
	
	
	
	//runnable in threads
	
	class A implements Runnable{
		public void run()
		{
			System.out.println("Hi");
		}
	}
	
	class Demo{
	
		public static void main(String[] args) {
			
			A obj = new A();
			
			Thread tr = new Thread(obj);
			
			tr.start();

		}
	}
	
	
	
	
	
	
	
	