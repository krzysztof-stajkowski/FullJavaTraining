package org.example.lambda.lambdaV3;

public class Cat implements Printable {

   public Cat(){};

    @Override
    public String print(String suffix) {
        return "Miau" + suffix;
    }


}
