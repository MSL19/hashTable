/**
 * Name: Max Lewis
 * Lab Name: hashTable1
 * Lab Purpose: create a hash table, which has methods that are all O(1), which is better than a normal dictionary
 * Date: 10/02/18
 * Collaborators: None
 */
public class hashTable1 {
    //Challenge 1: x should be a large prime because if it has multiple factors then multiple values will work....essentially you will get more collission
    //Challenge 2: Although 599 is prime, it is not very large and summing the values of the chars is very predictable
    //challenge 3: 31*result + .......

    //initializes an array of size capacity
    String[] hashAr;

    public hashTable1(int capacity){
        this.hashAr = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int index = key.hashCode()%hashAr.length;
        boolean retB = (hashAr[index] == null);
        try{
            if (retB) {
                hashAr[index] = value;
            } else {
                throw new Exception("Collision occured");
            }
        }
        catch(Exception E) {
            System.out.println(E);
        }
        return retB;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = key.hashCode()%hashAr.length;
        return hashAr[index];
    }

    //returns the unique int in the range of the [0, array length)
    //private int hashCode(String key)
}
