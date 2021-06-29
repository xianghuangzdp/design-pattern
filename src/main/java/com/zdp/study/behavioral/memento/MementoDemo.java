package com.zdp.study.behavioral.memento;

import java.util.Stack;

/**
 * @author zdp
 * @date 2021/6/30
 * @desc 备忘录模式
 * 备忘录这种设计模式提供了一个可以让对象回滚到之前状态的方法
 * 备忘录模式由三部分组成：原始对象、管理者、备忘录，原始对象是一种具有内部状态的对象，管理者想要在原始对象上执行一些操作，但是有希望可以
 * 回滚这些操作。管理者首选需要通过原始对象获取一个他的备忘录，然后执行既定的一系列操作，当需要回滚时，将备忘录传递给原始对象。备忘录本身
 * 对管理者是不透明的
 * 使用这种模式的时候需要注意回滚对象可能会引发其他的对象和资源的变更，特别是在单例模式中使用
 *
 */
public class MementoDemo {

    public static void main(String[] args) {
        Stack<StarMemento> stack = new Stack<>();

        Star star = new Star(1000000,500000,StarType.SUN);

        System.out.println(star);
        stack.add(star.getMemento());
        star.timePass();

        System.out.println(star);
        stack.add(star.getMemento());
        star.timePass();

        System.out.println(star);
        stack.add(star.getMemento());
        star.timePass();

        System.out.println(star);
        stack.add(star.getMemento());
        star.timePass();

        System.out.println(star);
        stack.add(star.getMemento());
        star.timePass();

        while (!stack.empty()){
            star.setMemento(stack.pop());
            System.out.println(star);
        }
    }
}
