package com.example.ttdev.dpsSmu.utils;

public class SkillCalculator {
    /**
     * 护甲计算器
     *
     * @param armor    护甲
     * @param minus    固定减甲
     * @param multiply 乘算减甲
     * @return 减甲后护甲
     */
    public static double armorCalculator(double armor, double minus, double multiply) {
        return Math.max(0, (armor - minus) * (1 - multiply));
    }

    /**
     * 攻击力计算
     *
     * @param attack        攻击力
     * @param dirAdd        直接加算（潜能）
     * @param dirMultiply   直接乘算（对原攻击的百分比增伤）
     * @param finalAdd      最终加算（鼓舞）
     * @param finalMultiply 最终乘算（提升至百分比）
     * @return buff后攻击力
     */
    public static double attackCalculator(double attack,double dirAdd,double dirMultiply,double finalAdd
            ,double finalMultiply) {
        return ((attack + dirAdd) * (1 + dirMultiply) + finalAdd) * finalMultiply;
    }

    /**
     * 攻速计算
     *
     * @param atkInterval 攻击间隔
     * @param add         攻击速度增加（固定）
     * @param multiply    攻击速度乘算
     * @return 加速的攻击间隔
     */
    public static double attackSpeedCalculator(double atkInterval, double add, double multiply) {
        return (100.0 - add) * (1 - multiply) * atkInterval;
    }
}
