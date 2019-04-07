package com.gupao.nxia.pattern.proxy;

public class Rule {

    private String  shape;
    private String  outlooking;
    private int  age;
    private int background;
    private String job;



    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getOutlooking() {
        return outlooking;
    }

    public void setOutlooking(String outlooking) {
        this.outlooking = outlooking;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "shape='" + shape + '\'' +
                ", outlooking='" + outlooking + '\'' +
                ", age=" + age +
                ", background=" + background +
                ", job='" + job + '\'' +
                '}';
    }
}
