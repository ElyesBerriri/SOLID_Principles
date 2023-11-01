package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    public int allocate(Slot slot)
    {
        int resourceId = slot.findFreeSlot();
        slot.markSlotBusy(resourceId);
        return resourceId;
    }
    

    public void free(Slot slot, int resourceId)
    {
        slot.markSlotFree(resourceId);
    }
}
