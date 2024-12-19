// fucntions

// class
//They are defined as member variables and member functions

class Calculator
{
    public int add(int num1, int num2){
        System.out.println("I am in function method");
        return num1 + num2;
    }
}

class Main{
    public static void main(String a[]){
        int num1 = 2;       // int is a primitive type. So, num1, num2 are primitive variable
        int num2 = 6;

        Calculator cal = new Calculator();      // cal is reference variable, "new Calculator()" creating a new object of Calculator type
        int result = cal.add(num1,num2);
        System.out.println(result);
    }
}

// difference between void and datatypes

class OrderHere{
    public void boba()          // void - it does not return any value
    {
        System.out.println("Boba takes 5 mins to get ready");
    }
    public String order(int cost, String name)                // String - it returns a string value
    {
        if (cost >= 10)
            return String.format("your %s is ready", name);

        return "sorry! Need more money to place an order";
    }
}

class Main{
    public static void main(String a[]){                 
        OrderHere order = new OrderHere();
        order.boba();
        String result = order.order(15, "boba tea");
        System.out.println(result);
    }
}

// Method overloading - functions having the same name but different numbers of variables and other data types.

class Calculator
{
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
    public double add(double num1, int num2)
    {
        return num1 + num2;
    }
}

class Main
{
    public static void main(String a[])
    {
        Calculator obj = new Calculator();
        int result = obj.add(6,1,5);
        System.out.println(result);
    }
}

// static methods/variables are accessed by class, whereas instance methods/variables are accessed by objects(created by class)

// static variable 

class Mobile
{
    String brand;
    int cost;
    static String name;            // static variable

    public void show()             // instance method
    {
        System.out.println(brand + " " + cost + " " + name);
    }
}

class Main
{
   public static void main(String a[])
   {
       Mobile obj = new Mobile();
       obj.brand = "Apple";
       obj.cost = 1000;
       Mobile.name = "smartphone";

       Mobile obj2 = new Mobile();
       obj2.brand = "Google";
       obj2.cost = 900;
       
       System.out.println("First Product");
       obj.show();
       System.out.println("Second Product");
       obj2.show();
   }
}

// static methods

// static method

class Mobile
{
    String brand;
    int cost;
    static String name;

    public void show()                    // instance method
    {
        System.out.println(brand + " " + cost + " " + name);
    }

    public static void show1(Mobile obj)            // static method
    {
        System.out.println(obj.brand + " " + obj.cost + " " + name);  // cannot access instance variables directly in static methods
    }
}

class Main
{
   public static void main(String a[])
   {
       Mobile obj = new Mobile();
       obj.brand = "Apple";
       obj.cost = 1000;
       Mobile.name = "smartphone";

       Mobile obj2 = new Mobile();
       obj2.brand = "Google";
       obj2.cost = 900;

       System.out.println("First Product");
       obj.show();
       System.out.println("Second Product");
       obj2.show();

       Mobile.show1(obj);                // calling a static method, passing an argument with an obj
   }
}

// static block

// Whenever we create a class, it has 2 steps
// class loads
// object gets initialized

// static block -  it is called when we create a class

// constructor - it is called at the time of object creation
// name of the constructor should be the same as the name of the class

// static method

class Mobile
{
    String brand;
    int cost;
    static String name;

    static                    // static block
    {
        name = "smartphone";
        System.out.println("I am in static method");
    }

    public Mobile()            // constructor
    {
        brand = "";
        cost = 200;
        System.out.println("I am in constructor");
    }
    public void show()
    {
        System.out.println(brand + " " + cost + " " + name);
    }
}

class Main
{
   public static void main(String a[])
   {
       Mobile obj = new Mobile();
       obj.brand = "Apple";
       obj.cost = 1000;
       Mobile.name = "smartphone";

       Mobile obj2 = new Mobile();
       obj2.brand = "Google";
       obj2.cost = 900;

       System.out.println("First Product");
       obj.show();
       System.out.println("Second Product");
       obj2.show();
   }
}

// If you don't create the object, it will not load the class as well 
// but what if we want to load the class 

//In Java, we have Class.forName("nameOfYourClass") to load the class; when we use Class, we need to define the expectation

class Mobile
{
    String brand;
    int cost;
    static String name;

    static
    {
        name = "smartphone";
        System.out.println("I am in static method");
    }

    public Mobile()
    {
        brand = "";
        cost = 200;
        System.out.println("I am in constructor");
    }
    public void show()
    {
        System.out.println(brand + " " + cost + " " + name);
    }
}

class Main
{
   public static void main(String a[]) throws ClassNotFoundException
   {
       Class.forName("Mobile");
   }

    private static class classNotFoundException extends Exception {
    }
}

// Encapsulation
// Definition: where we bind both the member variables and member functions together is called encapsulation

// private variables can be accessed by their own class or its methods

class Details
{
    private String name = "Anu";        // private variables
    private int age = 26;

    public String getName()            // getter methods
    {
        return name;
    }
    public int getAge()                // getter methods
    {
        return age;
    }
    public void setName(String s)
    {
        name = s;
    }
    public void setAge(int a)
    {
        age = a;
    }
}

class Main
{
    public static void main(String a[])
    {
        Details person = new Details();
        person.setName("chinnu");            // to set a value
        person.setAge(26);
        
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

// this keyword
//This keyword is generally used to refer to the current object

class Details
{
    private String name = "Anu";        // private variables
    private int age = 26;

    public String getName()            // getter methods
    {
        return name;
    }
    public int getAge()                // getter methods
    {
        return age;
    }
    public void setName(String name)  // here name is local variable 
    {
        this.name = name;             // this keyword 
    }                                 // when we
    public void setName(String name)  // error from line 315 - 318
    {
        name = name;                  // when we define name = name;   
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}
class Main
{
    public static void main(String a[])
    {
        Details person = new Details();
        person.setName("chinnu");
        person.setAge(26);

        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}

// default and parameterized constructor 

class Order
{
    String flavour;
    int cost;

    public Order()                               // default constructor
    {
        flavour = "cotton candy";
        cost = 15;
    }
    public Order(String flavour, int cost)       // parameterized constructor
    {
        this.flavour = flavour;
        this.cost = cost;
    }
}

class Main
{
    public static void main(String a[])
    {
        Order order1 = new Order();            
        Order order2 = new Order("black grape", 20);

        System.out.println("welcome to lolas yogourt");
        System.out.println(order1.flavour + " - " + order1.cost);
        System.out.println(order2.flavour + " - " + order2.cost);
    }
}

// Inheritance



