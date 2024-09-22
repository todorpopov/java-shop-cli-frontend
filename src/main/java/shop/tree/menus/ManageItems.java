package shop.tree.menus;
import java.util.Scanner;

import shop.tree.menus.interfaces.Menu;
import shop.utils.MenuUtilities;

public class ManageItems implements Menu {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");
        System.out.println("1 - Create new Item");
        System.out.println("2 - List existing Items");
        System.out.println("3 - Delete existing Item");
        System.out.println("0 - Go back");
        System.out.print("\nEnter choice: ");

        int data = input.nextInt();

        return data;
    }
}