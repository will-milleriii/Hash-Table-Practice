public class HashTable {

    String[] hashArray;
    int arraySize;
    int size = 0; //counts number of elements in hash table

    public HashTable(int numOfSlots) {

        if (isPrime(numOfSlots)) {
            hashArray = new String[numOfSlots];
            arraySize = numOfSlots;
        } else {
            int primeCount = getNextPrime(numOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;

            System.out.println("Hash Table size given " + numOfSlots + " is not a prime");
            System.out.println("Hash Table size changed to: " + primeCount);
        }
    }

    public boolean isPrime(int num){
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public int getNextPrime(int minNum){
        for (int i = minNum; true; i++){
            if (isPrime(i)){
                return i;
            }
        }
    }
}
