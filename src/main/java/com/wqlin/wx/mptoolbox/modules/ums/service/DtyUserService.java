package com.wqlin.wx.mptoolbox.modules.ums.service;

import com.wqlin.wx.mptoolbox.modules.ums.dto.DtyBindUserParam;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyRecord;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyUser;

import java.util.List;

public interface DtyUserService{


    int deleteByPrimaryKey(String uid);

    int insert(DtyUser record);

    int insertSelective(DtyUser record);

    DtyUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(DtyUser record);

    int updateByPrimaryKey(DtyUser record);

    DtyUser bind(DtyUser dtyUser);

    List<DtyUser> find(DtyUser dtyUser);

}
