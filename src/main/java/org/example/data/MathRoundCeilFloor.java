package org.example.data;

public class MathRoundCeilFloor {
    public static void main(String[] args) {
//do najbliższej całkowitej
        System.out.println(Math.round(5.51)); //6
        System.out.println(Math.round(5.49)); //5

        //rzutowanie z double na int - tracimy czesc dziesietną
        System.out.println((int) 5.45d);
        System.out.println(Math.ceil(6.8)); //do całkowitej wzwyż

        System.out.println(Math.ceil(6.11)); //największa całkowita 7
        System.out.println(Math.floor(6.11)); ////do całkowitej w dół - najmniejsza całkowita 6


    }
}
