package shop.tree.menus;
import java.util.Scanner;

import shop.tree.menus.interfaces.Menu;
import shop.utils.MenuUtilities;

public class MainMenu implements Menu{
    public int data() {
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);

        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter as a Customer");
        System.out.println("2 - Enter as an Admin");
        System.out.println("0 - Quit");
        System.out.print("\nEnter choice: ");

        int data = input.nextInt();

        return data;
    }
}
