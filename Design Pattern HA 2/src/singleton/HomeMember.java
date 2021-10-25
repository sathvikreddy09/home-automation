package singleton;

import Command.*;
import observer.*;
import proxy.*;
import singleton.*;

public class HomeMember extends Observer {
    @Override
    public void update() {
        System.out.println("Home member updated about home owner actions");
    }
}
