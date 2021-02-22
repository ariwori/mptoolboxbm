package com.wqlin.mptoolbox.modules.ums.service;

import com.wqlin.mptoolbox.modules.ums.dto.DtyBindUserParam;
import com.wqlin.mptoolbox.modules.ums.model.DtyUser;
public interface DtyUserService{


    int deleteByPrimaryKey(String uid);

    int insert(DtyUser record);

    int insertSelective(DtyUser record);

    DtyUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(DtyUser record);

    int updateByPrimaryKey(DtyUser record);

    DtyUser bind(DtyBindUserParam dtyBindUserParam);

}
