package com.example.demo2.controller;

import com.example.demo2.entity.OneEmployeeVm;
import com.example.demo2.entity.ResultVm;
import com.example.demo2.entity.UserVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.UserEvt;
import com.example.demo2.service.EmployeeService;
import com.example.demo2.service.UserService;
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
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @author 曾智林
 *
 * @date 2019/03/26
 */
@Controller
@Api("登陆界面")
@RequestMapping("/index")
public class IndexController {


    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    private UserService userService;
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("")
    @ApiOperation("进入登陆界面")
    public String toLogin(){
        LOGGER.info("toLogin->进入登陆界面->");
        return "plogin";
    }

    @RequestMapping("/login")
    @ApiOperation("登陆")
    @ResponseBody
    public String login(Model model, @RequestBody(required = true)UserEvt evt, HttpServletRequest request){
        LOGGER.info("login->登陆->传参：userEvt:" + evt.toString());
        UserVm userVm = userService.userLogin(evt);
        HttpSession session = request.getSession();
        if(userVm == null){
            return "fail";
        }else {
            session.setAttribute("userId", evt.getUserId());
            session.setAttribute("userPwd", evt.getUserPwd());
            session.setAttribute("loginUser",userVm);
            return "success";
        }
    }


    @RequestMapping("/employeelogin")
    @ApiOperation("服务人员登陆")
    @ResponseBody
    public String employeeLogin( @RequestBody(required = true)EmployeeEvt evt, HttpServletRequest request, HttpSession session){
        LOGGER.info("employeelogin->登陆->传参：EmployeeEvt:" + evt.toString());
        OneEmployeeVm oneEmployeeVm = employeeService.employeeLogin(evt);
        ResultVm vm = new ResultVm();
        if(oneEmployeeVm == null){
            vm.setResult("fail");
            return "fail";
        }else {
            session.setAttribute("empId", evt.getEmployeeId());
            session.setAttribute("empPwd", evt.getEmployeePwd());
            session.setAttribute("loginEmployee",oneEmployeeVm);
            return "success";
        }
    }

//    @RequestMapping("/tomain")
//    public String toMain(HttpServletRequest request){
//        LOGGER.info("toMain->进入主界面->");
//
//        return "employeelist";
//    }

//    @RequestMapping("/touserself")
//    public String toUserself(Model model , HttpServletRequest request){
//        LOGGER.info("touserself->进入个人资料修改->");
//        HttpSession session = request.getSession();
//        UserVm userVm = (UserVm) session.getAttribute("loginUser");
//        model.addAttribute("userVm",userVm);
//        ResultVm vm = new ResultVm();
//        vm.setResult("success");
//        model.addAttribute("result",vm);
//        return "userself";
//    }

//    @RequestMapping("/toneworder")
//    public String toNewOrder(){
//        LOGGER.info("toneworder->进入主界面->");
//        return "neworder";
//    }

//    @RequestMapping("/logout")
//    public String logOut(HttpServletRequest request){
//        LOGGER.info("logout->进入登陆页面->");
//        HttpSession session = request.getSession();
//        session.invalidate();
//        return "plogin";
//    }



//    @RequestMapping("toelogin")
//    public String toELogin(Model model){
//        LOGGER.info("toelogin->进入登陆页面->");
//        ResultVm vm = new ResultVm();
//        vm.setResult("success");
//        model.addAttribute("result",vm);
//        return "elogin";
//    }





}
