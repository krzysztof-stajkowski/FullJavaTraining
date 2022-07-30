package org.example.data.hashcode_equals;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
    public static void main(String[] args) {

 /*     Cat cat1 = new Cat("Lola",3);
        Cat cat2 = cat1; //cat1 wskazuje na miejce w pamięci cat2 - jest referencją

        //to jet object identity
        System.out.println(cat1 == cat2); */

        //hash examples
        Cat susie = new Cat("Susie",3);
        Cat lola = new Cat("lola",5);
        Cat milky = new Cat("milky",11);


        Map<Cat,String> catOwnerMap = new HashMap<>();
        catOwnerMap.put(susie,"Bartek");
        catOwnerMap.put(lola,"Ania");
        catOwnerMap.put(milky,"Ola");

        System.out.println(susie.hashCode());
        System.out.println(lola.hashCode());
        System.out.println(milky.hashCode());

        System.out.println(catOwnerMap.get(susie));

    }
}
