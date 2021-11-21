package com.company;

public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String bossDefence;
    private String superPower;

    public Boss() {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
        this.bossDefence = bossDefence;
        this.superPower = superPower;
    }

    public Boss(int bossHealth, int bossDamage) {
        this.bossHealth = bossHealth;
        this.bossDamage = bossDamage;
    }

    public int getBossHealth() {
        return bossHealth;
    }

    public void setBossHealth(int bossHealth) {
        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public String getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(String bossDefence) {
        this.bossDefence = bossDefence;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
