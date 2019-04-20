package com.example.demo2.mapper;

import com.example.demo2.entity.UserVm;
import com.example.demo2.entity.evt.UserEvt;
import com.example.demo2.entity.evt.UserIdEvt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {

    List<UserVm> getUserInfo(UserEvt evt);

    int addUser(UserEvt user);

    int updateUser(UserEvt user);

    int deleteUser(List<UserIdEvt> list);

    UserVm userLogin(UserEvt evt);

    UserVm getOneUserInfo(UserIdEvt evt);

}
