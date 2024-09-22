package shop.tree.menus;

import java.util.Scanner;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import shop.data.dtos.ShopDTO;
import shop.tree.menus.interfaces.DynamicMenu;
import shop.data.ApiAccess;
import shop.utils.MenuUtilities;

public class EnterShopMenu implements DynamicMenu {
    public int data(){
        MenuUtilities.clearScreen();

        Scanner input = new Scanner(System.in);
        System.out.println("Shop Project in Java");
        System.out.println("-------------------------\n");

        try {
            this.printApiData();
        } catch(Exception exception) {
            System.out.println("An error occured!");
            try {
                Thread.sleep(2000);
            } catch(InterruptedException threadException) {
                Thread.interrupted();
            }
            return 0;
        }
        System.out.print("\nEnter shop id to enter or 0 to go back: ");

        int data = input.nextInt();

        return data;
    }

    public void printApiData() throws Exception{
        ApiAccess api = ApiAccess.getInstance();

        ArrayList<ShopDTO> shops = api.getAllShops();
        shops.forEach(shop -> {
            System.out.println(shop.toString());
        });
    }
}
