package org.example.basics.control_flow_statements;

public class InfiniteLoop {
    public static void main(String[] args) {

       //Nieskończona pętla while
        while(true) {
            int random = (int)Math.round(10 * Math.random());
            System.out.println(random);

            if(random == 10){
                System.out.println("Wyjście z pętli while.");
                break;
            }
        }

        System.out.println("------------------------------------");

        //Nieskończona pętla for
        for( ; ; ) {
            int random = (int)Math.round(10 * Math.random());
            // math round zwraca domyślnie Long i najbliższą liczbę do wartości całkowitej. Tak więc gdy zwracamy Long a chcemy przypisać do zmiennej random int
            //to musimy castować do int

            System.out.println(random);

            if(random == 3 || random == 8){
                System.out.println("Wyjście z pętli for.");
                break;
            }
        }

    }

}