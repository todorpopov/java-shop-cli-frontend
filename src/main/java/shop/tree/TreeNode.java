package shop.tree;

import java.util.HashMap;

import shop.tree.menus.Menu;

public class TreeNode {
    private TreeNode previous;
    private Menu menu;
    private HashMap<Integer, TreeNode> next;

    public TreeNode(TreeNode previous, Menu menu) {
        this.previous = previous;
        this.menu = menu;
        this.next = new HashMap<>(); 
    }

    public void addToNext(int key, TreeNode node){
        this.next.put(key, node);
    }

    public int getData() {
        return this.menu.data();
    }

    public TreeNode getNextNode(int key) {
        return this.next.get(key);
    }

    public TreeNode getPreviousNode() {
        return this.previous;
    }
}
