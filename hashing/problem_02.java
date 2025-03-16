import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;
import java.util.*;

class Person {
    String ime;
    String prezime;
    int budzet;
    String ip_adresa;
    String vreme;
    String grad;
    int cena;

    Person(String ime, String prezime, int budzet, String ip_adresa, String vreme, String grad, int cena) {
        this.ime = ime;
        this.prezime = prezime;
        this.budzet = budzet;
        this.ip_adresa = ip_adresa;
        this.vreme = vreme;
        this.grad = grad;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " with salary " + budzet + " from address " + ip_adresa + " who logged in at " + vreme;
    }
}

public class chillinnn {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        HashMap<String, ArrayList<Person>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String red = sc.nextLine();
            String[] a = red.split(" +");
            String mrezha = a[3].substring(0, a[3].lastIndexOf("."));
            Person person = new Person(a[0], a[1], Integer.parseInt(a[2]), a[3], a[4], a[5], Integer.parseInt(a[6]));
            if (!map.containsKey(mrezha)) {
                map.put(mrezha, new ArrayList<>());
            }
            map.get(mrezha).add(person);
        }
        int M = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < M; i++) {
            String red = sc.nextLine();
            String[] a = red.split(" +");
            String mrezha = a[3].substring(0, a[3].lastIndexOf("."));
            ArrayList<Person> map_mrezha = map.get(mrezha);
            int counter = 0;
            int sat = Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            Person mini = null;
            for (Person choek : map_mrezha) {
                String[] podelba = choek.vreme.split(":");
                int satt = Integer.parseInt(podelba[0]);
                int minn = Integer.parseInt(podelba[1]);
                if (satt > 11 || (satt == 11 && minn > 59)){
                    counter++;
                    if (sat > satt || (sat == satt && min > minn)) {
                        mini = choek;
                        sat = satt;
                        min = minn;
                    }
                }
            }
            System.out.println("IP network: " + mrezha + " has the following number of users:");
            System.out.println(counter);
            System.out.println("The user who logged on earliest after noon from that network is:");
            System.out.println(mini.toString());
            System.out.println();
        }
    }
}
