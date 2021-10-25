package observer;

import Command.*;
import main.*;
import proxy.*;
import singleton.*;

public abstract class Observer {
    Home home;
    public abstract void update();
}
