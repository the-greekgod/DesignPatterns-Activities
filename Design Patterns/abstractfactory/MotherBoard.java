package net.media.training.designpattern.abstractfactory;


public abstract class MotherBoard {
    public abstract void attachBattery(Battery battery);
    public abstract void attachProcessor(Processor processor);
    public abstract String getState();
    public abstract Processor getProcessor();
    public abstract Battery getBattery();
}


