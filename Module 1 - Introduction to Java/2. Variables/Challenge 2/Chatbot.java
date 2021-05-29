//import Scanner
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        //set up scanner. 

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = sr.nextLine();
                           
        //add new a line before asking next question. 
        System.out.println("Hi " + name + "! I'm Javabot. \nWhere are you from?");
        //Pick up user's home and store it. 
        String home = sr.nextLine();

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at " + home + "! I'm from a place called Oracle");
        System.out.println("\nHow old are you?");
        //Pick up age and store it.
        int age = sr.nextInt();
        sr.nextLine();
        //add new a line before asking next question.
        System.out.println("So you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400/age) + " times older than you.");
        System.out.println("Enough about me. \nWhat's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        String favoriteLang = sr.nextLine();


        //add new a line here.
        System.out.println("\n"+ favoriteLang + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        //close scanner. 

        sr.close();
    }
}
