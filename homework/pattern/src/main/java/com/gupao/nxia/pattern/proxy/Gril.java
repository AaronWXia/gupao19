package com.gupao.nxia.pattern.proxy;

public class Gril implements  Person {

    private Rule  rule;

    public Gril(Rule rule){
        this.rule = rule;
    }

    @Override
    public void findLove(Rule rule) {
        System.out.println("找到对象的标准:"+rule);
    }
}
