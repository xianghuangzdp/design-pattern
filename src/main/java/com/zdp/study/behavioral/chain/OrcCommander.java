package com.zdp.study.behavioral.chain;

import java.util.Objects;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 兽人指挥官
 */
public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getRequestType(),RequestType.DEFEND_CASTLE)){
            printHandleRequest(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "orc commander";
    }
}
