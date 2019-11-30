public class DemoLoops {

    public static void main(String[] args) {

        for (int z=0; z<8; z++){

            System.out.print("z: " + z + " ");

            for (int s=0; s<5; s++){

                System.out.print("s: " + s + " ");
            }

            System.out.println("-> innen fertig");
        }

        System.out.println("außen fertig");

    }


}
