package com.wqlin.mptoolbox.modules.ums.controller;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wqlin.mptoolbox.common.api.CommonPage;
import com.wqlin.mptoolbox.common.api.CommonResult;
import com.wqlin.mptoolbox.modules.ums.dto.UmsAdminLoginParam;
import com.wqlin.mptoolbox.modules.ums.dto.UmsAdminParam;
import com.wqlin.mptoolbox.modules.ums.dto.UpdateAdminPasswordParam;
import com.wqlin.mptoolbox.modules.ums.model.DtyRecord;
import com.wqlin.mptoolbox.modules.ums.model.UmsAdmin;
import com.wqlin.mptoolbox.modules.ums.model.UmsRole;
import com.wqlin.mptoolbox.modules.ums.service.DtyRecordService;
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
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@Api(tags = "WxRecordController", description = "预约记录管理")
@RequestMapping("/wx/ydrecord")
public class WxRecordController {
    @Autowired
    private DtyRecordService dtyRecordService;

    @ApiOperation(value = "新增预约记录")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult add(@Validated @RequestBody DtyRecord dtyRecord) {
        return CommonResult.success(dtyRecordService.add(dtyRecord));
    }

}
