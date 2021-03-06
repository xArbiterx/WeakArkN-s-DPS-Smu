package com.example.ttdev.dpsSmu.utils;

public class DamageCalculator {

    final static double polishingPercent = 0.05;

    /**
     * @param atk         攻击力
     * @param atkInterval 攻击间隔 X秒/次
     * @param seconds     测试时长
     * @param shield      敌人护甲
     * @param isMage      是否法师
     * @return
     */
    public static double normalDPSCalculator(int atk, double atkInterval, int seconds, int shield, boolean isMage) {
        double totalDamage = normalTotalDamageCalculator(atk, atkInterval, seconds, shield, isMage);
        return totalDamage / seconds;
    }

    /**
     * @param atk         攻击力
     * @param atkInterval 攻击间隔 X秒/次
     * @param seconds     测试时长
     * @param shield      敌人护甲
     * @param isMage      是否法师
     * @return
     */
    public static double normalTotalDamageCalculator(int atk, double atkInterval, int seconds, int shield, boolean isMage) {
        int atkTimes = (int) (seconds / atkInterval);
        double polishingDamage = atk * polishingPercent;
        double realDamage = 0;
        if (isMage) {
            if (shield > 100) {
                shield = 100;
            }
            double damagePercent = (100 - shield) / 100.0;
            realDamage = atk * damagePercent;
        } else {
            realDamage = atk - shield;
        }

        realDamage = Math.max(realDamage, polishingDamage);

        return realDamage * atkTimes;
    }
}
