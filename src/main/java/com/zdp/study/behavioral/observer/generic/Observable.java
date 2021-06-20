package com.zdp.study.behavioral.observer.generic;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 可被观察的对象
 *
 * @param <S> subject,被观察的对象
 * @param <O> observer 观察者
 * @param <A> argument 参数
 */
public class Observable <S extends Observable<S,O,A>,O extends Observer<S,O,A>,A>{

    private final List<O> observers;

    public Observable() {
        observers = Lists.newArrayList();
    }

    public void addObserver(O observer){
        observers.add(observer);
    }

    public void removeObserver(O observer){
        observers.remove(observer);
    }

    protected void notifyObservers(A argument){
        observers.forEach(o -> o.update((S)this,argument));
    }
}
