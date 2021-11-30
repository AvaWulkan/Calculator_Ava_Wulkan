package calculator_Ava_Wulkan;

import java.util.Scanner;
import static calculator_Ava_Wulkan.CalculatorClasses.*;

public class CalculatorMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean loop = true;

        while (loop) {
            System.out.println("Vad vill du göra?");
            System.out.println("1. Addition");
            System.out.println("2. Substraktion");
            System.out.println("3. Divition");
            System.out.println("4. Multition");
            System.out.println("0. Avsluta programmet");

            int choice = sc.nextInt();
            System.out.println();
            if (choice >= 1 && choice <= 4) {
                System.out.println("Skriv in talen för din uträkning");
                System.out.print("Första talet: ");
                double num1 = sc.nextDouble();

                System.out.print("Andra talet: ");
                double num2 = sc.nextDouble();
                System.out.println();

                switch (choice) {
                    case 1:
                        add(num1, num2);
                        break;
                    case 2:
                        sub(num1, num2);
                        break;
                    case 3:
                        divide(num1, num2);
                        break;
                    case 4:
                        multiply(num1, num2);
                        break;

                }
                System.out.println();
                System.out.println("Vill du göra en till uträkning?");
                System.out.println("1. Ja");
                System.out.println("0. Nej, jag vill avsluta.");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println(choice + " är inte ett alternativ");
                        System.out.println();
                        break;
                }
                System.out.println();

            } else if (choice == 0) {
                loop = false;
            } else {
                System.out.println(choice + " är inte ett alternativ");
                System.out.println();
            }
        }

    }

}
