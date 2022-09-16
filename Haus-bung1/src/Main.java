public class Main {
    public static void main(String[] args) {
        EratosthenesPrimeSieve e = new EratosthenesPrimeSieve(20);  //zum Testen
        System.out.println(e.isPrime(10));
        System.out.println("");
        e.printPrimes();

    }
}