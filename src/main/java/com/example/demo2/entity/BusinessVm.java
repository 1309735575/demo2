package com.example.demo2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/10
 */
@ApiModel("服务公司返回参数")
public class BusinessVm implements Serializable {
    private static final long serialVersionUID = -5719656451138251925L;

    @ApiModelProperty(value = "服务公司id")
    private String businessId;
    @ApiModelProperty(value = "服务公司名字")
    private String businessName;
    @ApiModelProperty(value = "服务公司明细")
    private String businessDetail;

    @Override
    public String toString() {
        return "BusinessVm{" +
                "businessId='" + businessId + '\'' +
                ", businessName='" + businessName + '\'' +
                ", businessDetail='" + businessDetail + '\'' +
                '}';
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessDetail() {
        return businessDetail;
    }

    public void setBusinessDetail(String businessDetail) {
        this.businessDetail = businessDetail;
    }
}
