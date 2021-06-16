package com.zdp.study.behavioral.chain;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 兽人军人
 */
public class OrcSoldier extends RequestHandler {

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getRequestType(),RequestType.TORTURE_PRISONER)){
            printHandleRequest(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "orc soldier";
    }
}
