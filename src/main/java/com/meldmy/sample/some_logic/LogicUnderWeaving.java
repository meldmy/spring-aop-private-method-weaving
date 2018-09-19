package com.meldmy.sample.some_logic;

/**
 * @author Dmytro Melnychuk
 */
public class LogicUnderWeaving {

    public void foo() {
        logicUnderWeaving();
    }

    private void logicUnderWeaving() {
        System.out.println("Some logic under weaving");
    }
}
