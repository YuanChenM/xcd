package com.bms.slpd.bean.param;

import com.framework.base.rest.param.BaseRestPaginationParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "SLPD1805IParam", description = "批量查询产品生产商API的入参")
public class SLPD1805IParam extends BaseRestPaginationParam {

    @ApiModelProperty(value = "产品生产商ID集合")
    private List<Long> producerProductIds;
    @ApiModelProperty(value = "产品生产商Code")
    private String producerProductCode;
    @ApiModelProperty(value = "产品生产商Code集合")
    private List<String> producerProductCodes;
    @ApiModelProperty(value = "产品生产商Sku")
    private String producerProductSku;
    @ApiModelProperty(value = "单品品牌规格Sku")
    private String brandItemPropertySku;
    @ApiModelProperty(value = "产品生产商审核状态集合")
    private List<String> auditStus;
    @ApiModelProperty(value = "删除标识")
    private Boolean delFlg;

    @ApiModelProperty(value = "实体卖家ID集合")
    private List<Long> entitySellerIds;

    @ApiModelProperty(value = "产品Id集合")
    private List<String> productIds;
    @ApiModelProperty(value = "质量等级集合")
    private List<String> qualityGradeTypes;
    @ApiModelProperty(value = "产品审核状态集合")
    private List<String> productAuditStus;

    @ApiModelProperty(value = "单品规格ID集合")
    private List<Long> itemPropertyIds;
    @ApiModelProperty(value = "单品规格编码集合")
    private List<String> itemPropertyCodes;

    @ApiModelProperty(value = "单品品牌ID集合")
    private List<Long> brandItemIds;
    @ApiModelProperty(value = "单品品牌SKU集合")
    private List<String> brandItemSkus;

    @ApiModelProperty(value = "品牌ID集合")
    private List<Long> brandIds;
    @ApiModelProperty(value = "品牌编码集合")
    private List<String> brandCodes;
    @ApiModelProperty(value = "品牌名称")
    private String brandName;
    @ApiModelProperty(value = "品牌类型集合")
    private List<String> brandTypes;

    @ApiModelProperty(value = "单品ID集合")
    private List<Long> itemIds;
    @ApiModelProperty(value = "单品编码集合")
    private List<String> itemCodes;
    @ApiModelProperty(value = "单品SKU集合")
    private List<String> itemSkus;
    @ApiModelProperty(value = "单品名称")
    private String itemName;

    @ApiModelProperty(value = "品种ID集合")
    private List<Long> breedIds;
    @ApiModelProperty(value = "品种编码集合")
    private List<String> breedCodes;
    @ApiModelProperty(value = "品种SKU集合")
    private List<String> breedSkus;
    @ApiModelProperty(value = "品种标准市场销售名")
    private String breedSalesName;

    @ApiModelProperty(value = "二级分类ID集合")
    private List<Long> machiningIds;
    @ApiModelProperty(value = "二级分类编码集合")
    private List<String> machiningCodes;
    @ApiModelProperty(value = "二级分类名称")
    private String machiningName;

    @ApiModelProperty(value = "一级分类ID集合")
    private List<Long> classesIds;
    @ApiModelProperty(value = "一级分类编码集合")
    private List<String> classesCodes;
    @ApiModelProperty(value = "一级分类名称")
    private String classesName;

    @ApiModelProperty(value = "净重")
    private String netWeight;

    public List<Long> getProducerProductIds() {
        return producerProductIds;
    }

    public void setProducerProductIds(List<Long> producerProductIds) {
        this.producerProductIds = producerProductIds;
    }

    public String getProducerProductCode() {
        return producerProductCode;
    }

    public void setProducerProductCode(String producerProductCode) {
        this.producerProductCode = producerProductCode;
    }

    public List<String> getProducerProductCodes() {
        return producerProductCodes;
    }

    public void setProducerProductCodes(List<String> producerProductCodes) {
        this.producerProductCodes = producerProductCodes;
    }

    public String getProducerProductSku() {
        return producerProductSku;
    }

    public void setProducerProductSku(String producerProductSku) {
        this.producerProductSku = producerProductSku;
    }

    public String getBrandItemPropertySku() {
        return brandItemPropertySku;
    }

    public void setBrandItemPropertySku(String brandItemPropertySku) {
        this.brandItemPropertySku = brandItemPropertySku;
    }

