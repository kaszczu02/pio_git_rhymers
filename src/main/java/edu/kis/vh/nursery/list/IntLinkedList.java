package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY_LIST_ERROR = -1;
    public Node lastNode;

    public void push(int i) {
        if (isEmpty())
            lastNode = new Node(i);
        else {
            lastNode.nextNode = new Node(i);
            lastNode.nextNode.prevNode = lastNode;
            lastNode = lastNode.nextNode;
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
        return lastNode.value;
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_ERROR;
        int ret = lastNode.value;
        lastNode = lastNode.prevNode;
        return ret;
    }

}
