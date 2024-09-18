package shop.tree.menus;

import java.util.Scanner;

import shop.utils.MenuUtilities;

public class EnterShop {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);
        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");
        System.out.println("1 - Shop 1");
        System.out.println("2 - Shop 2");
        System.out.println("3 - Shop 3");
        System.out.println("0 - Go back");
        System.out.print("\nEnter choice: ");

        int data = input.nextInt();

        return data;
    }
}
