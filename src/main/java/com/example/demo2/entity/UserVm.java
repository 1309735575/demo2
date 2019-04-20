package com.example.demo2.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 *@date 2019/3/26
 *
 */
@ApiModel("用户实体类")
public class UserVm implements Serializable {

    private static final long serialVersionUID = 8395886783454176186L;
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
    @ApiModelProperty("头像")
    private String userPicture;
    @ApiModelProperty("用户余额")
    private String userMoney;
    @ApiModelProperty("地址")
    private String userAddress;

    @Override
    public String toString() {
        return "UserVm{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", userMoney='" + userMoney + '\'' +
                ", userAddress='" + userAddress + '\'' +
                '}';
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(String userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
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
