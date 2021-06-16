package com.zdp.study.behavioral.chain;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 兽人官员
 */
public class OrcOfficer extends RequestHandler {

    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getRequestType(),RequestType.COLLECT_TAX)){
            printHandleRequest(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "orc officer";
    }
}
