package com.wqlin.wx.mptoolbox.modules.ums.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class DtyBindUserParam {
    @NotEmpty
    @ApiModelProperty(value = "姓名", required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "小程序开放ID", required = true)
    private String wxopenid;
}
