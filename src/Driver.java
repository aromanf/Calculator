import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        bCalculator bcalc = new bCalculator();
        Scanner reader = new Scanner(System.in);
        String choice;
        int x,y;
        boolean quit = false;



        while(!quit) {
            System.out.println("--- Calculator ---");
            System.out.println("+ : Addition\n- : Subtraction\n* : Multiplication\n quit: Quit\n");
            System.out.print("Select an option: ");
            choice = reader.next();
            switch(choice) {
                case "+" :
                    System.out.print("Enter the first number: ");
                    x = Integer.parseInt(reader.next());
                    System.out.print("Enter the second number: ");
                    y = Integer.parseInt(reader.next());
                    System.out.println(x + " " + choice + " " + y + " = " + bcalc.add(x,y) + "\n");
                    break;
                case "-" :
                    System.out.print("Enter the first number: ");
                    x = Integer.parseInt(reader.next());
                    System.out.print("Enter the second number: ");
                    y = Integer.parseInt(reader.next());
                    System.out.println(x + " " + choice + " " + y + " = " + bcalc.subs(x,y) + "\n");
                    break;
                case "*":
                    System.out.print("Enter the first number: ");
                    x = Integer.parseInt(reader.next());
                    System.out.print("Enter the second number: ");
                    y = Integer.parseInt(reader.next());
                    System.out.println(bcalc.multiply(x,y) + "\n");
                    break;
                case "quit" :
                    quit = true;
            }
        }
    }
}
