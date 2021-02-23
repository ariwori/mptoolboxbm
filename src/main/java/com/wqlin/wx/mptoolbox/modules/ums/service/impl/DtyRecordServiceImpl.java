package com.wqlin.wx.mptoolbox.modules.ums.service.impl;

import com.wqlin.wx.mptoolbox.modules.ums.mapper.DtyRecordMapper;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyRecord;
import com.wqlin.wx.mptoolbox.modules.ums.service.DtyRecordService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class DtyRecordServiceImpl implements DtyRecordService {

    @Resource
    private DtyRecordMapper dtyRecordMapper;

    @Override
    public int deleteByPrimaryKey(String rid) {
        return dtyRecordMapper.deleteByPrimaryKey(rid);
    }

    @Override
    public int insert(DtyRecord record) {
        return dtyRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(DtyRecord record) {
        return dtyRecordMapper.insertSelective(record);
    }

    @Override
    public DtyRecord selectByPrimaryKey(String rid) {
        return dtyRecordMapper.selectByPrimaryKey(rid);
    }

    @Override
    public int updateByPrimaryKeySelective(DtyRecord record) {
        return dtyRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DtyRecord record) {
        return dtyRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public String add(DtyRecord record) {
        String rid = UUID.randomUUID().toString().replace("-", "");
        record.setRid(rid);
        record.setCreatetime(new Date());
        return "预订成功";
    }

    @Override
    public List<DtyRecord> find(DtyRecord record) {
        return dtyRecordMapper.findList(record);
    }
}



