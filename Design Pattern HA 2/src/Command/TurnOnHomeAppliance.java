package Command;

import main.*;
import observer.*;
import proxy.*;
import singleton.*;

public class TurnOnHomeAppliance implements TurnOnOffHomeAppliance{
    @Override
    public void turnOnOff(String applianceName) {
        System.out.println(applianceName + " has been turned ON by home owner!");
    }
}
