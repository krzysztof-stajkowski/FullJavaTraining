package org.example.ZadaniaZKamilem;

public class MainKotPies {
    public static void main(String[] args) {

        KOT kot = new KOT(5,"Kotek");
        KOT kot1 = new KOT();

        PIES pies = new PIES(22,"Reksio");
        PIES pies1 = new PIES();

        System.out.println(kot1);
        System.out.println(pies1);

        if(kot.equals(pies)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
