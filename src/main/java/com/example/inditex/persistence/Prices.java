package com.example.inditex.persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES") 
public class Prices {
	
	@Id
	@Column(name = "BRAND_ID")
	private Integer brandId;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BRAND_ID", referencedColumnName = "BRAND_ID")
    private Brand brand;
	
	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "END_DATE")
	private String endDate;

	@Column(name = "PRICE_LIST")
	private String priceList;

	@Column(name = "PRODUCT_ID")
	private String productId;
	
	@Column(name = "PRIORITY")
	private String priority;

	@Column(name = "PRICE")
	private String price;

	@Column(name = "CURR")
	private String curr;

	@Override
	public String toString() {
		return "Prices [brandId=" + brandId + ", brand=" + brand + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", priceList=" + priceList + ", productId=" + productId + ", priority=" + priority + ", price="
				+ price + ", curr=" + curr + "]";
	}
	
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPriceList() {
		return priceList;
	}

	public void setPriceList(String priceList) {
		this.priceList = priceList;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
