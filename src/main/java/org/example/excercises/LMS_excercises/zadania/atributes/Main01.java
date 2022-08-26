package org.example.excercises.LMS_excercises.zadania.atributes;


public class Main01 {
    public static void main(String[] args) {

        AccessModifier testModifier = new AccessModifier();
        AccessModifier testModifier2 = new AccessModifier();

        System.out.println(testModifier);
        System.out.println(testModifier2);

        testModifier.protectedAttribute = "protected string";
        testModifier.publicAttribute = "public string";
        // testModifier.privateModifier = "private string"  //private nie działa bo jest private

        System.out.println(testModifier.protectedAttribute);
        System.out.println(testModifier.publicAttribute);
        // System.out.println(testModifier.privateModifier); //private nie działa bo jest private



    }
}
