public class EratosthenesPrimeSieve implements PrimeSieve{
    private int obergrenze = 0;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        for (int i = p - 1; i > 1;i--)  //i geht durch alle Zahlen durch die < p sind
        {
            if (p%i == 0.0) {   //Kontrolle, ob eins davon p teilen kann
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        if (obergrenze == 0)    //Kontrolle
        {System.out.println("obergrenze muss größer als 0 sein");
         return;}

        boolean[] gestrichen = new boolean[obergrenze]; //unmarkierte zahlen gespeichert
        for (int i = 2; i < obergrenze; i++) {
            gestrichen[i] = false;
        }

        for (int basis = 2; basis*2 < obergrenze; basis++) {     //nicht primzahlen markieren
            if (gestrichen[basis] == false)
            {
                for (int mal = 2; basis*mal < obergrenze; mal++)
                {
                    gestrichen[basis*mal] = true;
                }
            }
        }

        for (int i = 2; i < obergrenze; i++) {
            if (gestrichen[i] == false)
            {
            System.out.println(i);
            }
        }
    }
}
