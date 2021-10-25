package Command;

import main.*;
import observer.*;
import proxy.*;
import singleton.*;

public class TurnOffHomeAppliance implements TurnOnOffHomeAppliance{
    @Override
    public void turnOnOff(String applianceName) {
        System.out.println(applianceName + " has been turned OFF by home owner!");
    }
}
