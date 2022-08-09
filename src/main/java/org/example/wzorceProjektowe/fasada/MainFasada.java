package org.example.wzorceProjektowe.fasada;

public class MainFasada {
//uproszczony interfejs dla systemu lub podsystemu
    //izolacja wewnetrznych metod i logiki np. ze wzgledów bezpieczeństwa
    //dodajemy klasę oraz ukrywamy modyfikatorami dostępy

    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }

}
