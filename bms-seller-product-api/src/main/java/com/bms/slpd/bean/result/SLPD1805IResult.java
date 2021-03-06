package com.bms.slpd.bean.result;

import com.bms.slpd.bean.result.field.SLPD1805IProductProducerResult;
import com.framework.base.rest.result.BaseRestPaginationResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "SLPD1805IResult", description = "批量查询单品品牌规格生产商API的出参")
public class SLPD1805IResult extends BaseRestPaginationResult<SLPD1805IProductProducerResult> {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "提示信息")
	private String[] messages;

	public String[] getMessages() {
		return messages;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}
}
