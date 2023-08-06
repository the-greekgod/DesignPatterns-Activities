package net.media.training.designpattern.abstractfactory;

public abstract class Case {
    public abstract void attachMotherBoard(MotherBoard motherBoard);
    public abstract void attachScreen(Screen screen);
    public abstract Screen getScreen();
    public abstract MotherBoard getMotherBoard();
}


