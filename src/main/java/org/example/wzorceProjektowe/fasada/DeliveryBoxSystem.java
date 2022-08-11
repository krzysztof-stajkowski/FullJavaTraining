package org.example.wzorceProjektowe.fasada;

 class DeliveryBoxSystem {

     void sendNotification(){
        System.out.println("Text message sent to the client");
    }

     boolean isPaymentSecured(){
        System.out.println("Payment is secured");
        return true;
    }

     boolean isUserDataValidated(){
        System.out.println("User data has been validated");
        return true;
    }

     void scheduleDelivery(){
        System.out.println("Delivery has been scheduled");
    }

}