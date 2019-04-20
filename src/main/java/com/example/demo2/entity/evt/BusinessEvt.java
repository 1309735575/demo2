package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/10
 */
@Repository
@ApiModel("公司表参数类")
public class BusinessEvt extends QueryPerformParentEvt implements Serializable {

    private static final long serialVersionUID = -7804278007803525727L;
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
