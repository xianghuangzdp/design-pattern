package com.zdp.study.build.factorymethod;

/**
 * @author zdp
 * @date 2021/2/23 00:34
 * @desc 工厂方法模式
 */
public class FactoryMethodPattern {

    public static void main(String[] args) {
        Blacksmith blacksmith = new ElfBlacksmith();
        manufactureWeapon(blacksmith);

        blacksmith = new OrcBlacksmith();
        manufactureWeapon(blacksmith);
    }

    private static void manufactureWeapon(Blacksmith blacksmith){
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(weapon);

        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(weapon);
    }
}
