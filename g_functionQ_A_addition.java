public class g_functionQ_A_addition {

    //these a and b are instance variables (also called non-static variables).
    // you cannot use them inside themain function without creating an object because it is not staic, to make it static write as "Static int a =10"
    // if we make the instances variable to static we can use them in this void function as well as in main without an object
    
    int a = 10;
    int b = 20;

    void sum()
    {
        System.out.println(a+b);
    }

    public static void main (String [] agrs)
    {
    g_functionQ_A_addition obj = new g_functionQ_A_addition();
    obj.sum(); 
    }
    
}
