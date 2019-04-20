package com.example.demo2.entity.mapVm;

import com.example.demo2.entity.EmployeeVm;
import com.example.demo2.entity.UserVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author zzl
 * @date 2019/4/1
 */
@ApiModel("查询所有服务人员返回类")
public class EmployeeMapVm implements Serializable {
    private static final long serialVersionUID = -5743115654740407987L;

    @ApiModelProperty("保存数组")
    private List<EmployeeVm> listInfo;

    @ApiModelProperty(value = "总数")
    private Long totalCount;

    @Override
    public String toString() {
        return "EmployeeMapVm{" +
                "listInfo=" + listInfo +
                ", totalCount=" + totalCount +
                '}';
    }

    public List<EmployeeVm> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<EmployeeVm> listInfo) {
        this.listInfo = listInfo;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
