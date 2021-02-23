package com.wqlin.wx.mptoolbox.modules.ums.controller;

import com.wqlin.wx.mptoolbox.common.api.CommonResult;
import com.wqlin.wx.mptoolbox.modules.ums.dto.DtyBindUserParam;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyUser;
import com.wqlin.wx.mptoolbox.modules.ums.service.DtyUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 小程序用户OpenID绑定员工
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "WxUserController", description = "小程序用户管理")
@RequestMapping("/wx/user")
public class WxUserController {
    @Autowired
    private DtyUserService dtyUserService;

    @ApiOperation(value = "用户绑定")
    @RequestMapping(value = "/bind", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<DtyUser> bind(@Validated @RequestBody DtyUser record) {
        DtyUser dtyUser = dtyUserService.bind(record);
        return CommonResult.success(dtyUser);
    }

}
