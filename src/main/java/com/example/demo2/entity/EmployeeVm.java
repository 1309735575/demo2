package com.example.demo2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/3/29
 */
@Repository
@ApiModel("服务人员返回参数")
public class EmployeeVm implements Serializable {
    private static final long serialVersionUID = 2421340246035929016L;
    @ApiModelProperty("服务人员id")
    private String employeeId;
    @ApiModelProperty("服务人员名称")
    private String employeeName;
    @ApiModelProperty("服务人员年龄")
    private String employeeAge;
    @ApiModelProperty("服务人员手机")
    private String employeePhone;
    @ApiModelProperty("服务人员公司id")
    private String employeeBusiness;
    @ApiModelProperty("服务人员公司名字")
    private String businessName;
    @ApiModelProperty("服务人员密码")
    private String employeePwd;
    @ApiModelProperty("服务人员工作id")
    private String employeeService;
    @ApiModelProperty("服务人员工作名字")
    private String serviceName;
    @ApiModelProperty("服务人员收入")
    private String employeeMoney;
    @ApiModelProperty("服务人员订单数")
    private String employeeOrder;

    @Override
    public String toString() {
        return "EmployeeVm{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeBusiness='" + employeeBusiness + '\'' +
                ", businessName='" + businessName + '\'' +
                ", employeePwd='" + employeePwd + '\'' +
                ", employeeService='" + employeeService + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", employeeMoney='" + employeeMoney + '\'' +
                ", employeeOrder='" + employeeOrder + '\'' +
                '}';
    }

    public String getEmployeeOrder() {
        return employeeOrder;
    }

    public void setEmployeeOrder(String employeeOrder) {
        this.employeeOrder = employeeOrder;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public String getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeBusiness() {
        return employeeBusiness;
    }

    public void setEmployeeBusiness(String employeeBusiness) {
        this.employeeBusiness = employeeBusiness;
    }

    public String getEmployeePwd() {
        return employeePwd;
    }

    public void setEmployeePwd(String employeePwd) {
        this.employeePwd = employeePwd;
    }

    public String getEmployeeService() {
        return employeeService;
    }

    public void setEmployeeService(String employeeService) {
        this.employeeService = employeeService;
    }

    public String getEmployeeMoney() {
        return employeeMoney;
    }

    public void setEmployeeMoney(String employeeMoney) {
        this.employeeMoney = employeeMoney;
    }
}
