package com.directi.training.ocp.exercise;

public abstract class Slot {
	protected void markSlotFree(int resourceId) {
		
	}
	protected void markSlotBusy(int resourceId) {
		
	}
	protected abstract int findFreeSlot();
}