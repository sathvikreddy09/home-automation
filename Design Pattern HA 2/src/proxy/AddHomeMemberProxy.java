package proxy;

import Command.*;
import observer.*;
import singleton.*;

public class AddHomeMemberProxy implements AddHomeMember{
    private boolean isHomeOwner;
    private AddHomeMemberImplementation addHomeMemberImplementation;

    public AddHomeMemberProxy(String name, String pass){
        if (name.equals("Admin") && pass.equals("123")) {
            isHomeOwner = true;
            addHomeMemberImplementation = new AddHomeMemberImplementation();
        }
    }

    @Override
    public void addHomeMember() {
        if(isHomeOwner){
            addHomeMemberImplementation.addHomeMember();
        }else{
            System.out.println("Only home owner can add new members in Home automation system");
        }
    }
}
