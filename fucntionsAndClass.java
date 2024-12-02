// fucntions

// class
// they are defined as member variables and member functions

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
    public void boba()          // void - ot doesnot return any value
    {
        System.out.println("Boba takes 5 mins to get ready");
    }
    public String order(int cost, String name)                // String - it returns a string value
    {
        if (cost >= 10)
            return String.format("your %s is ready", name);

        return "sorry! Need more money to place a order";
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

// Method overloading - functions having the same name but different number of variables and different datatypes.

class Calulator
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
        Calulator obj = new Calulator();
        int result = obj.add(6,1,5);
        System.out.println(result);

    }
}
