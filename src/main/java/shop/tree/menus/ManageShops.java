package shop.tree.menus;

import java.util.Scanner;

import shop.utils.MenuUtilities;

public class ManageShops implements Menu {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);
        
        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");
        System.out.println("1 - Create new Shop");
        System.out.println("2 - List existing Shops");
        System.out.println("3 - Delete existing Shop");
        System.out.println("0 - Go back");
        System.out.print("\nEnter choice: ");

        int data = input.nextInt();

        return data;
    }
}
