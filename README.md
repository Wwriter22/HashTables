# HashTables
Writing a bunch of challenges that create a Hashmap


Good Characteristics: 1) The hash value is fully determined by the data being hashed. 2) The hash function uses all the input data. 3) The hash function "uniformly" distributes the data across the entire set of possible hash values. 4) The hash function generates very different hash values for similar strings. [LINK](https://www.sparknotes.com/cs/searching/hashtables/section2/)

Challenge #1:
     *Which is a better hash function:
           x % n where n is a large number with several factors
           x % n where n is a large prime number 
           
           Prove your answer with a simple example.
                *  The better Hash function is the large prime number because the number is more unique when dividing by a prime number
                5 % 100 which is a large number with several factors    OR
                5 % 37 which will always have a remainder.
                
Challenge #2:      
     * Is char values summed % 599 a good hash function for strings? 
     
     
                Why or why not?
                    * Even though 599 seems like a good number because it is a prime number and is large, I don't believe that it is a large enough number because                         there are many words that wont use all of the input data because the value of the chars surpass 599.


Challenge #3:

Take a look at Java's HashMap class and how it produces hashed values. Then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

              * Java's HashMap is a data structure that works on hasing Principles by storing objects and retrieving it in constant time O(1) given we know the key
              * Objects are stored by the calling put(key, value) method of HashMap and retrieved by calling the get(key) method
              * Table: an index of the internal array
              * internally stores mapping in the form of Map.Entry object which contains both key and value object.
              * Contains both a key and a value
              * Things can get tricky when collisions occur
                    * internal array of HashMap is of fixed size, and if you keep storing objects, at some point in time hash function will return the same bucket                         location for two different keys, this is called collision in HashMap
              * String is the most frequently used key as well because String is immutable and final, and overrides equals and hashcode() method.
              * is an O(n) operation. Worst case: O(logN)
              https://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html
              
              * Math
                  * For: modular hashing, the hash function is simply h(k) = k (mod m for some m usually, the number of buckets)
                  * "If m is a power of two (i.e., m=2p), then h(k) is just the p lowest-order bits of k"
                  https://www.cs.cornell.edu/courses/cs312/2008sp/lectures/lec21.html
