package com.wqlin.wx.mptoolbox.modules.ums.mapper;

import com.wqlin.wx.mptoolbox.modules.ums.model.DtyRecord;

import java.util.List;

public interface DtyRecordMapper {
    int deleteByPrimaryKey(String rid);

    int insert(DtyRecord record);

    int insertSelective(DtyRecord record);

    DtyRecord selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(DtyRecord record);

    int updateByPrimaryKey(DtyRecord record);

    List<DtyRecord> findList(DtyRecord record);
}
