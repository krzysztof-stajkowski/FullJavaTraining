package org.example.lambda.lambdaExV1;

// interfejs funkcyjny
@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

// interfejs funkcyjny
@FunctionalInterface
interface MathOperation <T> {
    T operate(T a, T b);
}

public class LambdaBasics {

        public void AddTest(Addition addition) {
            System.out.println(addition.add(100, 50));
    }

    public static  void  main(String args[]) {

        Addition addition = (int a, int b) -> a + b;

        System.out.println( addition.add(11, 6) ); // 17
        System.out.println( addition.add(20, 5) ); // 25

        LambdaBasics lambdaBasics = new LambdaBasics();
        lambdaBasics.AddTest( (a, b) -> a*2 + b ); // 250

        MathOperation<Float> addition2 = (a,b) -> a + b;
        System.out.println( addition2.operate(10.0f, 6.0f) ); //16

        MathOperation<Integer> substraction = (a,b) -> a - b;
        System.out.println( substraction.operate(100, 77) ); // 23




    }
}