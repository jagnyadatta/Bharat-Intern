import java.util.Scanner;     //Scanner Package
public class Food_Order {
    public static void main(String[] args){
        System.out.println("             ======================================");
        System.out.println("=================[ Hello WelCome to The My App ]=================");
        System.out.println("             ======================================");
        System.out.println("What is Your Name (Only First Name) :");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Well "+name);
        System.out.println("Please Create a Password");
        
        String pass1 = scan.next();
        
        System.out.println("Congratulations Your password Has been Created Successfully");
        
        System.out.println("Your Password is Now: "+pass1);
        
        // System.out.println("Access Granted....!");
        
        System.out.println("\nAre You Hungry yes Or no ?");
        String ans1 = scan.next();
        
        if(ans1.equals("yes")){
            System.out.println("Choose What do you want to between pizza, burger or fish");
            String ans2 = scan.next();

            while (!ans2.equals("pizza") && !ans2.equals("burger") && !ans2.equals("fish")){
                
                System.out.println("Sorry We Do not have it Choose Between pizza,burger or fish.");
                ans2 = scan.next();
            }
            if(ans2.equals("pizza") || ans2.equals("burger") || ans2.equals("fish")){
                System.out.println("Do you Want Something to Drink ? yes or no :");
                String ans3 = scan.next();

                while (!ans3.equals("yes") && !ans3.equals("no")){
                    System.out.println("Wrong command Please try again.");
                    ans3= scan.next();
                }
                
                if(ans3.equals("yes")){
                    System.out.println("What would you to Drink Coke or Juice ?");
                    String ans4 = scan.next();

                    while (!ans4.equals("coke")&& !ans4.equals("juice")){
                        System.out.println("Sorry We don't Have it would you like to drink between coke or juice .");
                        ans4 = scan.next();
                    }
                    if(ans4.equals("coke") || ans4.equals("juice")){
                        System.out.println("Great You have Selected to Order "+"'"+ans2+"'"+" and "+"'"+ans4+"'");
                        // System.out.println("\nWait a Minute While your order has comes to you.\nThank you..!");
                    }
                }else{
                    System.out.println("Great You have Selected to Order Only "+"'"+ans2+"'");
                    // System.out.println("\nWait a Minute While your order has comes to you.\nThank you..!");
                }
                System.out.println("\nFor Verification Please Re-Enter Your Password: ");
                String pass = scan.next();
                
                while(!pass.equals(pass1)){
                    System.out.println("This is not the right password please try again: ");
                pass = scan.next();
            }
            System.out.println("Thank You Your Order is On it's Way..!");
        }
        else{
            System.out.println("Alright ! \n Have a Good Day.");
        }
    }
    else{
        System.out.println("Alright ! \nHave a Good Day.");
    }
    
    scan.close();   //Scanner Closed
}
}