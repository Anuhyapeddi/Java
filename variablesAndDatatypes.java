// As Java is an object-oriented programming language. Everything should be declared as objects

class Hello{                                     // class
    public static void main(String a[]){         // main method
        System.out.println("hello world");       // println method is sued to print on the console
    }
}

// variables
// variables are used to store a value

class Hello{
    public static void main(String a[]){
        int num = 5;
        System.out.println(num); // 5
    }
}

// int - datatype
// num - variable name 
// = - assignment operator
// 5 - value to be stored

// datatypes 
// There are two types: primitive and non-primitive

// primitive datatype - They are basic, simple to use and in-built data types (integer, float, character, boolean)
// primitive datatype - Mainly, there are four types - int, float, char, boolean

// integer
// types of integer -  byte, short, int, long

//The default of the int is int

// storage memory
// int - 4 bytes 
// long  - 8 bytes
// short - 2 bytes
// byte - 1 byte -> - 2 ^ 7 to (2 ^ 7)- 1 -> -128 to 127
// 1 byte = 8 bits

class Hello{
    public static void main(String a[]){
        int num1 = 9;        // 9
        byte num2 = 127;     // 127
        byte num = 128;      // ERROR - when you assign 128 to byte, it gives you an error because byte can only store from -128 to 127
        short num3 = 456;    // 456
        long num4 = 2_345L;  // 2345 - make sure to use l or L after declaring long value
    }
}

// float 
// types of float - double, float

//The default of the float is double

// storage memory
// float - 4 bytes 
// double  - 8 bytes

class Hello{
    public static void main(String a[]){
        float num = 2.5f;    // 2.5 - float value should be followed by f
        double num2 = 2.5;   // 2.5
    }
}

// character

// storage memory
// char - 2 bytes
// char in Java follows UNICODE

class Hello{
    public static void main(String a[]){
        char val = 'a';    // a - character is defined in single quotes ''
    }
}

// boolean - true, false

class Hello{
    public static void main(String a[]){
        boolean val = true;    
        boolean val2 = false;   
    }
}

// type conversions and casting

// implicit conversion - type conversions

class Hello{
    public static void main(String a[]){
        byte b = 127;        // byte can store 1 byte 
        int num = b;         //whereas int can store 4 bytes, you can directly store byte value to int.
        System.out.println(num);
    }
}

// explicit conversion - casting

class Hello{
    public static void main(String a[]){
        int num = 12;          // int can store 4 bytes 
        byte b = (byte) num;   // byte can store 1 byte(8 bits); even though 12 requires only 4 bits, the program still gives you an ERROR. To avoid this, we can use casting
        System.out.println(b);
    }
}

class Hello{
    public static void main(String a[]){
        int num = 257;           // it can store 4 bytes, i.e 256
        byte b = (byte) num;     // if we want to store a greater value than 256, then we store its modular value. like num  % 256, i.e 257 % 256, we get 1. 
        System.out.println(b);   // result is 1
    }
}

// type promotion

class Hello{
    public static void main(String a[]){
            byte num1 = 10;
            byte num2 = 10;
            byte result =  num1 * num2;    // ERROR - the result of arithmetic operations like *, /, +, or - is promoted to int by default if the operands are smaller than int (e.g., byte, short, or char).
            System.out.println(result);
    }
}

//It can be resolved by 

class Hello{
    public static void main(String a[]){
            byte num1 = 10;
            byte num2 = 10;
            int result1 =  num1 * num2;   
            byte result2 = (byte) num1 * num2; // or you can convert num1 * num1 to byte, as the byte can store up to 127; if we multiply, we can 10 * 10 = 100. 100 < 127
            System.out.println(result1);
            System.out.println(result2);
    }
}

// arithmetic operations
// addition(+), subtraction(-), multiplication(*), division(/), modular(%)

class Hello{
    public static void main(String a[]){
        int num1 = 1;
        int num2 = 2;
        int add = num1 + num2;          // addition
        int sub = num1 - num2;          // subtraction
        int mul = num1 * num2;          // multiplication
        int div = num1 / num2;          // division
        int mod = num1 % num2;          // modular - gives the remainder
        System.out.println(add);        // 3
        System.out.println(sub);        // -1
        System.out.println(mul);        // 2
        System.out.println(div);        // 0
        System.out.println(mod);        // 1
    }
}

// increment, decrement, post and pre increment, post and pre decrement

class Hello{
    public static void main(String a[]){
        int num = 5;       // when we do arithmetic operations on the same number
        num += 1;          // 6
        num -= 1;          // 5
        num *= 1;          // 5
        num /= 1;          // 5
        num++;             // 6; post-increment 
        ++num;             // 6; pre-increment
        int res = num++; // res = 5; first, it fetches the value and then increments it.
        int res = ++num; // res = 6; it increments the value and fetches the value.
         
    }
}

// relational operations 
// less than(<), greater then(>), equal to(==), not equal to(!=), less then equal to(<=), greater than equal to(>=)
// The output we receive from relational operations is a Boolean value.


// logical operations
// AND(&/&&), OR(|/||), NOT(!), XOR(XOR)

//AND - we can use the & or && symbol; it is T only if both the conditions are T. If any one of them is F it is F
// T && T = T
// T && F = F
// F && T = F
// F && F = F

// OR -  we can use the | or || symbol; it is T if any one of them is T, and if both are F, then we get F
// T || T = T
// T || F = T
// F || T = T
// F || F = F

// XOR - XOR; if both the values are same then F, if both the values are different then T.
// T XOR T = F
// T XOR F = T
// F XOR T = T
// F XOR F = F
