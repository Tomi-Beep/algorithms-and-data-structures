import java.util.*;

class Vraboten {
    String ime;
    int vozrast;

    Vraboten(String ime, int vozrast) {
        this.ime = ime;
        this.vozrast = vozrast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vraboten vraboten = (Vraboten) o;
        return vozrast == vraboten.vozrast && Objects.equals(ime, vraboten.ime);
    }

    @Override
    public int hashCode() {
        return vozrast * ime.charAt(0);
    }

    @Override
    public String toString() {
        return "<"+ime+", "+vozrast+">";
    }
}

class Proekt {
    int rabotno_vreme;
    int plata_po_chas;

    Proekt(int rabotno_vreme, int plata_po_chas) {
        this.rabotno_vreme = rabotno_vreme;
        this.plata_po_chas = plata_po_chas;
    }

    public int vkupnaPlata() {
        return rabotno_vreme * plata_po_chas;
    }
    public String toString() {
        return "<"+rabotno_vreme+", "+plata_po_chas+">";
    }
}

public class chillinnn {
    public static void main(String[] args) {
        CBHT<Vraboten, Proekt> tabela = new CBHT<>(10);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Vraboten v = new Vraboten(sc.next(), sc.nextInt());
            Proekt p = new Proekt(sc.nextInt(), sc.nextInt());
            if (tabela.search(v) == null) {
                tabela.insert(v, p);
            } else {
                SLLNode<MapEntry<Vraboten, Proekt>> node = tabela.search(v);
                if (node.element.value.vkupnaPlata() < p.vkupnaPlata()) {
                    tabela.insert(v, p);
                }
            }
        }
        System.out.println(tabela);
    }
}
