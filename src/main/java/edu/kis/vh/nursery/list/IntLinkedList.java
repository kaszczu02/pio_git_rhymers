package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_ERROR = -1;
    private Node lastNode;

    public void push(int i) {
        if (isEmpty())
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_LIST_ERROR;
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_ERROR;
        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevNode();
        return ret;
    }

    public Node getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node lastNode) {
        this.lastNode = lastNode;
    }
}
