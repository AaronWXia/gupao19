package com.gupao.nxia.pattern.strategy.delegate;

import com.gupao.nxia.pattern.strategy.delegate.Employee;
import com.gupao.nxia.pattern.strategy.delegate.Job;

import java.util.ArrayList;
import java.util.List;

public class Leader {

    private List<Employee> employeeList = new ArrayList();

    public void dispatchJob(Job job){
        for(Employee employee:employeeList){
                employee.dispatch();
        }
    }
}
