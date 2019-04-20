package com.example.demo2.service.Impl;

import com.example.demo2.entity.EmployeeVm;
import com.example.demo2.entity.OneEmployeeVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.EmployeeInfoEvt;
import com.example.demo2.entity.mapVm.EmployeeMapVm;
import com.example.demo2.mapper.EmployeeMapper;
import com.example.demo2.service.EmployeeService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @date 2019/4/1
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询服务人员
     * @param evt
     * @return
     */
    @Override
    public EmployeeMapVm getEmployeeInfo(EmployeeInfoEvt evt){
        EmployeeMapVm mapVm = new EmployeeMapVm();
        Page<EmployeeVm> pageObj =  PageHelper.startPage(evt.getPageNo(), evt.getPageSize(), evt.getNeedTotal());
        evt.setOrderState("完成");
        List<EmployeeVm> employeeVm = employeeMapper.getEmployeeInfo(evt);
        mapVm.setTotalCount(pageObj.getTotal());
        mapVm.setListInfo(pageObj.getResult());
        return mapVm;
    }

    /**
     * 添加服务人员
     * @param evt
     * @return
     */
    @Override
    public int addEmplyee(EmployeeEvt evt){
        int i = 0;
        try {
            i = employeeMapper.addEmployee(evt);

        } catch (Exception e) {
            i = -1;
        }finally {
        }
        return i;
    }

    /**
     * 查询是否存在该id的用户
     * @param evt
     * @return
     */
    @Override
    public OneEmployeeVm getOneEmployeeInfo(EmployeeIdEvt evt){
        return employeeMapper.getOneEmployeeInfo(evt);
    }

    /**
     * 删除服务人员
     * @param evt
     * @return
     */
    @Override
    public int deleteEmployee(EmployeeIdEvt evt){
        int i = 0;
        try {
            i = employeeMapper.deleteEmployee(evt);
        }catch (Exception e){
            i = -1;
        }
            return i;
    }

    /**
     * 更新服务人员
     * @param evt
     * @return
     */
    @Override
    public int updateEmployee(EmployeeEvt evt){
        int i = 0;
        try {
            i = employeeMapper.updateEmployee(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }


    /**
     * 服务人员登录
     * @param evt
     * @return
     */
    @Override
    public OneEmployeeVm employeeLogin(EmployeeEvt evt){
        if(evt.getEmployeeId() == null || "".equals(evt.getEmployeeId()) || evt.getEmployeePwd() == null || "".equals(evt.getEmployeePwd())){
            return null;
        }
        return employeeMapper.employeeLogin(evt);
    }


}