    public List<String> getAuditStus() {
        return auditStus;
    }

    public void setAuditStus(List<String> auditStus) {
        this.auditStus = auditStus;
    }

    public Boolean getDelFlg() {
        return delFlg;
    }

    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }

    public List<Long> getEntitySellerIds() {
        return entitySellerIds;
    }

    public void setEntitySellerIds(List<Long> entitySellerIds) {
        this.entitySellerIds = entitySellerIds;
    }

    public List<String> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<String> productIds) {
        this.productIds = productIds;
    }

    public List<String> getQualityGradeTypes() {
        return qualityGradeTypes;
    }

    public void setQualityGradeTypes(List<String> qualityGradeTypes) {
        this.qualityGradeTypes = qualityGradeTypes;
    }

    public List<String> getProductAuditStus() {
        return productAuditStus;
    }

    public void setProductAuditStus(List<String> productAuditStus) {
        this.productAuditStus = productAuditStus;
    }

    public List<Long> getItemPropertyIds() {
        return itemPropertyIds;
    }

    public void setItemPropertyIds(List<Long> itemPropertyIds) {
        this.itemPropertyIds = itemPropertyIds;
    }

    public List<String> getItemPropertyCodes() {
        return itemPropertyCodes;
    }

    public void setItemPropertyCodes(List<String> itemPropertyCodes) {
        this.itemPropertyCodes = itemPropertyCodes;
    }

    public List<Long> getBrandItemIds() {
        return brandItemIds;
    }

    public void setBrandItemIds(List<Long> brandItemIds) {
        this.brandItemIds = brandItemIds;
    }

    public List<String> getBrandItemSkus() {
        return brandItemSkus;
    }

    public void setBrandItemSkus(List<String> brandItemSkus) {
        this.brandItemSkus = brandItemSkus;
    }

    public List<Long> getBrandIds() {
        return brandIds;
    }

    public void setBrandIds(List<Long> brandIds) {
        this.brandIds = brandIds;
    }

    public List<String> getBrandCodes() {
        return brandCodes;
    }

    public void setBrandCodes(List<String> brandCodes) {
        this.brandCodes = brandCodes;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<String> getBrandTypes() {
        return brandTypes;
    }

    public void setBrandTypes(List<String> brandTypes) {
        this.brandTypes = brandTypes;
    }

    public List<Long> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Long> itemIds) {
        this.itemIds = itemIds;
    }

    public List<String> getItemCodes() {
        return itemCodes;
    }

    public void setItemCodes(List<String> itemCodes) {
        this.itemCodes = itemCodes;
    }

    public List<String> getItemSkus() {
        return itemSkus;
    }

    public void setItemSkus(List<String> itemSkus) {
        this.itemSkus = itemSkus;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<Long> getBreedIds() {
        return breedIds;
    }

    public void setBreedIds(List<Long> breedIds) {
        this.breedIds = breedIds;
    }

    public List<String> getBreedCodes() {
        return breedCodes;
    }

    public void setBreedCodes(List<String> breedCodes) {
        this.breedCodes = breedCodes;
    }

    public List<String> getBreedSkus() {
        return breedSkus;
    }

    public void setBreedSkus(List<String> breedSkus) {
        this.breedSkus = breedSkus;
    }

    public String getBreedSalesName() {
        return breedSalesName;
    }

    public void setBreedSalesName(String breedSalesName) {
        this.breedSalesName = breedSalesName;
    }

    public List<Long> getMachiningIds() {
        return machiningIds;
    }

    public void setMachiningIds(List<Long> machiningIds) {
        this.machiningIds = machiningIds;
    }

    public List<String> getMachiningCodes() {
        return machiningCodes;
    }

    public void setMachiningCodes(List<String> machiningCodes) {
        this.machiningCodes = machiningCodes;
    }

    public String getMachiningName() {
        return machiningName;
    }

    public void setMachiningName(String machiningName) {
        this.machiningName = machiningName;
    }

    public List<Long> getClassesIds() {
        return classesIds;
    }

    public void setClassesIds(List<Long> classesIds) {
        this.classesIds = classesIds;
    }

    public List<String> getClassesCodes() {
        return classesCodes;
    }

    public void setClassesCodes(List<String> classesCodes) {
        this.classesCodes = classesCodes;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }
}
