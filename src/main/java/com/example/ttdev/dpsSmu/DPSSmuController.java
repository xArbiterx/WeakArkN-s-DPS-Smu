package com.example.ttdev.dpsSmu;

import com.example.ttdev.dpsSmu.utils.DamageCalculator;
import com.example.ttdev.dpsSmu.vo.NormalDPSModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller("/")
public class DPSSmuController {
    @ResponseBody
    @GetMapping("normalDps")
    public String normalDps(NormalDPSModel model) {
        double dps = DamageCalculator.normalDPSCalculator(
                model.getAtk(),
                model.getAtkInterval(),
                model.getSeconds(),
                model.getShield(),
                model.isMage());
        return String.format("%.2f", dps);
    }

    @GetMapping("index")
    public String index(){
        return "index";
    }
}