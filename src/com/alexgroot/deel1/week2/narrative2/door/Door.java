package com.alexgroot.deel1.week2.narrative2.door;

public class Door {
    private DoorState doorState;
    private int passCode;


    public Door(int passCode) {
        this.passCode = passCode;
        doorState = DoorState.open;
    }

    public void changePassCode(int code, int newCode) {
        if (code == passCode && newCode > 0) {
            passCode = newCode;
        }
    }

    public void lock() {
        doorState = doorState == DoorState.closed ? DoorState.locked : doorState;
    }

    public void open() {
        doorState = doorState == DoorState.closed ? DoorState.open : doorState;
    }

    public void unlock(int passCode) {
        if (doorState == DoorState.locked && passCode == this.passCode) {
            doorState = DoorState.closed;
        }
    }

    public void close() {
        doorState = doorState == DoorState.open ? DoorState.closed : doorState;
    }

    public DoorState getDoorState() {
        return doorState;
    }
}

enum DoorState {
    open, closed, locked
}
