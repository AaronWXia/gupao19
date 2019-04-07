package com.gupao.nxia.pattern.observer;

public class Test {
    public static void main(String[] args) {
        GuavaEvent event = GuavaEvent.getInstance();
        Question question = new Question();
        question.setUserName("jerry_chris");
        question.setContent("wo_ai_ni");
        event.publishQuestion(question);
    }
}
