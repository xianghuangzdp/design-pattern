package com.zdp.study.behavioral.chain;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 责任链模式
 * 责任链模式由command对象和一系列的process对象组成。process对象都包含了一段逻辑，
 * 标识他可以处理哪些command类型，并且将他不处理的类型丢给下一个process，
 * 同时process对象还包含了设置下一个节点的能力
 */
public class ResponsibilityChainDemo {

    public static void main(String[] args) {
        OrcKing king = new OrcKing();

        king.makeRequest(new Request(RequestType.DEFEND_CASTLE,"defend castle"));

        king.makeRequest(new Request(RequestType.TORTURE_PRISONER,"torture prisoner"));

        king.makeRequest(new Request(RequestType.COLLECT_TAX,"collect tax"));
    }
}
