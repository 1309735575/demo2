package com.example.demo2.service;

import com.example.demo2.entity.ServiceListVm;
import com.example.demo2.entity.evt.ServiceEvt;
import com.example.demo2.entity.evt.ServiceIdEvt;

import java.util.List;

public interface SerService {
    List<ServiceListVm> getServiceInfo();

    int addService(ServiceEvt evt);

    int deleteService(ServiceIdEvt evt);

    int updateService(ServiceEvt evt);
}
