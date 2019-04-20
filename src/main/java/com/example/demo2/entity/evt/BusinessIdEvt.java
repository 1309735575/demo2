package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/10
 */
@ApiModel("公司表ID参数类")
public class BusinessIdEvt implements Serializable {


    private static final long serialVersionUID = -5414131067562331276L;
    @ApiModelProperty(value = "服务公司id")
    private String businessId;

    @Override
    public String toString() {
        return "BusinessIdEvt{" +
                "businessId='" + businessId + '\'' +
                '}';
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
