package singleton;

import Command.*;
import observer.*;
import proxy.*;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private static Home home = new Home();
    private List<Observer> observers = new ArrayList<Observer>();

    private Home() {

    }

    public static Home getInstance() {
        return home;
    }

    public void printMenu() {
        System.out.println("1. Add new home member");
        System.out.println("2. Turn On/Off home appliances");
        System.out.println("3. Exit");
    }

    public void turnOnOffHomeAppliances(String applianceName, int operation) {
        if (operation == 1) {
            //ON
            Context context = new Context(new TurnOnHomeAppliance());
            context.turnOnOff(applianceName);
        } else {
            //OFF
            Context context = new Context(new TurnOffHomeAppliance());
            context.turnOnOff(applianceName);
        }
        notifyAllObservers();
    }

    public void addNewHomeMember(String user, String pass) {
        AddHomeMemberProxy addHomeMemberProxy = new AddHomeMemberProxy(user, pass);
        addHomeMemberProxy.addHomeMember();
        Observer observer = new HomeMember();
        attach(observer);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
