package com.example.demo2.controller;

import com.example.demo2.entity.ResultVm;
import com.example.demo2.entity.UserVm;
import com.example.demo2.entity.evt.UserEvt;
import com.example.demo2.entity.evt.UserIdEvt;
import com.example.demo2.entity.mapVm.UserMapVm;
import com.example.demo2.service.UserService;
import com.example.demo2.util.FileUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zzl
 * @date 2019/3/26
 */
@Controller
@Api("用户管理")
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    private HttpSession httpSession;

    @Autowired
    private UserService userService;

    private final ResourceLoader resourceLoader;

    @Autowired
    public UserController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Value("${web.upload-path}")
    private String path;

    @RequestMapping("/getuserinfo")
    @ApiOperation("查询用户")
    @ResponseBody
    public UserMapVm getUserInfo(HttpServletRequest request, Model model, @RequestBody(required = true)UserEvt evt){
        UserMapVm mapVm = userService.getUserInfo(evt);
        return mapVm;
    }

    @RequestMapping("/adduser")
    @ApiOperation("注册用户")
    @ResponseBody
    public ResultVm addUser(HttpServletRequest request, @RequestBody(required = true)UserEvt evt, HttpSession session){
        LOGGER.info("adduser->添加用户->传参：UserEvt:" + evt.toString());
        // 要上传的目标文件存放路径
        UserIdEvt userIdEvt = new UserIdEvt();
        userIdEvt.setUserId(evt.getUserId());
        UserVm uservm = userService.getOneUserInfo(userIdEvt);
        ResultVm vm = new ResultVm();
        if(uservm != null){
            vm.setResult("该用户id已经存在");
            return vm;
        }
        evt.setUserMoney("100");
        evt.setUserPicture("avatar.jpg");
        int i = userService.addUser(evt);
        if(i == 0){
            vm.setResult("fail");
            return vm;
        }else if(i == 1){
            vm.setResult("success");
            session.setAttribute("userId", evt.getUserId());
            session.setAttribute("userPwd", evt.getUserPwd());
            UserVm userVm = userService.userLogin(evt);
            session.setAttribute("loginUser",userVm);
        }else{
            vm.setResult("fail");
            return vm;
        }
        return vm;
    }

    @RequestMapping("/deleteuser")
    @ApiOperation("删除人员")
    @ResponseBody
    public ResultVm deleteUser(HttpServletRequest request, @RequestBody(required = true) List<UserIdEvt> list){
        LOGGER.info("deleteuser->删除人员->传参：EmployeeIdEvt:" + list.toString());
        ResultVm vm = new ResultVm();
        int i = userService.deleteUser(list);
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            vm.setResult("success");
        }else{
            vm.setResult("无法删除");
        }
        return vm;
    }


    @RequestMapping("/updateuser")
    @ApiOperation("修改人员")
    @ResponseBody
    public ResultVm updateUser(HttpServletRequest request, @ModelAttribute UserEvt evt, @RequestParam("fileName") MultipartFile fileName){
        LOGGER.info("updateUser->修改人员->传参：UserEvt:" + evt.toString());
        HttpSession session = request.getSession();
        UserVm userVm = (UserVm) session.getAttribute("loginUser");
        evt.setUserId(userVm.getUserId());
        if(evt.getUserPwd() == null || "".equals(evt.getUserPwd())){
            evt.setUserPwd(userVm.getUserPwd());
        }
        evt.setUserMoney(userVm.getUserMoney());
        if(fileName.getOriginalFilename() == null || "".equals(fileName.getOriginalFilename())){
            evt.setUserPicture(userVm.getUserPicture());
        }else{
            evt.setUserPicture(fileName.getOriginalFilename());
        }
        int i = userService.updateUser(evt);
        ResultVm vm = new ResultVm();
        if(i == 0){
            vm.setResult("fail");
        }else if(i == 1){
            String localPath = "F:/idea/demo2.1/src/main/resources/static/assets/img";
            if (FileUtils.upload(fileName, localPath, fileName.getOriginalFilename())){
                LOGGER.info("fileUpload->成功->");
                vm.setResult("success");
            }else {
                LOGGER.info("fileUpload->失败->");
                vm.setResult("fail");
            }
        }else{
            vm.setResult("fail");
        }
        UserIdEvt userIdEvt = new UserIdEvt();
        userIdEvt.setUserId(evt.getUserId());
        UserVm userVm1 = userService.getOneUserInfo(userIdEvt);
        session.setAttribute("loginUser",userVm1);
        return vm;
    }



//    @RequestMapping("/touregister")
//    public String toURegister(Model model){
//        LOGGER.info("touregister->进入注册页面->传参：");
//        ResultVm vm = new ResultVm();
//        vm.setResult("success");
//        model.addAttribute("result",vm);
//        return "uregister";
//    }


//    @RequestMapping("touserlist")
//    public String toUserlist(Model model,HttpServletRequest request){
//        LOGGER.info("touserlist->进入用户列表管理->");
//        UserMapVm mapVm = userService.getUserInfo(evt);
//        model.addAttribute("usermapvm",mapVm);
//        return "userlist";
//    }





}
