
public class Cat implements SunObserver {
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    public boolean isOutdoors() {
        return outdoors;
    }



    public boolean isFeelingTired() {
        return feelingTired;
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
}
