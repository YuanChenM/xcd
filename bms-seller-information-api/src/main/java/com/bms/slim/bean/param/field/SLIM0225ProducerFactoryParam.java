package com.bms.slim.bean.param.field;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class SLIM0225ProducerFactoryParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "生产商工厂ID")
    private Long factoryId;
    @ApiModelProperty(value = "卖家角色ID")
    private Long sellerRoleId;
    @ApiModelProperty(value = "总资产")
    private java.math.BigDecimal totalAsset;
    @ApiModelProperty(value = "注册资本")
    private java.math.BigDecimal registeredCapital;
    @ApiModelProperty(value = "占地面积")
    private java.math.BigDecimal coveredArea;
    @ApiModelProperty(value = "厂房面积")
    private java.math.BigDecimal workshopArea;
    @ApiModelProperty(value = "主要设备")
    private String majorEquipment;
    @ApiModelProperty(value = "设计产能")
    private String designCapacity;
    @ApiModelProperty(value = "外贸销售占比")
    private String exportSalePercent;
    @ApiModelProperty(value = "自销占比")
    private String selfSalePercent;
    @ApiModelProperty(value = "代理销售占比")
    private String agentSalePercent;
    @ApiModelProperty(value = "厂区照(远景)URL")
    private String factoryPicUrl;

    public Long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(Long factoryId) {
        this.factoryId = factoryId;
    }

    public Long getSellerRoleId() {
        return sellerRoleId;
    }

    public void setSellerRoleId(Long sellerRoleId) {
        this.sellerRoleId = sellerRoleId;
    }

    public BigDecimal getTotalAsset() {
        return totalAsset;
    }

    public void setTotalAsset(BigDecimal totalAsset) {
        this.totalAsset = totalAsset;
    }

    public BigDecimal getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(BigDecimal registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public BigDecimal getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(BigDecimal coveredArea) {
        this.coveredArea = coveredArea;
    }

    public BigDecimal getWorkshopArea() {
        return workshopArea;
    }

    public void setWorkshopArea(BigDecimal workshopArea) {
        this.workshopArea = workshopArea;
    }

    public String getMajorEquipment() {
        return majorEquipment;
    }

    public void setMajorEquipment(String majorEquipment) {
        this.majorEquipment = majorEquipment;
    }

    public String getDesignCapacity() {
        return designCapacity;
    }

    public void setDesignCapacity(String designCapacity) {
        this.designCapacity = designCapacity;
    }

    public String getExportSalePercent() {
        return exportSalePercent;
    }

    public void setExportSalePercent(String exportSalePercent) {
        this.exportSalePercent = exportSalePercent;
    }

    public String getSelfSalePercent() {
        return selfSalePercent;
    }

    public void setSelfSalePercent(String selfSalePercent) {
        this.selfSalePercent = selfSalePercent;
    }

    public String getAgentSalePercent() {
        return agentSalePercent;
    }

    public void setAgentSalePercent(String agentSalePercent) {
        this.agentSalePercent = agentSalePercent;
    }

    public String getFactoryPicUrl() {
        return factoryPicUrl;
    }

    public void setFactoryPicUrl(String factoryPicUrl) {
        this.factoryPicUrl = factoryPicUrl;
    }
}
