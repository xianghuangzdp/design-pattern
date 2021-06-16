package com.zdp.study.behavioral.chain;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 请求处理器
 */
public class RequestHandler {

    /**
     * 责任链下一个节点
     */
    private final RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    /**
     * 处理请求
     */
    public void handleRequest(Request request){
        if (next != null){
            next.handleRequest(request);
        }
    }

    protected void printHandleRequest(Request request){
        System.out.println(String.format("%s handling request %s",this,request));
    }
}
