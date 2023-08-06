public class AndroidPhoneFactory extends PhoneFactory {
    @Override
    public Case createCase() {
        return new AndroidCase();
    }

    @Override
    public MotherBoard createMotherBoard() {
        AndroidMotherBoard motherBoard = new AndroidMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new AndroidProcessor());
        return motherBoard;
    }

    @Override
    public Processor createProcessor() {
        return new AndroidProcessor();
    }

    @Override
    public Screen createScreen() {
        return new AndroidScreen();
    }
}
