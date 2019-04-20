package com.example.demo2.mapper;

import com.example.demo2.entity.ServiceListVm;
import com.example.demo2.entity.ServiceVm;
import com.example.demo2.entity.evt.ServiceEvt;
import com.example.demo2.entity.evt.ServiceIdEvt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ServiceMapper {

    List<ServiceListVm> getServiceInfo(ServiceEvt evt);

    List<ServiceVm> getSonServiceInfo(ServiceEvt evt);

    int addService(ServiceEvt evt);

    int updateService(ServiceEvt evt);

    int deleteService(ServiceIdEvt evt);
}
