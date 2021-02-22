package com.wqlin.mptoolbox.modules.ums.mapper;

import com.wqlin.mptoolbox.modules.ums.model.DtyRecord;

public interface DtyRecordMapper {
    int deleteByPrimaryKey(String rid);

    int insert(DtyRecord record);

    int insertSelective(DtyRecord record);

    DtyRecord selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(DtyRecord record);

    int updateByPrimaryKey(DtyRecord record);
}