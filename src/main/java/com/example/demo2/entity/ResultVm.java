package com.example.demo2.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zzl
 * @date 2019/4/2
 */
@ApiModel("删改查返回参数")
public class ResultVm implements Serializable {

    private static final long serialVersionUID = 460001377421436645L;

    @ApiModelProperty("结果")
    private String result;

    @Override
    public String toString() {
        return "ResultVm{" +
                "result='" + result + '\'' +
                '}';
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
