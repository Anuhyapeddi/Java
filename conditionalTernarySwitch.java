// conditional Statements

class Hello{
    public static void main(String a[]){
        int age = 26;

        if (age > 25) {
            System.out.println("You are allowed");
            System.out.println("Welcome to the night party"); // if you want to print more than one statement, use curly brackets { } 
        }
        else if(age > 18 && age < 25)
            System.out.println("You are allowed with your parents"); //If you have only one statement to print, then use indentation.
        else
            System.out.println("You are not allowed");
    }
}

// ternary operator 
// It is generally used when for one-line code
// condition ? what happens when the condition is true: what happens when the condition is false
// condition ? True : False

class Hello{
    public static void main(String a[]){
        String icecream = "chocolate";

        String order = icecream == "chocolate" ? "chocolate ice cream" : "coffee ice cream";
        System.out.println(order);         // "chocolate ice cream"

    }
}

// switch

class Hello{
    public static void main(String a[]){
        String flavour = "mango";

        switch(flavour){    
            case "chocolate":                 //Here, the flavour variable is compared to the case value; if it matches the case variable then it prints what's on that case 
                System.out.println("$10 for chocolate ice cream");
            case "coffee":
                System.out.println("$12 for coffee ice cream");
            case "strawberry":
                System.out.println("$9 for strawberry");
            default :
                System.out.print("You don't have " + flavour);
        }
    }
}
