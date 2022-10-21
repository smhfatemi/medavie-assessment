package com.company.service;


import com.company.model.Fan;

public interface IFan<T extends Fan> {

    Integer increaseSpeed();
    String changeDirection();
    T showStatus();
}
