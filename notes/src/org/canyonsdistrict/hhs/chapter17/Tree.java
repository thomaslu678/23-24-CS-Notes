package org.canyonsdistrict.hhs.chapter17;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root;
    private Object data;
    private List<Node> children;

    class Node {
        public Object data;
        public List<Node> children;

        public int size() {
            var sum = 0;

            for (var child : children) {
                sum += child.size();
            }

            return sum + 1;

        }

    }

    public Tree() {



    }

    public Tree (Object data) {
        root = new Node();
        root.data = data;
        root.children = new ArrayList<>();

    }

    public void addSubtree(Tree subtree) {

        root.children.add(subtree.root);

    }

}
