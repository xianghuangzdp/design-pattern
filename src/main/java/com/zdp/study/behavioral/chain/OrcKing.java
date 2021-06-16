package com.zdp.study.behavioral.chain;

/**
 * @author zdp
 * @date 2021/6/16
 * @desc 兽人国王
 */
public class OrcKing {
    private RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain(){
        this.chain = new OrcCommander(new OrcSoldier(new OrcOfficer(null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}
