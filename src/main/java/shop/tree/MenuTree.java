package shop.tree;

import shop.tree.menus.*;

public class MenuTree {
    private TreeNode currentNode;

    public MenuTree() {
        Menu mainMenu = new MainMenu();
        Menu customerMenu = new CustomerMenu();
        Menu adminMenu = new AdminMenu();
        Menu manageShops = new ManageShops();
        Menu manageItems = new ManageItems();
        Menu manageCashiers = new ManageCashiers();

        TreeNode mainMenuTreeNode = new TreeNode(null, mainMenu);
        TreeNode customerMenuTreeNode = new TreeNode(mainMenuTreeNode, customerMenu);
        TreeNode adminMenuTreeNode = new TreeNode(mainMenuTreeNode, adminMenu);
        TreeNode manageShopsTreeNode = new TreeNode(adminMenuTreeNode, manageShops);
        TreeNode manageItemsTreeNode = new TreeNode(adminMenuTreeNode, manageItems);
        TreeNode manageCashiersTreeNode = new TreeNode(adminMenuTreeNode, manageCashiers);

        mainMenuTreeNode.addToNext(1, customerMenuTreeNode);
        mainMenuTreeNode.addToNext(2, adminMenuTreeNode);
        adminMenuTreeNode.addToNext(1, manageShopsTreeNode);
        adminMenuTreeNode.addToNext(2, manageItemsTreeNode);
        adminMenuTreeNode.addToNext(3, manageCashiersTreeNode);

        this.currentNode = mainMenuTreeNode;
        this.traverseTree();
    }

    private void goToNextNode(int key) {
        this.currentNode = this.currentNode.next.get(key);
    }

    private void goToPreviousNode() {
        this.currentNode = this.currentNode.previous;
    }

    private void traverseTree() {
        while(true) {
            int value = this.currentNode.getData();
            if(value == 0 && this.currentNode.previous == null) {
                System.exit(0);
            } else if(value == 0 && this.currentNode.previous != null) {
                this.goToPreviousNode();
            } else {
                this.goToNextNode(value);
            }
        }
    }
}
