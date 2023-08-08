
public class Robot implements SunObserver{
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    public boolean isOutdoors() {
        return outdoors;
    }
    @Override
    public void notifySunRose() {
        feelingWarm = true;
    }
    @Override
    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }
}
