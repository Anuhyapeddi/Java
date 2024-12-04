// array - arrays are used to store more than one values of same data type. 

class Main
{
    public static void main(String a[])
    {
        int arr[] = {1,2,3};
        int num[] = new int[4];             // to declare a new array with the size
        arr[1] = 0;                         // assigning new value to the arr
        System.out.println(arr[0]);         // To retrieve a particular element from the array.
        System.out.println(num);
    }
}

// Multi dimensional array

class Method {
    public static void main(String a[]) {
        int arr[][] = new int[3][4];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}

// enhance for loop

class Method {
    public static void main(String a[]) {
        int arr[][] = new int[3][4];
      
        for (int n[] : arr){
           for (int m: n){
               System.out.println(m + " ");
           }
           System.out.println();
       }
    }
}

// Jagged Arrays - when the size of the array is varied.

class Method {
    public static void main(String a[]) {
        int arr[][] = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}

// static methods/variables are accessed by class, where as instance methods/variables are accessed by objects(created by class)

class Mobile
{
    String brand;
    int cost;
    static String name;

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



