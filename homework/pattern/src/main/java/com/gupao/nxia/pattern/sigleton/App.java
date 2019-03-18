package com.gupao.nxia.pattern.sigleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class App {

    public static  void  main(String args[]){
        Application application = Application.getApplication();


        JavaApplication  application1 =JavaApplication.getInstance();


        InnerApplication applicationHolder = InnerApplication.getInstance();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        int i =0;
        while (i<100){
            executorService.submit(new Executor());
            executorService.submit(new Executor());
            executorService.submit(new Executor());
            executorService.submit(new Executor());
            executorService.submit(new Executor());
            executorService.submit(new Executor());
            i++;
        }
    }
}
