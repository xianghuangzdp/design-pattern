package com.zdp.study.behavioral.observer.generic;

/**
 * @author zdp
 * @date 2021/6/20
 * @desc 观察者
 */
public interface Observer <S extends Observable<S,O,A>,O extends Observer<S,O,A>,A> {

    void update(S subject,A argument);
}
