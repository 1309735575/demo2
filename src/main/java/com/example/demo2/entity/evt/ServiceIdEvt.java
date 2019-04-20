package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/9
 */
@ApiModel("岗位表id参数类")
public class ServiceIdEvt implements Serializable {
    private static final long serialVersionUID = 14834790241871294L;
    @ApiModelProperty("岗位表id")
    private String serviceId;

    @Override
    public String toString() {
        return "ServiceIdEvt{" +
                "serviceId='" + serviceId + '\'' +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
}
