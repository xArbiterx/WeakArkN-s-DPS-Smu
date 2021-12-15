package com.example.ttdev.dpsSmu.services;

import org.springframework.stereotype.Service;

/**
 * 干员技能数据CRUD
 */
@Service
public interface OperatorSkillService {
    void getSkill();

    void addSkill();

    void modifySkill();

    void removeSkill();
}
