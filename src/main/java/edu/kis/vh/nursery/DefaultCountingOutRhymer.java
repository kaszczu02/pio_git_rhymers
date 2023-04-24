package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_RHYMER_VALUE = -1;
    public static final int RHYMER_CAPACITY = 12;
    public static final int RHYMER_EMPTY_ERROR = -1;


    private int[] numbers = new int[RHYMER_CAPACITY];
    public int total = EMPTY_RHYMER_VALUE;

    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_VALUE;
    }

    public boolean isFull() {
        return total == RHYMER_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return RHYMER_EMPTY_ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RHYMER_EMPTY_ERROR;
        return numbers[total--];
    }

}
