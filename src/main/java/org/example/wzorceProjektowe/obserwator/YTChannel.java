package org.example.wzorceProjektowe.obserwator;


import java.util.ArrayList;

public class YTChannel implements Subject{

    private ArrayList<Observer> observerList;

    public  YTChannel() {
        observerList = new ArrayList<>();
    }

    public void publishNewVideo(){
        System.out.println("YTChannel: Publishing new video.");
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList){
            o.update();
        }
    }

}