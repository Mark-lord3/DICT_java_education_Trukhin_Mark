package ChatBot;
import java.util.Scanner;

public class chatbot {
    public static void main(String[] args) {
        System.out.println("Hello !My name is ChatBot");
        System.out.println("I was created in 2021");
        System.out.println("Please,remind me your name.");
        Scanner scanner = new Scanner(System.in);
        String FName =scanner.nextLine();
        System.out.printf("What a great name you have: %s\n",FName);
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int re3 =scanner.nextInt();
        int re5 =scanner.nextInt();
        int re7 =scanner.nextInt();
        float age = (re3 * 70 + re5 * 21 + re7 * 15) % 105;

        System.out.println("Your age is "+ age+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number =scanner.nextInt();
        int i=0;
        while(i<number){
            System.out.println("!"+i);
            i++;
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int f =scanner.nextInt();
        while(f!=4){
            System.out.println("Please, try again.");
            f =scanner.nextInt();
        }
        System.out.println("Completed, have a nice day!");
        System.out.println("Congratulations, have a nice day!");

    }
}
