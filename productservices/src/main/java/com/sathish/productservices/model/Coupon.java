package com.sathish.productservices.model;
import java.math.BigDecimal;
public class Coupon {
	

	private int id;
	private String description;
	
	private String code;
	private BigDecimal price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String coupon_code) {
		this.code = coupon_code;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
