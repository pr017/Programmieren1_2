import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> personen = new ArrayList<>();

        personen.add("Max Muster");
        personen.add("Silvia Muster");
        personen.add("John Doe");

        System.out.println("anzahl: " + personen.size());

        for(String person : personen){
            System.out.println("person = " + person);
        }

        System.out.println();           //Leerzeile

        for(int p = 0; p< personen.size(); p++){
            System.out.println("personen = " + personen.get(p));
        }

        System.out.println();

        System.out.println(personen);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(23);
        numbers.add(-13);

        System.out.println(numbers);

        System.out.println("beinhaltet? -> " + numbers.contains(23));
        System.out.println("beinhaltet? -> " + numbers.contains(0));

        numbers.remove(2);
        System.out.println(numbers);

        numbers.remove(new Integer(23));
        System.out.println(numbers);


    }
}
