package com.example.demo2.entity.mapVm;

import com.example.demo2.entity.BusinessVm;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * @author zzl
 * @date 2019/4/11
 */
public class BusinessMapVm implements Serializable {
    private static final long serialVersionUID = -979388274034957089L;

    @ApiModelProperty("保存数组")
    private List<BusinessVm> listInfo;

    @ApiModelProperty(value = "总数")
    private Long totalCount;

    @Override
    public String toString() {
        return "BusinessMapVm{" +
                "listInfo=" + listInfo +
                ", totalCount=" + totalCount +
                '}';
    }

    public List<BusinessVm> getListInfo() {
        return listInfo;
    }

    public void setListInfo(List<BusinessVm> listInfo) {
        this.listInfo = listInfo;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
