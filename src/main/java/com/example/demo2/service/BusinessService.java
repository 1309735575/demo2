package com.example.demo2.service;

import com.example.demo2.entity.evt.BusinessEvt;
import com.example.demo2.entity.evt.BusinessIdEvt;
import com.example.demo2.entity.mapVm.BusinessMapVm;

public interface BusinessService {
    BusinessMapVm getBusinessInfo(BusinessEvt evt);

    int addBusiness(BusinessEvt evt);

    int deleteBusiness(BusinessIdEvt evt);

    int updateBusiness(BusinessEvt evt);
}
