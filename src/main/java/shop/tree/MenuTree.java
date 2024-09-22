package shop.tree;

import shop.tree.menus.*;
import shop.tree.menus.interfaces.Menu;

public class MenuTree {
    private static MenuTree instance;
    private TreeNode currentNode;

    private MenuTree() {
        Menu mainMenu = new MainMenu();
        Menu customerMenu = new CustomerMenu();
        Menu enterShopMenu = new EnterShopMenu();
        Menu adminMenu = new AdminMenu();
        Menu manageShops = new ManageShops();
        Menu manageItems = new ManageItems();
        Menu manageCashiers = new ManageCashiers();

        TreeNode mainMenuTreeNode = new TreeNode(null, mainMenu);
        TreeNode customerMenuTreeNode = new TreeNode(mainMenuTreeNode, customerMenu);
        TreeNode enterShopMenuTreeNode = new TreeNode(customerMenuTreeNode, enterShopMenu);
        TreeNode adminMenuTreeNode = new TreeNode(mainMenuTreeNode, adminMenu);
        TreeNode manageShopsTreeNode = new TreeNode(adminMenuTreeNode, manageShops);
        TreeNode manageItemsTreeNode = new TreeNode(adminMenuTreeNode, manageItems);
        TreeNode manageCashiersTreeNode = new TreeNode(adminMenuTreeNode, manageCashiers);

        mainMenuTreeNode.addToNext(1, customerMenuTreeNode);
        customerMenuTreeNode.addToNext(1, enterShopMenuTreeNode);
        mainMenuTreeNode.addToNext(2, adminMenuTreeNode);
        adminMenuTreeNode.addToNext(1, manageShopsTreeNode);
        adminMenuTreeNode.addToNext(2, manageItemsTreeNode);
        adminMenuTreeNode.addToNext(3, manageCashiersTreeNode);

        this.currentNode = mainMenuTreeNode;
        this.traverseTree();
    }

    public static MenuTree getInstance()
    {
        if(instance == null) {
            instance = new MenuTree();
        }
        return instance;
    }

    private void goToNextNode(int key) {
        if(!this.currentNode.keyExists(key)) {
            this.goToPreviousNode();
        } else {
            this.currentNode = this.currentNode.getNextNode(key);
        }
    }

    private void goToPreviousNode() {
        this.currentNode = this.currentNode.getPreviousNode();
    }

    private void traverseTree() {
        while(true) {
            int value = this.currentNode.getData();
            if(value == 0 && this.currentNode.getPreviousNode() == null) {
                System.exit(0);
            } else if(value == 0 && this.currentNode.getPreviousNode() != null) {
                this.goToPreviousNode();
            } else {
                this.goToNextNode(value);
            }
        }
    }
}
