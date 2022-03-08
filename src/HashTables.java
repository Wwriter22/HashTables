/**
 * HashTables
 * Description of program
 * Author: William Writer
 * collaborator: I got mareks to help me with hashcode method
 * Date: 3/7/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class HashTables {
    private String[] array;
    int buckets;

    //initializes an array of size capacity
    public HashTables(int capacity){
        array = new String[capacity];
        buckets = 0;
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        boolean successful = false;
        int hash = hashCode(key);

        // this makes it so that the number of buckets wont ever run out in the hash table
        if(buckets == array.length){
            String[] newHashTable = new String[array.length * 2];
            System.arraycopy(array, 0, newHashTable, 0, array.length);
            array = newHashTable;
        }

        while(hash >= array.length){
            String[] newHashTable = new String[array.length * 2];
                for (int i = 0; i<array.length;i++){
                    newHashTable[i] = array[i];
                }
                array = newHashTable;
        }

        if (array[hash] == null) { //if placeholder doesn't exist already, run. if not, successful will continue to be false
            successful = true; // changes the value of successful to true
            array[hash] = value;
            buckets ++;
        }
        return successful;
    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){

        int hash = hashCode(key);
        //makes the hashtable bigger again
        while(hash >= array.length){
            String[] newHashTable = new String[array.length * 2];
            System.arraycopy(array, 0, newHashTable, 0, array.length);
            array = newHashTable;
        }

        return array[hash]; // returns the value in the inputted key slot
    }

    //returns the unique int in the range of the [0, array length)
//    private int hashCode(String key){
//
//        String keyPlacement = "";
//
//        for (int i = 0; i<key.length(); i++){
//            //adding each integer values of the string
//            keyPlacement += (int)key.charAt(i)-'a';
//        }
//
//        return (int) Integer.parseInt(keyPlacement);
//    }
    private int hashCode(String key){

        //initialize and declare an int value that will be returned later
        int keyPlacement = 0;

        // for loop of the keys length to access each char.
        for (int i = 0; i<key.length(); i++){
            //adding each integer values of the string
            keyPlacement += (int)key.charAt(i);
        }

        return keyPlacement;
    }
}
