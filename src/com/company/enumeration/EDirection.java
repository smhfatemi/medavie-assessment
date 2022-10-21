package com.company.enumeration;

public enum EDirection {

    DIRECTION_NORMAL("normal"),
    DIRECTION_REVERSE("reverse");

    private String directionMode;

    EDirection(String directionMode) {
        this.directionMode = directionMode;
    }

    public String getDirectionMode() {
        return this.directionMode;
    }
}
