package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/3/26
 */
@ApiModel("用户类参数")
@Repository
public class UserEvt extends QueryPerformParentEvt implements Serializable {
    private static final long serialVersionUID = -8088329232218062378L;

    @ApiModelProperty("用户账户ID")
    private String userId;
    @ApiModelProperty("用户姓名")
    private String userName;
    @ApiModelProperty("用户密码")
    private String userPwd;
    @ApiModelProperty("用户年龄")
    private String userAge;
    @ApiModelProperty("用户手机号码")
    private String userPhone;
    @ApiModelProperty("用户性别")
    private String userSex;
    @ApiModelProperty("用户余额")
    private String userMoney;
    @ApiModelProperty("用户地址")
    private String userAddress;
    @ApiModelProperty("头像")
    private String userPicture;


    @Override
    public String toString() {
        return "UserEvt{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userMoney='" + userMoney + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPicture='" + userPicture + '\'' +
                '}';
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(String userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

}
