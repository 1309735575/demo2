package com.example.demo2.mapper;


import com.example.demo2.entity.EmployeeVm;
import com.example.demo2.entity.OneEmployeeVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.EmployeeInfoEvt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {

    List<EmployeeVm> getEmployeeInfo(EmployeeInfoEvt evt);

    int addEmployee(EmployeeEvt evt);

    int updateEmployee(EmployeeEvt evt);

    int deleteEmployee(EmployeeIdEvt evt);

    OneEmployeeVm getOneEmployeeInfo(EmployeeIdEvt evt);

    OneEmployeeVm employeeLogin(EmployeeEvt evt);

}
