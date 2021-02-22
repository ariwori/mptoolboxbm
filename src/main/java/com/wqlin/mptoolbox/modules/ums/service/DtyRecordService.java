package com.wqlin.mptoolbox.modules.ums.service;

import com.wqlin.mptoolbox.modules.ums.model.DtyRecord;

import java.util.List;

public interface DtyRecordService {


    int deleteByPrimaryKey(String rid);

    int insert(DtyRecord record);

    int insertSelective(DtyRecord record);

    DtyRecord selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(DtyRecord record);

    int updateByPrimaryKey(DtyRecord record);

    String add(DtyRecord record);

    List<DtyRecord> find(DtyRecord record);
}



