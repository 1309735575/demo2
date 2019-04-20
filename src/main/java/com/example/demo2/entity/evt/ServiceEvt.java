package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/3/28
 *
 */
@Repository
@ApiModel("岗位表参数类")
public class ServiceEvt implements Serializable {

    private static final long serialVersionUID = -6835397151292620915L;

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

    @Override
    public String toString() {
        return "ServiceEvt{" +
                "serviceId='" + serviceId + '\'' +
                ", workName='" + workName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDuty='" + serviceDuty + '\'' +
                ", parentId='" + parentId + '\'' +
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
}
