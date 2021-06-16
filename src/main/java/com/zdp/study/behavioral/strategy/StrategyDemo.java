package com.zdp.study.behavioral.strategy;

/**
 * @author zdp
 * @date 2021/4/11
 * @desc 策略模式demo
 * 策略模式可以让算法行为的选择延迟到运行时，在Java8之前，策略模式需要独立的类，这强迫开发者必须写很多样板代码，
 * Java8之后可以比较方便的通过传递方法引用来传递行为，使代码更加精简和易于书写
 */
public class StrategyDemo {

    public static void main(String[] args) {
        DragonSlayer slayer = new DragonSlayer(new ProjectileStrategy());
        slayer.gotoBattle();

        slayer.changeStrategy(new MeleeStrategy());
        slayer.gotoBattle();

        slayer.changeStrategy(new SpellStrategy());
        slayer.gotoBattle();

        slayer.changeStrategy(LambdaStrategy.Strategy.PROJECTILE_STRATEGY);
        slayer.gotoBattle();

        slayer.changeStrategy(LambdaStrategy.Strategy.MELEE_STRATEGY);
        slayer.gotoBattle();

        slayer.changeStrategy(LambdaStrategy.Strategy.SPELL_STRATEGY);
        slayer.gotoBattle();
    }
}
