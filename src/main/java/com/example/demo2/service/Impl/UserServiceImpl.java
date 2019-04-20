package com.example.demo2.service.Impl;

import com.example.demo2.entity.UserVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.UserEvt;
import com.example.demo2.entity.evt.UserIdEvt;
import com.example.demo2.entity.mapVm.UserMapVm;
import com.example.demo2.mapper.UserMapper;
import com.example.demo2.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

/**
 * @author zzl
 * @date 2019/3/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     *查询用户
     *
     * @param evt
     * @return
     */
    @Override
    public UserMapVm getUserInfo(UserEvt evt){
        UserMapVm mapVm = new UserMapVm();
        Page<UserVm> pageObj = PageHelper.startPage(evt.getPageNo(), evt.getPageSize(), evt.getNeedTotal());
        List<UserVm> userVm =  userMapper.getUserInfo(evt);
        userMapper.getUserInfo(evt);
        mapVm.setTotalCount(pageObj.getTotal());
        mapVm.setListInfo(pageObj.getResult());
        return mapVm;
    }

    /**
     * 登陆
     * @param evt
     * @return
     */
    @Override
    public UserVm userLogin(UserEvt evt){
        if(evt.getUserId() == null || "".equals(evt.getUserId()) || evt.getUserPwd() == null || "".equals(evt.getUserPwd())){
            return null;
        }
        return userMapper.userLogin(evt);
    }

    /**
     * 添加人员
     * @param evt
     * @return
     */
    @Override
    public int addUser(UserEvt evt){
        int i = 0;
        try {
            i = userMapper.addUser(evt);
        } catch (Exception e) {
            i = -1;
        }finally {
        }
        return i;
    }

    /**
     * 删除人员
     * @param list
     * @return
     */
    @Override
    public int deleteUser(List<UserIdEvt> list){
        int i = 0;
        try {
            i = userMapper.deleteUser(list);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }

    /**
     * 更新人员
     * @param evt
     * @return
     */
    @Override
    public int updateUser(UserEvt evt){
        int i = 0;
        try {
            i = userMapper.updateUser(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }

    /**
     *
     * @param evt
     * @return
     */
    @Override
    public UserVm getOneUserInfo(UserIdEvt evt){
        return userMapper.getOneUserInfo(evt);
    }



}
