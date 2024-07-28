package shop.tree;

import java.util.HashMap;

import shop.tree.menus.Menu;

public class TreeNode {
    TreeNode previous;
    Menu menu;
    HashMap<Integer, TreeNode> next;

    public TreeNode(TreeNode previous, Menu menu) {
        this.previous = previous;
        this.menu = menu;
        this.next = new HashMap<>(); 
    }

    void addToNext(int key, TreeNode node){
        this.next.put(key, node);
    }

    int getData() {
        return this.menu.data();
    }
}
