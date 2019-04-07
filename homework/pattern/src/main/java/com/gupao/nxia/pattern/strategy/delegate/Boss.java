package com.gupao.nxia.pattern.strategy.delegate;

public class Boss {

    public void dispatchJob(Job job){
        Leader leader = new Leader();
        leader.dispatchJob(job);
    }
}
