package solid.live.ocp;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        int resourceId = resource.findFreeSlot();
        if (resourceId != INVALID_RESOURCE_ID) {
            resource.markSlotBusy(resourceId);
        }
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
    
        resource.markSlotFree(resourceId);

    }

}
