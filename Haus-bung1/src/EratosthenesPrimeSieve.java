public class EratosthenesPrimeSieve implements PrimeSieve{
    @Override
    public boolean isPrime(int p) {
        for (int i = p - 1; i > 1;i--)
        {
            if (p%i == 0.0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {

    }
}
