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

    public int hashFunction(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if (hashVal < 0){
            hashVal += arraySize;
        }
        return hashVal; //ideal index position for insertion or search for
    }

    //return step size > 0
    public int secondHashFunction(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if (hashVal < 0){
            hashVal += arraySize;
        }
        return 3 - hashVal % 3; //3 is used because it is a prime number smaller than the array size
    }

    public void insert(String word){
        int hashVal = hashFunction(word);
        int stepSize = secondHashFunction(word);

        while (hashArray[hashVal] != null){
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }

        hashArray[hashVal] = word;
        System.out.println("Inserted word: " + word);
        size++;
    }

    public String findWord(String word){
        int hashVal = hashFunction(word);
        int stepSize = secondHashFunction(word);

        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].equals(word)){
                return hashArray[hashVal];
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashArray[hashVal];
    }
}
