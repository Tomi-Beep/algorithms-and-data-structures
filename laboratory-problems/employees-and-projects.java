// Следните класи веќе се импортирани, не е дозволено копирање на класи овде, директно користејте ги како кога се достапни во други локални фајлови:
// The following classes are already imported, copying classes here is not allowed, use them directly as when they are available in other local files:

// CBHT, OBHT, MapEntry, SLLNode веќе се импортирани
// CBHT, OBHT, MapEntry, SLLNode are already imported

import java.util.Objects;
import java.util.Scanner;

// Овде креирајте ги помошните класи за клуч и вредност
// Исполнете ги барањата од текстот за toString методите
// Дополнително осигурете се дека вашата клуч класа ќе ги имплементира потребните
// hashCode и equals методи


// Create the helper classes for key and value here
// Fulfill the requirements from the text for the toString methods
// Additionally, make sure that your key class will implement the required
// hashCode and equals methods
class Person {
    // поставете ги потребните полиња овде
    // declare the required fields here
    String ime;
    int vozrast;

    // имплементирајте соодветен конструктор
    // implement the constructor
    Person(String ime, int vozrast) {
        this.ime = ime;
        this.vozrast = vozrast;
    }

    @Override
    public String toString() {
        return "<" + ime + ", " + vozrast + ">";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return vozrast == person.vozrast && Objects.equals(ime, person.ime);
    }

    // имплементирајте ги следните два методи за да работи табелата правилно
    // implement the following two methods to make the table work properly

    @Override
    public int hashCode() {
        return vozrast * (ime.charAt(0));
    }
}

class Project {
    int vreme;
    int platapochas;

    Project(int vreme, int platapochas) {
        this.vreme = vreme;
        this.platapochas = platapochas;
    }

    @Override
    public String toString() {
        return "<" + vreme + ", " + platapochas + ">";
    }

    public int plata() {
        return vreme * platapochas;
    }
}

public class chillinnn {
    public static void main(String[] args) {
        // Креирајте ја табелата според барањата
        // Create the table as requested
        CBHT<Person, Project> cbht = new CBHT<Person, Project>(10);

        // Прочитајте ги податоците од влезот и пополнете ја табелата
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Person person = new Person(sc.next(), sc.nextInt());
            Project project = new Project(sc.nextInt(), sc.nextInt());
            SLLNode<MapEntry<Person, Project>> node = cbht.search(person);
            if (node == null)
                cbht.insert(person, project);
            else {
                if (node.element.value.plata() < project.plata())
                    cbht.insert(person, project);
            }
        }


        // отпечатете ја вашата табела
        // print your table
        System.out.println(cbht);
    }
}

