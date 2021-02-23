package com.wqlin.wx.mptoolbox.modules.ums.service.impl;

import com.wqlin.wx.mptoolbox.modules.ums.dto.DtyBindUserParam;
import com.wqlin.wx.mptoolbox.modules.ums.mapper.DtyUserMapper;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyUser;
import com.wqlin.wx.mptoolbox.modules.ums.service.DtyUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import java.util.List;

@Service
public class DtyUserServiceImpl implements DtyUserService {

    @Resource
    private DtyUserMapper dtyUserMapper;

    @Override
    public int deleteByPrimaryKey(String uid) {
        return dtyUserMapper.deleteByPrimaryKey(uid);
    }

    @Override
    public int insert(DtyUser record) {
        return dtyUserMapper.insert(record);
    }

    @Override
    public int insertSelective(DtyUser record) {
        return dtyUserMapper.insertSelective(record);
    }

    @Override
    public DtyUser selectByPrimaryKey(String uid) {
        return dtyUserMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(DtyUser record) {
        return dtyUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DtyUser record) {
        return dtyUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public DtyUser bind(DtyUser dtyUser) {
        DtyUser temp = new DtyUser();
        temp.setName(dtyUser.getName());
        List<DtyUser> dtyUserList = dtyUserMapper.findList(temp);
        if (dtyUserList.size() > 0){
            DtyUser dtyUser1 = dtyUserList.get(0);
            String wxid = dtyUser1.getWxid();
            if (StringUtils.isEmpty(wxid)){
                temp.setUid(dtyUser1.getUid());
                temp.setWxid(dtyUser.getWxid());
                dtyUserMapper.updateByPrimaryKeySelective(temp);
                // 绑定成功
                dtyUser1.setWxid(temp.getWxid());
            }
            return dtyUser1;
        }else{
            // 无此用户
            return temp;
        }
    }

    @Override
    public List<DtyUser> find(DtyUser dtyUser) {
        return dtyUserMapper.findList1(dtyUser);
    }
}
