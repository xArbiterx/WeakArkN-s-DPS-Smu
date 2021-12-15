package com.example.ttdev.dpsSmu.po;

import lombok.Data;

/**
 * 干员基础数据（暂定）
 */
@Data
public class OperatorBasic {
    private long id;
    private String name;
    private int level;
    private int eliteLevel;
    private int attack;
    private boolean isMage;
    private long skill1Id;
    private long skill2Id;
    private long skill3Id;
}
