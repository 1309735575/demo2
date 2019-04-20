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
@ApiModel("增删改服务人员参数")
public class EmployeeEvt implements Serializable {

    private static final long serialVersionUID = -6423322910964345621L;

    @ApiModelProperty("服务人员id")
    private String employeeId;
    @ApiModelProperty("服务人员名称")
    private String employeeName;
    @ApiModelProperty("服务人员年龄")
    private String employeeAge;
    @ApiModelProperty("服务人员手机")
    private String employeePhone;
    @ApiModelProperty("服务人员工司id")
    private String employeeBusiness;
    @ApiModelProperty("服务人员头像")
    private String employeePicture;
    @ApiModelProperty("服务人员密码")
    private String employeePwd;
    @ApiModelProperty("服务人员工作id")
    private String employeeService;
    @ApiModelProperty("服务人员收入")
    private String employeeMoney;

    @Override
    public String toString() {
        return "EmployeeEvt{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge='" + employeeAge + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeBusiness='" + employeeBusiness + '\'' +
                ", employeePicture='" + employeePicture + '\'' +
                ", employeePwd='" + employeePwd + '\'' +
                ", employeeService='" + employeeService + '\'' +
                ", employeeMoney='" + employeeMoney + '\'' +
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
