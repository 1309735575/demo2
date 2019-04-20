package com.example.demo2.entity.evt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author 曾智林
 * @target
 */
@ApiModel("查询实时或历史列表入参父类")
public class QueryPerformParentEvt {
    @ApiModelProperty(value = "导出类型,仅供导出使用")
    private Integer exportType;
    @ApiModelProperty(value = "是否需要查询总数")
    private Boolean needTotal = false;
    @ApiModelProperty(value = "页码")
    private Integer pageNo;
    @ApiModelProperty(value = "页面大小")
    private Integer pageSize;

    @Override
    public String toString() {
        return "QueryPerformParentEvt{" +
                "exportType=" + exportType +
                ", needTotal=" + needTotal +
                ", pageNo=" + pageNo +
                ", pageSize=" + pageSize +
                '}';
    }

    public Integer getExportType() {
        return exportType;
    }

    public void setExportType(Integer exportType) {
        this.exportType = exportType;
    }

    public Boolean getNeedTotal() {
        return needTotal;
    }

    public void setNeedTotal(Boolean needTotal) {
        this.needTotal = needTotal;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
