package com.zdp.study.behavioral.command;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zdp
 * @date 2021/6/14
 * @desc 法师
 */
public class Wizard {

    private final Deque<Spell> undoStack = new LinkedList<>();

    private final Deque<Spell> redoStack = new LinkedList<>();

    /**
     * 释放咒语
     * @param spell
     */
    public void castSpell(Spell spell){
        spell.run();
        undoStack.add(spell);
    }

    /**
     * 撤销执行最后一个咒语
     */
    public void undoLastSpell(){
        if (!undoStack.isEmpty()){
            Spell spell = undoStack.pollLast();
            redoStack.offerLast(spell);

            spell.undo();
        }
    }

    /**
     * 重新执行最后一个咒语
     */
    public void redoLastSpell(){
        if (!redoStack.isEmpty()){
            Spell spell = redoStack.pollLast();
            undoStack.offerLast(spell);

            spell.run();
        }
    }
}
