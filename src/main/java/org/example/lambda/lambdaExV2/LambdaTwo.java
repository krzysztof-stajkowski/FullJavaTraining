package org.example.lambda.lambdaExV2;

public class LambdaTwo {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.print(); //standardowe wywołanie metody z interfejsu funkcyjnego

        printThing(cat); //wywołanie metody która przechowuje typ z interfejsu i na nim możemy wykonać metodę

        //LAMBDA - jak działa
            //metodę z klasy Cat przerabiamy tak że ma tylko nawias i ->
                /* Z:
                    public void print() {
                    System.out.println("Something");
                    }
                   NA:
                    () -> System.out.println("Something");

                 */
        Printable something = () -> System.out.println("Something");
        printThing(something);

        PrintableWithParam somethingParam = (s) -> System.out.println("Something with suffix " + s);
        printThing2(somethingParam);

        PrintableWithTwoParams somethingTwoParams = (p,s) -> System.out.println("Something with suffix " + p + s);
        printThing3(somethingTwoParams);

    }

    static void printThing(Printable thing) { //obiekt z interfejsu funkcyjnego dletego możemy w tej metodzie wywołać metodę z niego
        thing.print();
    }

    static void printThing2(PrintableWithParam thing) {
        thing.print2("ABC");
    }

    static void printThing3(PrintableWithTwoParams thing) {
        thing.print3("ABC", "EFG");
    }

}
