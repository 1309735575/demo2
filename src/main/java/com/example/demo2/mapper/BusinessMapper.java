package com.example.demo2.mapper;

import com.example.demo2.entity.BusinessVm;
import com.example.demo2.entity.evt.BusinessEvt;
import com.example.demo2.entity.evt.BusinessIdEvt;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BusinessMapper {

    List<BusinessVm> getBusinessInfo(BusinessEvt evt);

    int addBusiness(BusinessEvt evt);

    int deleteBusiness(BusinessIdEvt evt);

    int updateBusiness(BusinessEvt evt);
}
