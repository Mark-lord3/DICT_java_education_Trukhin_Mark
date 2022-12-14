import java.util.Scanner;
public class Main {
    static int water=400;
    static int milk=540;
    static int coffee_beans=120;
    static int cups=9;
    static int money=550;
    static Scanner input;
    static int r()
    {
        return 0;
    }

    public static void remaining()
    {
        System.out.println("The coffee machine has:");
        System.out.println(water+"of water");
        System.out.println(milk+"of milk!");
        System.out.println(coffee_beans+"of coffee beans");
        System.out.println(cups+"of disposable cups");
        System.out.println(money+"of money");
    }
    public static int enough()
    {
       if(water<0)
       {
           System.out.println("Sorry, not enough water");
           return 0;
       } else if (milk<0) {
           System.out.println("Sorry, not enough milk");
           return 0;
       }else if (coffee_beans<0) {
           System.out.println("Sorry, not enough coffee_beans");
           return 0;
       }else if (cups<0) {
           System.out.println("Sorry, not enough disposable cups");
           return 0;
       }
        return 1;
    }
    public static String buy()
    {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4-> back to main menu:");
        input = new Scanner(System.in);
        int answer_user=input.nextInt();
        if(answer_user==1)
        {
            water-=250;
            coffee_beans-=16;
            cups-=1;
            money+=4;
            if(enough()!=0)
            {
                System.out.println("I have enough resources, making you a coffee!");
            }else{
                enough();
            }
            return ("espresso");
        }else if(answer_user==2)
        {
            water-=350;
            milk-=75;
            coffee_beans-=20;
            cups-=1;
            money+=7;
            if(enough()!=0)
            {
                System.out.println("I have enough resources, making you a coffee!");
            }else{
                enough();
            }
            return ("latte");
        }else if(answer_user==3)
        {
            water -= 200;
            milk -= 100;
            coffee_beans -= 12;
            cups -= 1;
            money += 6;
            if(enough()!=0)
            {
                System.out.println("I have enough resources, making you a coffee!");
            }else{
                enough();
            }
            return ("cappucino");
        }else if(answer_user==4)
        {
            return "back";
        }

        return null;
    }
    public static void fill()
    {
        System.out.println("Write how many ml of water you want to add:");
        input = new Scanner(System.in);
        int add_water=input.nextInt();
        water+=add_water;
        System.out.println("Write how many ml of milk you want to add:");
        int add_milk=input.nextInt();
        milk+=add_milk;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int add_coffee_beans=input.nextInt();
        coffee_beans+=add_coffee_beans;
        System.out.println("Write how many disposable coffee cups you want to add:");
        int add_cups=input.nextInt();
        cups+=add_cups;
    }
    public static void take()
    {
        System.out.println("I gave you"+money);
        money=0;
    }
    public static String action()
    {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        input = new Scanner(System.in);
        String action_user=input.nextLine();
        if(action_user.equals("buy"))
        {
            System.out.println("");
            buy();
            return "fill";
        }else if(action_user.equals("fill"))
        {
            System.out.println("");
            fill();
            return "fill";
        }else if(action_user.equals("take"))
        {
            System.out.println("");
            take();
            return "take";
        }else if(action_user.equals("remaining"))
        {
            System.out.println("");
            remaining();
            return "remaining";
        }else if(action_user.equals("exit"))
        {

            return "exit";
        }
        return null;
    }





    public static void main(String[] args) {
        String while_action="buy";
        while (while_action!="exit")
        {
            while_action=action();
        }
    }
}

