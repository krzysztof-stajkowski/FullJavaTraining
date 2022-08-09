package org.example.wzorceProjektowe.fasada;

public class DeliveryBoxFacade {

    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() { //inicjalizacja za pomocą konstruktora, lecz można również przy polach na górze
        deliveryBox = new DeliveryBox();
        deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickupPackage() {

        deliveryBox.getUserData();
        if(deliveryBoxSystem.isUserDataValidated() && deliveryBoxSystem.isPaymentSecured()){
            deliveryBox.openBox();
        }


    }

}
