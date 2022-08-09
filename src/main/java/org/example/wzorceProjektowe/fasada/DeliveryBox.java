package org.example.wzorceProjektowe.fasada;

 class DeliveryBox { //nie są public aby jak najbardziej hermetyzować gdzie można

     boolean isDeliveryBoxFull(){
        System.out.println("Box is not full");
        return false;
    }

     boolean isDeliveryBoxBroken(){
        System.out.println("Box is not broken");
        return false;
    }

     void getUserData(){
        System.out.println("User data entered");
    }

     void openBox(){
        System.out.println("Box is opened");
    }

}
