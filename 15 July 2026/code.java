public class Main 
{
    public static class MethodOverloading
    {
        public String fullName(String fname, String lname)
        {
            return fname + " " + lname;
        }

        public String fullName(String fname, String mname, String lname)
        {
            return fname + " " + mname + " " + lname;
        }
    }

    public static class Parent
    {
        public void Overridingtext()
        {
            System.out.println("Hello from the Parent.");
        }
    }

    public static class Child extends Parent
    {
        public void Overridingtext()
        {
            System.out.println("Hello from the Child.");
        }
    }
    
    public static void main(String args[]) 
    {
        MethodOverloading mo = new MethodOverloading();

        // Method Overloading
        System.out.println(mo.fullName("Aditya", "Sharma"));
        System.out.println(mo.fullName("Aditya", "Vikram", "Sharma"));

        // Method Overriding
        Parent p = new Parent();
        p.Overridingtext();

        Child c = new Child();
        c.Overridingtext();
    }
}
