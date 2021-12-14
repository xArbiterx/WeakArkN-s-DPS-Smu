package com.example.ttdev.dpsSmu.vo;

import lombok.Data;

@Data
public class NormalDPSModel {
    private int atk;
    private double atkInterval;
    private int seconds;
    private int shield;
    private boolean isMage;

    public void setIsMage(String str) {
        isMage = Boolean.parseBoolean(str);
    }
}
