package solid.live.ocp;

interface Resource {
    void markSlotBusy(int resourceId) ;
    void markSlotFree(int resourceId) ;
    int findFreeSlot() ;
}
