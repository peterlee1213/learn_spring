package com.powernode.simplefactory;

/**
 * 具体产品角色
 */
public class Tank extends Weapon {

    @Override
    public void attack() {
        System.out.println("tank attack");
    }

}
