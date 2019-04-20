package com.example.demo2.entity.mapVm;

import com.example.demo2.entity.UserVm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author zzl
 * @date 2019/3/26
 */
@ApiModel("查询所有用户返回类")
public class UserMapVm implements Serializable {
    private static final long serialVersionUID = -7812989723192631047L;

    @ApiModelProperty("保存数组")
    private List<UserVm> listInfo;

    @ApiModelProperty(value = "总数")
    private Long totalCount;

    public List<UserVm> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<UserVm> listInfo) {
        this.listInfo = listInfo;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "UserMapVm{" +
                "listInfo=" + listInfo +
                ", totalCount=" + totalCount +
                '}';
    }
}
