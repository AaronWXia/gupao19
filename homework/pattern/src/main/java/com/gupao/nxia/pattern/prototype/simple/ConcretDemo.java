package com.gupao.nxia.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

public class ConcretDemo implements Prototype{


    private String name;
    private int  age;
    private List<String> concreList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getConcreList() {
        return concreList;
    }

    public void setConcreList(List<String> concreList) {
        this.concreList = concreList;
    }






    @Override
    public Prototype clone(Prototype  prototype) {
        ConcretDemo  concretDemo = new ConcretDemo();
        concretDemo.name = ((ConcretDemo)prototype).getName();
        concretDemo.age =  ((ConcretDemo)prototype).getAge();
        concretDemo.setConcreList(((ConcretDemo)prototype).getConcreList());
        return concretDemo;
    }
}
