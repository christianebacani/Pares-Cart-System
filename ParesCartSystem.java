// Pares Cart System
// Created by Christiane A. Bacani
import java.util.Scanner;
public class ParesCartSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {25,40,50};
        int total = 0;
        boolean order = true;

        System.out.print("PARES CART\n");
        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        while(order){
            System.out.print("AVAILABLE ORDERS :\n");
            System.out.print("1.) Budget Mami\n2.) Pares Mami with Egg\n3.) Pares Mami with Egg and Rice\n");
            System.out.print("Enter your choice here : ");
            int userChoice = input.nextInt();

            if(userChoice >= 1 && userChoice <= 3){

                System.out.print("Enter quantity : ");
                int quantity = input.nextInt();

                total += price[userChoice - 1] * quantity;

                System.out.print("Do you want to buy more ? (y/n) :");
                input.nextLine();
                String buyMore = input.nextLine();

                if(buyMore.equalsIgnoreCase("n")){
                    order = false;
                    System.out.print("The total price is : P " + total + "\n");

                    System.out.print("Enter your payment here : P ");
                    int payment = input.nextInt();

                    int change = payment - total;

                    System.out.print("Change : P " + change);

                    System.out.print("\n\nTHANK YOU, PLEASE COME AGAIN!");

                }
            }
            else{
                System.out.print("\n\nINVALID CHOICE!\n\n");
            }

        }

    }
}

