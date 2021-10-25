package proxy;

import Command.*;
import observer.*;
import singleton.*;

public class AddHomeMemberImplementation implements AddHomeMember{
    @Override
    public void addHomeMember() {
        System.out.println("New home member added by home owner!");
    }
}
