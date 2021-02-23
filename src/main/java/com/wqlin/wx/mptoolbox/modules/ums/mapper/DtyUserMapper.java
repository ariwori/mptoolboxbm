package com.wqlin.wx.mptoolbox.modules.ums.mapper;

import com.wqlin.wx.mptoolbox.modules.ums.model.DtyUser;

import java.util.List;

public interface DtyUserMapper {
    int deleteByPrimaryKey(String uid);

    int insert(DtyUser record);

    int insertSelective(DtyUser record);

    DtyUser selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(DtyUser record);

    int updateByPrimaryKey(DtyUser record);

    List<DtyUser> findList(DtyUser record);

    List<DtyUser> findList1(DtyUser record);
}