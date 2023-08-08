
public class SunTestClient {
    private final Person person;
    private final Cat cat;
    private final Dog dog;
    private final Robot robot;

    private boolean personWentOut = false;
    private boolean robotWentOut = false;
    private boolean catWentOut;
    private boolean dogWentOut;
    private Sun sun;

    public SunTestClient() {
        this.person = new Person();
        this.cat = new Cat();
        this.dog = new Dog();
        this.robot = new Robot();
//        this.sun = new Sun(robot, person, dog, cat);
        this.sun = new Sun();
    }

    public void aFewCharactersGoOutdoors() {
        person.goOutdoors();
        robot.goOutdoors();
        personWentOut = true;
        robotWentOut = true;
    }

    public void aFewOtherCharactersGoOutdoors() {
        cat.goOutdoors();
        dog.goOutdoors();
        catWentOut = true;
        dogWentOut = true;
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {
        if (person.isOutdoors() && !person.isFeelingTired())
            return false;
        if (robot.isOutdoors() && !robot.isFeelingTired())
            return false;
        if (dog.isOutdoors() && !dog.isFeelingTired())
            return false;
        if (dog.isOutdoors() && !dog.isFeelingTired())
            return false;

        return true;
    }

    public boolean outdoorsCharactersFeelWarm() {
        if (person.isOutdoors() && !person.isFeelingWarm())
            return false;
        if (cat.isOutdoors() && !cat.isFeelingWarm())
            return false;
        if (dog.isOutdoors() && !dog.isFeelingWarm())
            return false;
        if (robot.isOutdoors() && !robot.isFeelingWarm())
            return false;

        if (!person.isOutdoors() && person.isFeelingWarm())
            return false;
        if (!cat.isOutdoors() && cat.isFeelingWarm())
            return false;
        if (!dog.isOutdoors() && dog.isFeelingWarm())
            return false;
        if (!robot.isOutdoors() && robot.isFeelingWarm())
            return false;

        return true;
    }
}
