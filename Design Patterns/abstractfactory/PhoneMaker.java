package net.media.training.designpattern.abstractfactory;


public class PhoneMaker {
    public Case buildPhone(String phoneType) {
        PhoneFactory phoneFactory;
        if (phoneType.equals("Android")) {
            phoneFactory = new AndroidPhoneFactory();
        } else {
            phoneFactory = new IphonePhoneFactory();
        }

        Case phoneCase = phoneFactory.createCase();
        MotherBoard motherBoard = phoneFactory.createMotherBoard();
        Screen screen = phoneFactory.createScreen();

        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);

        return phoneCase;
    }
}


