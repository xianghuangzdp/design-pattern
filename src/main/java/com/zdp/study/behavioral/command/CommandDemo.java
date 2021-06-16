package com.zdp.study.behavioral.command;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 命令模式demo
 * 命令模式是一种行为设计模式，这种设计模式将未来即将发生的事件或者行为压缩到一个对象里面，这个对象包含了进行执行的行为的名字以及执行行为的对象和方法需要的参数
 * 命令模式有4个核心的角色，command、receiver、invoker、client
 * command了解receiver相关的信息，并且调用receiver的方法
 * invoker接收command的引用，并且有选择的记录command执行的情况，invoker完全不感知任何receiver相关的信息
 * client决定什么时候哪些命令需要被执行，client将command的引用传递给invoker的方法
 */
public class CommandDemo {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Goblin goblin = new Goblin();

        goblin.printStatus();

        wizard.castSpell(new ChangeSizeSpell(goblin));
        goblin.printStatus();

        wizard.castSpell(new ChangeVisibilitySpell(goblin));
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.undoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();

        wizard.redoLastSpell();
        goblin.printStatus();
    }
}
