package shop.tree.menus;
import java.util.Scanner;

import shop.tree.menus.interfaces.Menu;
import shop.utils.MenuUtilities;

public class ManageCashiers implements Menu {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");
        System.out.println("1 - Create new Cashier");
        System.out.println("2 - List existing Cashiers");
        System.out.println("3 - Delete existing Cashier");
        System.out.println("0 - Go back");
        System.out.print("\nEnter choice: ");

        int data = input.nextInt();

        return data;
    }
}