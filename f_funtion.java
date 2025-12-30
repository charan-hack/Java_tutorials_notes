public class f_funtion {

    //example 1 with void function
    // void greeting()
    // {
    //     System.out.println("Vanakam");
    //     dummy();//here  we are calling dummy function inside this greeting function with out creating any object becuuse both are void but main is static so we are creating an object and then calling them there
    // }

    // void dummy()
    // {
    //     System.out.println("I'm Dummy");

    // }
    

    // public static void main (String[] srgs)
    // {
    //     f_funtion obj = new f_funtion();
    //     obj.greeting();
    // }


    
    //example 2 with static function (but void will be theer as we cannot leave teh resurn type blank)
    static void greeting()
    {
        System.out.println("vanakkam1");
        f_funtion obj = new f_funtion();
        obj.dummy();//as this dummy is just a viod we need to create an object
    }

    void dummy()
    {
        System.out.println("I'm Dummy1");
    }

    public static void main(String[] arge)
    {
        greeting();
    }





}
