package com.example.ttdev.dpsSmu.po;

import lombok.Data;

/**
 * 干员技能数据（暂）
 */
@Data
public class OperatorSkill {
    private long id;
    private String name;
    private int damageType;
    private int damageBonus;
    private int damageTimesAnAttack;
    private int attackSpeedBonus;
    private long operatorId;
}
