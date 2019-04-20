package com.example.demo2.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author zzl
 * @date 2019/3/29
 */
public class ServiceListVm implements Serializable {

    private static final long serialVersionUID = 3014691362319788581L;
    @ApiModelProperty("id")
    private String serviceId;
    @ApiModelProperty("岗位名称")
    private String workName;
    @ApiModelProperty("所属服务")
    private String serviceName;
    @ApiModelProperty("岗位职责")
    private String serviceDuty;
    @ApiModelProperty("父类岗位")
    private String parentId;

    private List<ServiceVm> sonService;

    @Override
    public String toString() {
        return "ServiceListVm{" +
                "serviceId='" + serviceId + '\'' +
                ", workName='" + workName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDuty='" + serviceDuty + '\'' +
                ", parentId='" + parentId + '\'' +
                ", sonService=" + sonService +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDuty() {
        return serviceDuty;
    }

    public void setServiceDuty(String serviceDuty) {
        this.serviceDuty = serviceDuty;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public List<ServiceVm> getSonService() {
        return sonService;
    }

    public void setSonService(List<ServiceVm> sonService) {
        this.sonService = sonService;
    }
}
