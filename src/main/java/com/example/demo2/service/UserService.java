package com.example.demo2.service;

import com.example.demo2.entity.UserVm;
import com.example.demo2.entity.evt.UserEvt;
import com.example.demo2.entity.evt.UserIdEvt;
import com.example.demo2.entity.mapVm.UserMapVm;

import java.util.List;

public interface UserService {
    UserMapVm getUserInfo(UserEvt evt);

    UserVm userLogin(UserEvt evt);

    int addUser(UserEvt evt);

    int deleteUser(List<UserIdEvt> list);

    int updateUser(UserEvt evt);

    UserVm getOneUserInfo(UserIdEvt evt);
}
