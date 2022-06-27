package org.example.data.types;

public class J10_arrays {
    public static void main(String args[]) {
      int numArr[] = new int[10];
      numArr[1]=7;
        System.out.println("numArr[1]:" + numArr[1]
                + " numArr.lenght:" + numArr.length );

        float floatsArr[] = new float[5];
        float floatsArr2[] = {10.1f, 123.78f, 78.0f,-99.9f};
        floatsArr[0] = 1.0f;

        System.out.println("floatsArr[1]:" + floatsArr2[1]
        + "  floatsArr.lenght:" + floatsArr2.length);

        String strArr[] = new String[7];
        System.out.println("strArr[1]:" + strArr[1]);

        String strArr2[] = {"jeden", "dwa", "trzy"};
        System.out.println("strArr2[1]:" + strArr2[1]);

    }
}
