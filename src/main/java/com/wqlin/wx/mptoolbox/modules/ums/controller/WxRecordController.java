package com.wqlin.wx.mptoolbox.modules.ums.controller;

import com.wqlin.wx.mptoolbox.common.api.CommonResult;
import com.wqlin.wx.mptoolbox.modules.ums.model.DtyRecord;
import com.wqlin.wx.mptoolbox.modules.ums.service.DtyRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
