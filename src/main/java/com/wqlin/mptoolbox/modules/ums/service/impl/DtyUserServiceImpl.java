package com.wqlin.mptoolbox.modules.ums.service.impl;

import com.wqlin.mptoolbox.modules.ums.dto.DtyBindUserParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.wqlin.mptoolbox.modules.ums.mapper.DtyUserMapper;
import com.wqlin.mptoolbox.modules.ums.model.DtyUser;
import com.wqlin.mptoolbox.modules.ums.service.DtyUserService;

import java.util.List;

@Service
public class DtyUserServiceImpl implements DtyUserService{

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
    public DtyUser bind(DtyBindUserParam dtyBindUserParam) {
        DtyUser temp = new DtyUser();
        temp.setWxid(dtyBindUserParam.getWxopenid());
        temp.setName(dtyBindUserParam.getUsername());
        List<DtyUser> dtyUserList = dtyUserMapper.findList(temp);
        if (dtyUserList.size() > 0){
            DtyUser dtyUser = dtyUserList.get(0);
            String wxid = dtyUser.getWxid();
            if (StringUtils.isEmpty(wxid)){
                temp.setUid(dtyUser.getUid());
                dtyUserMapper.updateByPrimaryKeySelective(temp);
                // 绑定成功
                dtyUser.setWxid(temp.getWxid());
            }
            return dtyUser;
        }else{
            // 无此用户
            return temp;
        }
    }
}
