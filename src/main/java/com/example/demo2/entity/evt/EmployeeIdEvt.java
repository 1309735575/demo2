package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/2
 */
@Repository
@ApiModel("服务人员id参数类")
public class EmployeeIdEvt implements Serializable {
    private static final long serialVersionUID = -3530068700222824849L;
    @ApiModelProperty("服务人员id")
    private String employeeId;

    @Override
    public String toString() {
        return "EmployeeIdEvt{" +
                "employeeId='" + employeeId + '\'' +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
