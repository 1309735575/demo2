package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/13
 */
@ApiModel("用户id参数")
public class UserIdEvt implements Serializable {
    private static final long serialVersionUID = -3228906356947567101L;

    @ApiModelProperty("用户账户ID")
    private String userId;


    @Override
    public String toString() {
        return "UserIdEvt{" +
                "userId='" + userId + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
