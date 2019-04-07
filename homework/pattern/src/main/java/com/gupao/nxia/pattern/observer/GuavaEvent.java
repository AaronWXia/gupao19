package com.gupao.nxia.pattern.observer;

import com.google.common.eventbus.EventBus;

public class GuavaEvent {
        private String name = "GPer";
        private static GuavaEvent gper = null;

        private GuavaEvent() {
        }

        public static GuavaEvent getInstance() {
            if (null == gper) {
                gper = new GuavaEvent();
            }
            return gper;
        }

        public String getName() {
            return name;
        }

        public void publishQuestion(Question question) {
            System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。 ");
            EventBus eventBus = new EventBus();
            eventBus.register(new Teacher("夏新"));
            eventBus.post(question);
        }

    }
