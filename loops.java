// while loop - it runs until the condition fails

class Hello{
    public static void main(String a[]){
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
    }
}

// do while loop -  no matter what the condition is, it at least runs once

class Hello{
    public static void main(String a[]){
        int i = 1;
        do {
            System.out.println("hi! I am in do loop");
            i++;
        } while(i <= 5);          // it runs until i becomes <= 5
    }
}

// for a loop - it runs until a certain finite number of times.

// method 1
class Hello{
    public static void main(String a[]){
        for(int i = 1; i <= 5; i++){   // defining everything together; (initialize; check the condition; increment) 
            System.out.println(i);
        }
        System.out.println("for loop completed");
    }
}

// method 2
class Hello{
    public static void main(String a[]){
        int i = 1;                // defining on different line; here we are initializing i
        for(; i <= 5;){           // checking the condition
            System.out.println(i);
            i++;                  // and incrementing the i
        }
        System.out.println("for loop completed");
    }
}



