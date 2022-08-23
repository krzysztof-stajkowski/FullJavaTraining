package org.example;

class One{
    int i = 1;
    public One(){
        System.out.println(i);
    }

    public void bbb(){
        System.out.println("bbb");
    }

}

class Two extends One{
    int i = 10;
    public Two(){
        System.out.println(i);
    }

    public void aaa(){
        System.out.println("aaa");
    }

    public static void main(String[] args) {
        One one = new One();





    }
}