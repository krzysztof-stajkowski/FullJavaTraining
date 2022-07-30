package org.example.data.hashcode_equals;

public class MainTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Lola",3);
        Cat cat2 = cat1; //cat1 wskazuje na miejce w pamięci cat2 - jest referencją

        //to jet object identity
        System.out.println(cat1 == cat2);

        //object equality



    }
}
