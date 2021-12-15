package com.example.ttdev.dpsSmu.services;

import org.springframework.stereotype.Service;

/**
 * 干员基础数据的CRUD
 */
@Service
public interface OperatorBasicService {
    void getOperator();

    void addOperator();

    void modifyOperator();

    void removeOperator();
}
