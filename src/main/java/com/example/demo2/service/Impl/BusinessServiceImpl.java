package com.example.demo2.service.Impl;

import com.example.demo2.entity.BusinessVm;
import com.example.demo2.entity.evt.BusinessEvt;
import com.example.demo2.entity.evt.BusinessIdEvt;
import com.example.demo2.entity.mapVm.BusinessMapVm;
import com.example.demo2.mapper.BusinessMapper;
import com.example.demo2.service.BusinessService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @date 2019/4/11
 */
@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessMapper businessMapper;

    /**
     * 查询服务公司
     * @param evt
     * @return
     */
    @Override
    public BusinessMapVm getBusinessInfo(BusinessEvt evt){
        BusinessMapVm mapVm = new BusinessMapVm();
        Page<BusinessVm> pageObj =  PageHelper.startPage(evt.getPageNo(), evt.getPageSize(), evt.getNeedTotal());
        List<BusinessVm> businessVm = businessMapper.getBusinessInfo(evt);
        mapVm.setTotalCount(pageObj.getTotal());
        mapVm.setListInfo(pageObj.getResult());
        return mapVm;
    }

    /**
     * 添加服务公司
     * @param evt
     * @return
     */
    @Override
    public int addBusiness(BusinessEvt evt){
        int i = 0;
        try {
            i = businessMapper.addBusiness(evt);

        } catch (Exception e) {
            i = -1;
        }finally {
        }
        return i;
    }


    /**
     * 删除服务公司
     * @param evt
     * @return
     */
    @Override
    public int deleteBusiness(BusinessIdEvt evt){
        int i = 0;
        try {
            i = businessMapper.deleteBusiness(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }

    /**
     * 更新服务公司
     * @param evt
     * @return
     */
    @Override
    public int updateBusiness(BusinessEvt evt){
        int i = 0;
        try {
            i = businessMapper.updateBusiness(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }



}
