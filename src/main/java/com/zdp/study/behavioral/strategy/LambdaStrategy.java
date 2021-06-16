package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc lambda 实现的策略
 */
public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy{
        MELEE_STRATEGY(() -> System.out.println("With your Excalibur you sever the dragon's head!")),

        PROJECTILE_STRATEGY(() -> System.out.println("You shoot the dragon with magical crossbow and it falls dead on the ground!")),

        SPELL_STRATEGY(()-> System.out.println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"))
        ;

        private DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
