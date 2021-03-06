package com.bms.slim.bean.result;

import com.bms.slim.bean.result.field.SLIM0111AgentSupplyQualificationResult;
import com.framework.base.rest.result.BaseRestPaginationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SLIM0111IResult", description = "查询卖家代理商供应资质接口出参")
public class SLIM0111IResult extends BaseRestPaginationResult<SLIM0111AgentSupplyQualificationResult> {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value = "返回消息")
    private String[] message;

    public String[] getMessage() {
        return message;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }
}
