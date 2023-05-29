package edu.kis.vh.nursery;

/**
 * Klasa `FIFORhymer` rozszerza klasę `DefaultCountingOutRhymer` i implementuje zachowanie pierwszy na wejściu, pierwszy na wyjściu (FIFO) dla liczenia elementów.
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

    /**
     *Pobiera i usuwa najwyższy element ze stosu rhymer.
     *Przesłania metodę `countOut()` z klasy `DefaultCountingOutRhymer`.
     * @return wartość najwyższego elementu na stosie rhymer
     */
    @Override
    public int countOut() {
        while (!callCheck())
            rhymer.countIn(super.countOut());

        int ret = rhymer.countOut();

        while (!rhymer.callCheck())
            countIn(rhymer.countOut());

        return ret;
    }
}
