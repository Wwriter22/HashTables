/**
 * HashTables
 * Description of program
 * Author: William Writer
 * Date: 3/7/22
 * On My Honor, I confirm that I followed all collaboration policy guidelines, and that the work I am submitting is my own: WW
 **/
public class HashTablesDriver {
    public static void main(String[] args) {
        HashTables hashTable = new HashTables(2000);

        // testing put
        System.out.println(hashTable.put("Colin", "ur mom")); // return true
        System.out.println(hashTable.put("Ishan", "daddy"));// return true



        //testing get
        System.out.println(hashTable.get("Ishan")); //should return daddy
        System.out.println(hashTable.get("Colin")); //should return ur mom
        System.out.println(hashTable.get("HelloWorld")); //should return null


    }
}
