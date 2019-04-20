package com.example.demo2.service.Impl;

import com.example.demo2.entity.ServiceListVm;
import com.example.demo2.entity.ServiceVm;
import com.example.demo2.entity.evt.EmployeeEvt;
import com.example.demo2.entity.evt.EmployeeIdEvt;
import com.example.demo2.entity.evt.ServiceEvt;
import com.example.demo2.entity.evt.ServiceIdEvt;
import com.example.demo2.mapper.ServiceMapper;
import com.example.demo2.service.SerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zzl
 * @date 2019/3/29
 */
@Service
public class SerSerciveImpl implements SerService {

    @Autowired
    private ServiceMapper serviceMapper;


    @Override
    public List<ServiceListVm> getServiceInfo(){
        ServiceEvt evt = new ServiceEvt();
        evt.setParentId("0");
        List<ServiceListVm> listVms = serviceMapper.getServiceInfo(evt);
        for (int i = 0; i < listVms.size(); i++){
            ServiceListVm listVm = listVms.get(i);
            evt.setParentId(listVm.getServiceId());
            List<ServiceVm> listVmsSon = serviceMapper.getSonServiceInfo(evt);
            listVm.setSonService(listVmsSon);
        }

        return listVms ;
    }


    /**
     * 添加服务行业
     * @param evt
     * @return
     */
    @Override
    public int addService(ServiceEvt evt){
        int i = 0;
        try {
            String serviceParentId = evt.getParentId();
            ServiceEvt sonevt = new ServiceEvt();
            sonevt.setParentId(serviceParentId);
            List<ServiceVm> list = serviceMapper.getSonServiceInfo(sonevt);
            int ierviceId = list.size() + 1;
            String serviceId;
            if(ierviceId == 1){
                serviceId = String.valueOf(ierviceId);
            }else if(ierviceId < 10){
                serviceId =  evt.getParentId() + "0" + ierviceId;
            }else{
                serviceId =  evt.getParentId() + ierviceId;
            }
            evt.setServiceId(serviceId);
            i = serviceMapper.addService(evt);

        } catch (Exception e) {
            i = -1;
        }finally {
        }
        return i;
    }


    /**
     * 删除服务行业
     * @param evt
     * @return
     */
    @Override
    public int deleteService(ServiceIdEvt evt){
        int i = 0;
        try {
            i = serviceMapper.deleteService(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }


    /**
     * 更新服务行业
     * @param evt
     * @return
     */
    @Override
    public int updateService(ServiceEvt evt){
        int i = 0;
        try {
            i = serviceMapper.updateService(evt);
        }catch (Exception e){
            i = -1;
        }
        return i;
    }

}
