package org.example.data.hashcode_equals;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //nadpisujemy bazową natywną metodę equals
    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Cat) {
            Cat o = (Cat) object;

            if (name.equals(o.name) && age == o.age) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //nadpisanie metody hashcode jako ZŁY nieoptymalny przykład
    //Jest to najgorsza możliwa implementacja tej metody jaka istnieje - zwraca zawsze 1 dla wszystkich instancji danej klasy
  /*  @Override
    public int hashCode() {
        return 1;
    }
*/
    //poprawna implementacja
    @Override
    public int hashCode() {
        int result = 7; // liczba 7 i 31 są wynikiem badań naukowych nad znalezieniem najwydajniejszych liczb w tym celu
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }



}
