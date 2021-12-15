package com.example.ttdev.dpsSmu;

import com.example.ttdev.dpsSmu.utils.DamageCalculator;
import com.example.ttdev.dpsSmu.vo.NormalDPSModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DPSSmuController {

    @GetMapping("normalDps")
    public String index(NormalDPSModel model) {
        double dps = DamageCalculator.normalDPSCalculator(
                model.getAtk(),
                model.getAtkInterval(),
                model.getSeconds(),
                model.getShield(),
                model.isMage());
        return String.format("%.2f", dps);
    }
}