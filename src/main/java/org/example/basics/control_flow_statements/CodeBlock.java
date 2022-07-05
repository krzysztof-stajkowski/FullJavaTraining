package org.example.basics.control_flow_statements;

/*

 Bloki kodu grupują nam różnie instrukcje, również mogą zawierać wewnątrz inne bloki kodu. Inaczej mówiąc możemy je zagnieżdzać.
 Możemy wewnątrz deklarować jakieś zmienne natomiast musimy uważac na konflity nazw.
 Mie może być takiej samej nazwy zmiennej poza blokiem przed tym blokiem.
 Natomiast już za blokiem możemy użyć tej nazwy która była wcześniej wewnątrz bloku, ponieważ blok został już wykonany.
 Najczęściej bloki kodu stosuje się z intsrukcjami warunkowymi, pętlami.

 */


public class CodeBlock {
    public static void main(String[] args) {

        int b = 12;
        int num = 100;
        {
            //long num = 1000; // nie można zmiennej o tej samej nazwie użyć gdy wcześniej zadeklarowana nawet z innym typem
            long num2=1000; //teraz jest ok ponieważ nzwa jest nowa
            int a = 5;
            System.out.println("a: " + a);
            System.out.println("b: " + b); //jest dostęp ponieważ deklarcja jest przed blokiem
         //  System.out.println("c: " + c); //nie ma dostępu ponieważ deklarcja jest za blokiem
        }

        int c = 7;
        int a =99; // nie ma błędu ponieważ nie ma konfliku nazw ze zmienną w bloku, ponieważ ta zmienna jest poza blokiem

        {
            int value = 9;
            {
                int test = 8;
                {
                    System.out.println("test:" + test);
                    System.out.println("value: " + value);
                    System.out.println("a: " + a); // 99
                }
            }
        }



    }
}
