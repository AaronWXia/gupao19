package com.gupao.nxia.pattern.model;

public abstract  class BaseActivity {


    /**
     * 模板方法是针对多种流程,且每组流程
     * 有共同的部分,有不同的部分。
     *
     * 1.代码的流程一定是不能变的
     */
    public void setting(){
        create();
        set();
        last();
    }

    public void create(){
        System.out.println("创建...");
    }


    public abstract void set();


    public void last(){
        System.out.println("最后...");
    }





}
