package com.example.demo2.controller;

import com.example.demo2.entity.OneEmployeeVm;
import com.example.demo2.entity.ResultVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.EmployeeInfoEvt;
import com.example.demo2.entity.mapVm.EmployeeMapVm;
import com.example.demo2.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zzl
 * @date 2019/4/1
 */
@RequestMapping("/employee")
@Controller
@Api("服务人员管理")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);


    @RequestMapping("/getemployeeinfo")
    @ApiOperation("查询服务人员")
    @ResponseBody
    public EmployeeMapVm getEmployeeInfo(HttpServletRequest request, @RequestBody(required = true)EmployeeInfoEvt evt){
        LOGGER.info("getemployeeinfo->查询服务人员->传参：EmployeeInfoEvt:" + evt.toString());
        return employeeService.getEmployeeInfo(evt);
    }

    @RequestMapping("/addemployee")
    @ApiOperation("添加服务人员")
    @ResponseBody
    public ResultVm addEmployee(HttpServletRequest request, @ModelAttribute EmployeeEvt evt, @RequestParam("fileName") MultipartFile fileName){
        LOGGER.info("addemployee->添加服务人员->传参：EmployeeEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        EmployeeIdEvt employeeIdEvt = new EmployeeIdEvt();
        employeeIdEvt.setEmployeeId(evt.getEmployeeId());
        OneEmployeeVm oneEmployeeVm = employeeService.getOneEmployeeInfo(employeeIdEvt);
        if(oneEmployeeVm != null){
            vm.setResult("该用户id已经存在");
            return vm;
        }
        int i = employeeService.addEmplyee(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法添加");
        }
        return vm;
    }


    @RequestMapping("/deleteemployee")
    @ApiOperation("删除服务人员")
    @ResponseBody
    public ResultVm deleteEmployee(HttpServletRequest request, @RequestBody(required = true)EmployeeIdEvt evt){
        LOGGER.info("deleteEmployee->删除服务人员->传参：EmployeeIdEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = employeeService.deleteEmployee(evt);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法删除");
        }
        return vm;
    }


    @RequestMapping("/updateemployee")
    @ApiOperation("更新服务人员")
    @ResponseBody
    public ResultVm updateEmployee(HttpServletRequest request, @RequestBody(required = true)EmployeeEvt evt){
        LOGGER.info("deleteEmployee->删除服务人员->传参：EmployeeIdEvt:" + evt.toString());
        ResultVm vm = new ResultVm();
        int i = employeeService.updateEmployee(evt);
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
