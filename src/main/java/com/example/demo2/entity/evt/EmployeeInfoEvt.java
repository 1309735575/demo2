package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/1
 */
@Repository
@ApiModel("服务人员参数类")
public class EmployeeInfoEvt extends QueryPerformParentEvt implements Serializable {


    private static final long serialVersionUID = -6317642019328763420L;
    @ApiModelProperty("服务人员id")
    private String employeeId;
    @ApiModelProperty("服务人员名称")
    private String employeeName;
    @ApiModelProperty("服务人员工司id")
    private String employeeBusiness;
    @ApiModelProperty("服务人员工作id")
    private String employeeService;
    @ApiModelProperty("服务人员头像")
    private String employeePicture;
    @ApiModelProperty("服务人员订单状态")
    private String orderState;
    @ApiModelProperty("服务人员订单评价")
    private String orderEvaluate;

    @Override
    public String toString() {
        return "EmployeeInfoEvt{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeBusiness='" + employeeBusiness + '\'' +
                ", employeeService='" + employeeService + '\'' +
                ", employeePicture='" + employeePicture + '\'' +
                ", orderState='" + orderState + '\'' +
                ", orderEvaluate='" + orderEvaluate + '\'' +
                '}';
    }

    public String getEmployeePicture() {
        return employeePicture;
    }

    public void setEmployeePicture(String employeePicture) {
        this.employeePicture = employeePicture;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBusiness() {
        return employeeBusiness;
    }

    public void setEmployeeBusiness(String employeeBusiness) {
        this.employeeBusiness = employeeBusiness;
    }

    public String getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(String employeeService) {
        this.employeeService = employeeService;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderEvaluate() {
        return orderEvaluate;
    }

    public void setOrderEvaluate(String orderEvaluate) {
        this.orderEvaluate = orderEvaluate;
    }
}
