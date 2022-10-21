package com.company.model;

import com.company.enumeration.EDirection;
import com.company.enumeration.ESpeed;

public class CeilingFan extends Fan{

    private static String fanTypeName;

    static {
        fanTypeName = "ceiling fan";
    }
    public CeilingFan() {
        this.speed = ESpeed.SPEED_ZERO;
        this.direction = EDirection.DIRECTION_NORMAL;
        this.isOff = true;
    }

    public ESpeed getSpeed() {
        return speed;
    }

    public void setSpeed(ESpeed speed) {
        this.speed = speed;
    }

    public EDirection getDirection() {
        return direction;
    }

    public void setDirection(EDirection direction) {
        this.direction = direction;
    }

    public Boolean isOff() {
        return isOff;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    public static String getFanTypeName() {
        return fanTypeName;
    }

}
