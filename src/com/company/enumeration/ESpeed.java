package com.company.enumeration;

public enum ESpeed {

    SPEED_ZERO(0),
    SPEED_ONE(1),
    SPEED_TWO(2),
    SPEED_THREE(3);

    private final int speedIndex;

    ESpeed(Integer index) {
        this.speedIndex = index;
    }

    public Integer getSpeedIndex() {
        return this.speedIndex;
    }
}
