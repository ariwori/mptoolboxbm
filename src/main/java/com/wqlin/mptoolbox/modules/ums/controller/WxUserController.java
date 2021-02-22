package com.wqlin.mptoolbox.modules.ums.controller;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wqlin.mptoolbox.common.api.CommonPage;
import com.wqlin.mptoolbox.common.api.CommonResult;
import com.wqlin.mptoolbox.modules.ums.dto.DtyBindUserParam;
import com.wqlin.mptoolbox.modules.ums.dto.UmsAdminLoginParam;
import com.wqlin.mptoolbox.modules.ums.dto.UmsAdminParam;
import com.wqlin.mptoolbox.modules.ums.dto.UpdateAdminPasswordParam;
import com.wqlin.mptoolbox.modules.ums.model.DtyUser;
import com.wqlin.mptoolbox.modules.ums.model.UmsAdmin;
import com.wqlin.mptoolbox.modules.ums.model.UmsRole;
import com.wqlin.mptoolbox.modules.ums.service.DtyUserService;
import com.wqlin.mptoolbox.modules.ums.service.UmsAdminService;
import com.wqlin.mptoolbox.modules.ums.service.UmsRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public CommonResult<DtyUser> bind(@Validated @RequestBody DtyBindUserParam dtyBindUserParam) {
        DtyUser dtyUser = dtyUserService.bind(dtyBindUserParam);
        return CommonResult.success(dtyUser);
    }

}
