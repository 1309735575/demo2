package com.example.demo2.controller;

import com.example.demo2.entity.ResultVm;
import com.example.demo2.entity.ServiceListVm;
import com.example.demo2.entity.evt.ServiceEvt;
import com.example.demo2.entity.evt.ServiceIdEvt;
import com.example.demo2.service.SerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zzl
 * @date 2019/3/29
 */
@Controller
@Api("用户管理")
@RequestMapping("/service")
public class ServiceController {
    @Autowired
    private SerService serService;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceController.class);

    @RequestMapping("/getserviceinfo")
    @ApiOperation("查询服务")
    @ResponseBody
    public List<ServiceListVm> getServiceInfo(HttpServletRequest request){
        LOGGER.info("getServiceInfo->查询服务->");
        return serService.getServiceInfo();
    }

    @RequestMapping("/addservice")
    @ApiOperation("添加服务行业")
    @ResponseBody
    public ResultVm addService(HttpServletRequest request, @RequestBody(required =  true) ServiceEvt evt){
        LOGGER.info("addservice->添加服务行业->传参：ServiceEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = serService.addService(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法删除");
        }
        return vm;
    }

    @RequestMapping("/deleteservice")
    @ApiOperation("删除服务行业")
    @ResponseBody
    public ResultVm deleteService(HttpServletRequest request, @RequestBody(required = true) ServiceIdEvt evt){
        LOGGER.info("deleteservice->删除服务行业->传参：ServiceIdEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = serService.deleteService(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法添加");
        }
        return vm;
    }

    @RequestMapping("/updateservice")
    @ApiOperation("更新服务行业")
    @ResponseBody
    public ResultVm updateService(HttpServletRequest request, @RequestBody(required = true)ServiceEvt evt){
        LOGGER.info("updateService->更新服务行业->传参：ServiceEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = serService.updateService(evt);
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
