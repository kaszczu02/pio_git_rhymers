package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_RHYMER_VALUE = -1;
    private static final int RHYMER_CAPACITY = 12;
    private static final int RHYMER_EMPTY_ERROR = -1;

    private final int[] numbers = new int[RHYMER_CAPACITY];

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = EMPTY_RHYMER_VALUE;

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
