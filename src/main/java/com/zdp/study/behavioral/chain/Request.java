package com.zdp.study.behavioral.chain;

import lombok.Data;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 请求
 */
@Data
public class Request {

    /**
     * 请求类型
     */
    private final RequestType requestType;

    /**
     * 请求描述
     */
    private final String requestDescription;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = requestType;
        this.requestDescription = requestDescription;
    }

    private boolean handled;

    /**
     * 标记请求已经被处理
     */
    public void markHandled(){
        handled = true;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestDescription='" + requestDescription + '\'' +
                ", handled=" + handled +
                '}';
    }
}
