package com.company.model;

import com.company.enumeration.EDirection;
import com.company.enumeration.ESpeed;

public abstract class Fan {

    protected ESpeed speed;
    protected EDirection direction;
    protected Boolean isOff;
}
