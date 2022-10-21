package com.company.service;

import com.company.enumeration.EDirection;
import com.company.enumeration.ESpeed;
import com.company.model.CeilingFan;

import java.util.Objects;

public class CeilingFanService implements IFan<CeilingFan>{

    private CeilingFan ceilingFan;

    public CeilingFanService() {
        this.ceilingFan = new CeilingFan();
    }

    @Override
    public Integer increaseSpeed() {
        ceilingFan.setSpeed(changeEnumSpeed());
        return ceilingFan.getSpeed().getSpeedIndex();
    }

    private ESpeed changeEnumSpeed() {
        switch (ceilingFan.getSpeed()) {
            case SPEED_ZERO:
                ceilingFan.setOff(false);
                return ESpeed.SPEED_ONE;
            case SPEED_ONE:
                return ESpeed.SPEED_TWO;
            case SPEED_TWO:
                return ESpeed.SPEED_THREE;
            default:
                ceilingFan.setOff(true);
                return ESpeed.SPEED_ZERO;
        }
    }

    @Override
    public String changeDirection() {
        if (Objects.equals(ceilingFan.getDirection(), EDirection.DIRECTION_NORMAL)) {
            ceilingFan.setDirection(EDirection.DIRECTION_REVERSE);
        } else {
            ceilingFan.setDirection(EDirection.DIRECTION_NORMAL);
        }
        return ceilingFan.getDirection().getDirectionMode();
    }

    @Override
    public CeilingFan showStatus() {
        return ceilingFan;
    }

}
