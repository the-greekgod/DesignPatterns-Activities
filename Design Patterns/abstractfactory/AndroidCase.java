package net.media.training.designpattern.abstractfactory;


public class AndroidCase extends Case {
    private MotherBoard motherBoard;
    private Screen screen;

    @Override
    public void attachMotherBoard(MotherBoard motherBoard) {
        if (!motherBoard.getState().equals("running"))
            throw new RuntimeException("Motherboard not functional");
        this.motherBoard = motherBoard;
    }

    @Override
    public void attachScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public Screen getScreen() {
        return screen;
    }

    @Override
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

}


