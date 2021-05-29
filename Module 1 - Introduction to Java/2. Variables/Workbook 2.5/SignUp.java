import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions
        System.out.println("What is your first name: ");
        String fName = scan.nextLine();
        System.out.println("What is your last name: ");
        String lName = scan.nextLine();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Please make a username");
        String username = scan.nextLine();
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        System.out.println("What country where you from?");
        String country =  scan.nextLine();
        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        //Ask them to make a username.
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        System.out.println("\nYour Information:");
        System.out.println("\tFirst Name: "+fName);
        System.out.println("\tLast Name: "+lName);
        System.out.println("\tAge: "+age);
        System.out.println("\tUsername: "+username);
        System.out.println("\tCity: "+city);
        System.out.println("\tCountry: "+country);

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}