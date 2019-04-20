package com.example.demo2.service;

import com.example.demo2.entity.OneEmployeeVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.EmployeeInfoEvt;
import com.example.demo2.entity.mapVm.EmployeeMapVm;

public interface EmployeeService {
    EmployeeMapVm getEmployeeInfo(EmployeeInfoEvt evt);

    int addEmplyee(EmployeeEvt evt);

    OneEmployeeVm getOneEmployeeInfo(EmployeeIdEvt evt);

    int deleteEmployee(EmployeeIdEvt evt);

    int updateEmployee(EmployeeEvt evt);

    OneEmployeeVm employeeLogin(EmployeeEvt evt);
}
