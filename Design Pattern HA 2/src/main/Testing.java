package main;

import Command.*;
import observer.*;
import proxy.*;
import singleton.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testing {

    @Test
    public void homeSingletonTest(){
        Home h= Home.getInstance();
        Home h2=Home.getInstance();
        assertEquals(h,h2);
    }

    @Test
    public void observerTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Home h= Home.getInstance();
        HomeMember m1=new HomeMember();
        HomeMember m2=new HomeMember();
        h.attach(m1);
        h.attach(m2);

        h.turnOnOffHomeAppliances("AC",1);

        assertEquals("AC has been turned ON by home owner!\r\n" +
                "Home member updated about home owner actions\r\n" +
                "Home member updated about home owner actions\r\n",outContent.toString());
    }
}
