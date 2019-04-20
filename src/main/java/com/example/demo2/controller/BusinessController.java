package com.example.demo2.controller;

import com.example.demo2.entity.ResultVm;
import com.example.demo2.entity.evt.BusinessEvt;
import com.example.demo2.entity.evt.BusinessIdEvt;
import com.example.demo2.entity.mapVm.BusinessMapVm;
import com.example.demo2.service.BusinessService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zzl
 * @date 2019/4/11
 */
@RequestMapping("/business")
@Controller
@Api("服务公司管理")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessController.class);

    @RequestMapping("/getbusinessinfo")
    @ApiOperation("查询服务公司")
    @ResponseBody
    public BusinessMapVm getBusinessInfo(HttpServletRequest request, @RequestBody(required = true) BusinessEvt evt){
        LOGGER.info("getbusinessinfo->查询服务公司->传参：BusinessEvt:" + evt.toString());
        return businessService.getBusinessInfo(evt);
    }

    @RequestMapping("/addbusiness")
    @ApiOperation("添加服务公司")
    @ResponseBody
    public ResultVm addBusiness(HttpServletRequest request, @RequestBody(required =  true) BusinessEvt evt){
        LOGGER.info("addbusiness->添加服务公司->传参：BusinessEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = businessService.addBusiness(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法添加");
        }
        return vm;
    }

    @RequestMapping("/deletebusiness")
    @ApiOperation("删除服务公司")
    @ResponseBody
    public ResultVm deleteBusiness(HttpServletRequest request, @RequestBody(required = true) BusinessIdEvt evt){
        LOGGER.info("deletebusiness->删除服务公司->传参：BusinessIdEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = businessService.deleteBusiness(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法删除");
        }
        return vm;
    }

    @RequestMapping("/updatebusiness")
    @ApiOperation("更新服务公司")
    @ResponseBody
    public ResultVm updateBusiness(HttpServletRequest request, @RequestBody(required = true) BusinessEvt evt){
        LOGGER.info("updatebusiness->更新服务公司->传参：BusinessEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = businessService.updateBusiness(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法更新");
        }
        return vm;
    }
}
