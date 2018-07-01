import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        bCalculator bcalc = new bCalculator();
        Scanner reader = new Scanner(System.in);
        String choice;
        int x,y;
        boolean quit = false;


        System.out.println("--- Calculator ---");

        while(!quit) {
            System.out.println("Select an option: ");
            choice = reader.nextLine();
            switch(choice) {
                case "+" :
                    System.out.println("Enter the first number: ");
                    x = Integer.parseInt(reader.next());
                    System.out.println("Enter the second number: ");
                    y = Integer.parseInt(reader.next());
                    System.out.println(x + " " + choice + " " + y + " = " + bcalc.add(x,y));
                    break;
                case "-" :
                    System.out.println("Enter the first number: ");
                    x = Integer.parseInt(reader.next());
                    System.out.println("Enter the second number: ");
                    y = Integer.parseInt(reader.next());
                    System.out.println(x + " " + choice + " " + y + " = " + bcalc.subs(x,y));
                    break;
                case "quit" :
                    quit = true;

            }
        }
    }
}
