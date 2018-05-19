package com.apm.entity;

import java.util.Date;

public class ProductCategory {
	//商品类别ID
	private Long productCategoryId;
	//店铺ID
	private Long shopId;
	//商品类别名称
	private String productCategoryname;
	//产品权重
	private Integer priority;
	//创建时间
	private Date createTime;
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Long getShopId() {
		return shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	public String getProductCategoryname() {
		return productCategoryname;
	}
	public void setProductCategoryname(String productCategoryname) {
		this.productCategoryname = productCategoryname;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
