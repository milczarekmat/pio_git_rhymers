package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * totalRejected reprezentuje liczbe odrzuconych wyliczanek
     */
    int totalRejected = 0;

    /**
     * metoda ta zwraca liczbe odrzuconych wyliczanek
     * @return - liczba odrzuconych wyliczanek
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * jezeli in jest wieksza od ostatniej liczby na stosie to zwieksza liczbe odrzconych wyliczanek (totalRejected)
     * inaczej odklada na stosie, jezeli ten nie jest zapelniony
     * @param in - liczba, ktora ma byc odlozona na stosie
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
