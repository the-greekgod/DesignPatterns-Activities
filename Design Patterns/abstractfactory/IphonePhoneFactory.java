public class IphonePhoneFactory extends PhoneFactory {
    @Override
    public Case createCase() {
        return new IphoneCase();
    }

    @Override
    public MotherBoard createMotherBoard() {
        IphoneMotherBoard motherBoard = new IphoneMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(new IphoneProcessor());
        return motherBoard;
    }

    @Override
    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    @Override
    public Screen createScreen() {
        return new IphoneScreen();
    }
}