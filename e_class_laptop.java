// creating a class to create lot ofvariables using same tempelates
public class e_class_laptop {

    String name ="";
    String memory = "";
    int Ram =0;
    String processor = "";


    public static void main (String args[])
    {
        e_class_laptop lap1 = new e_class_laptop();

        lap1.name = "Lenovo";
        lap1.memory="1 TB";
        lap1.Ram = 8;
        lap1.processor = "i7";

        System.out.println(lap1.name);
        System.out.println(lap1.memory);
        System.out.println(lap1.Ram);
        System.out.println(lap1.processor);

        e_class_laptop lap2 = new e_class_laptop();
        lap2.name = "MSI";
        String model = lap2.name;

        System.out.println(model);
    }
    
}
