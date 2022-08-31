package org.example.lambda.lambdaV3;

public class Main {
    public static void main(String[] args) {

        //TEN PRZYKŁAD NIE DZIAŁA JAK POWINNO
        // https://www.youtube.com/watch?v=tj5sLSFjVj4

        Printable lambdaPrintable = (s) -> "aaa" + s;
        printThings(lambdaPrintable);
    }


    static void printThings(Printable thing) { //obiekt z interfejsu funkcyjnego dlatego możemy w tej metodzie wywołać metodę z niego
        thing.print("!");
    }

}
