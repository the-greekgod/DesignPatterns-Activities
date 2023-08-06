package net.media.training.designpattern.abstractfactory;


public class AndroidMotherBoard extends MotherBoard {
    private Battery battery;
    private String state;
    private Processor processor;

    @Override
    public void attachBattery(Battery battery) {
        this.battery = battery;
    }

    @Override
    public void attachProcessor(Processor processor) {
        if (battery == null)
            throw new RuntimeException("Can't attach processor without attaching battery");
        this.processor = processor;
        this.state = "running";
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public Processor getProcessor() {
        return processor;
    }

    @Override
    public Battery getBattery() {
        return battery;
    }
}

