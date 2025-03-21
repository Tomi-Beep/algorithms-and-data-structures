import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MapEntry<K extends Comparable<K>,E> implements Comparable<K> {
    K key;
    E value;

    public MapEntry (K key, E val) {
        this.key = key;
        this.value = val;
    }
    public int compareTo (K that) {
        @SuppressWarnings("unchecked")
		MapEntry<K,E> other = (MapEntry<K,E>) that;
        return this.key.compareTo(other.key);
    }
    public String toString () {
        return "(" + key + "," + value + ")";
    }
}


class OBHT<K extends Comparable<K>,E> {

    private MapEntry<K,E>[] buckets;
    static final int NONE = -1; // ... distinct from any bucket index.
    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static final MapEntry former = new MapEntry(null, null);
    private int occupancy = 0;
    
    @SuppressWarnings("unchecked")
	public OBHT (int m) {
        buckets = (MapEntry<K,E>[]) new MapEntry[m];
    }

    private int hash (K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }
    
    public MapEntry<K,E> getBucket(int i){
    	return buckets[i];
    }
    
    public int search (K targetKey) {
        int b = hash(targetKey); int n_search=0;
        for (;;) {
            MapEntry<K,E> oldEntry = buckets[b];
            if (oldEntry == null)
                return NONE;
            else if (targetKey.equals(oldEntry.key))
                return b;
            else{
                b = (b + 1) % buckets.length;
                n_search++;
      	        if(n_search==buckets.length)
                    return NONE;
            }
        }
    }

    public void insert (K key, E val) {
        MapEntry<K,E> newEntry = new MapEntry<K,E>(key, val);
        int b = hash(key); int n_search=0;
        
        for (;;) {
            MapEntry<K,E> oldEntry = buckets[b];
            if (oldEntry == null) {
                if (++occupancy == buckets.length) {
                    System.out.println("Hash tabelata e polna!!!");
                }
                buckets[b] = newEntry;
                return;
            } else if (oldEntry == former
                    || key.equals(oldEntry.key)) {
                buckets[b] = newEntry;
                return;
            } else{
                b = (b + 1) % buckets.length;
                n_search++;
      	        if(n_search==buckets.length)
                    return;

            }
        }
    }
    
    @SuppressWarnings("unchecked")
	public void delete (K key) {
        int b = hash(key); int n_search=0;
        for (;;) {
            MapEntry<K,E> oldEntry = buckets[b];
            
            if (oldEntry == null)
                return;
            else if (key.equals(oldEntry.key)) {
                buckets[b] = former;
                return;
            } else{
                b = (b + 1) % buckets.length;
                n_search++;
      	        if(n_search==buckets.length)
                    return;

            }
        }
    }

    public String toString () {
    	String temp = "";
    	for (int i = 0; i < buckets.length; i++) {
    	    temp += i + ":";
    	    if (buckets[i] == null)
    	        temp += "\n";
    	    else if (buckets[i] == former)
    	        temp += "former\n";
    	    else
    	        temp += buckets[i] + "\n";
    	}
    	return temp;
    }
}

class Zbor implements Comparable<Zbor> {
    String zbor;

    public Zbor(String zbor) {
        this.zbor = zbor.toLowerCase(); // Store words in lowercase
    }
    
    @Override
    public boolean equals(Object obj) {
        Zbor pom = (Zbor) obj;
        return this.zbor.equals(pom.zbor);
    }
    
    @Override
    public int hashCode() {
        // Simple but effective hash function for strings
        int hash = 0;
        for (int i = 0; i < zbor.length(); i++) {
            hash = hash * 31 + zbor.charAt(i);
        }
        return hash;
    }
    
    @Override
    public String toString() {
        return zbor;
    }
    
    @Override
    public int compareTo(Zbor arg0) {
        return zbor.compareTo(arg0.zbor);
    }
}

public class Speluvanje {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // Choose hash table size as next prime number after 2*N
        // to maintain load factor below 0.5 for better performance
        int hashSize = nextPrime(2 * N);
        OBHT<Zbor, String> tabela = new OBHT<Zbor,String>(hashSize);
        
        // Read dictionary words
        for (int i = 0; i < N; i++) {
            String word = br.readLine().trim().toLowerCase();
            tabela.insert(new Zbor(word), word);
        }
        
        // Read text to check
        String line = br.readLine();
        // Split into words and remove punctuation
        String[] words = line.split("\\s+");
        boolean allCorrect = true;
        
        for (String word : words) {
            // Remove punctuation and convert to lowercase for checking
            word = word.replaceAll("[.,!?]", "").trim();
            if (word.isEmpty()) continue;
            
            // Skip if it's just punctuation
            if (word.matches("^[.,!?]+$")) continue;
            
            // Convert to lowercase for dictionary lookup
            Zbor searchWord = new Zbor(word.toLowerCase());
            
            if (tabela.search(searchWord) == OBHT.NONE) {
                System.out.println(word);
                allCorrect = false;
            }
        }
        
        if (allCorrect) {
            System.out.println("Bravo");
        }
    }
    
    // Helper method to find next prime number
    private static int nextPrime(int n) {
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }
    
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
