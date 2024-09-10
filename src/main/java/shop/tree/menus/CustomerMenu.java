package shop.tree.menus;
import java.util.Scanner;
import shop.utils.MenuUtilities;

public class CustomerMenu implements Menu {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Enter Shop");
        System.out.println("0 - Go back");
        System.out.print("\nEnter choice: ");


        int data = input.nextInt();

        return data;
    }
}
