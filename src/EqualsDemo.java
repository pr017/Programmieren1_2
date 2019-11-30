import java.util.ArrayList;

public class EqualsDemo {

    public static void main(String[] args) {
        Person p1 = new Person("Max","Mustermann");
        Person p2 = new Person("Petra","Mustermann");
        Person p3 = new Person("Max","Mustermann");

        if(p1.equals(p3)){
            System.out.println("selbe Person");
        } else {
            System.out.println("andere Person");
        }

        ArrayList<Person> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);

        if(personen.contains(p3)){
            System.out.println("Ist schon vorhanden!");
        } else {
            personen.add(p3);
        }

        System.out.println(personen);
    }
}
