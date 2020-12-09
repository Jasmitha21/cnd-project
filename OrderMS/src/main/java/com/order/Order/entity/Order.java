package com.order.Order.entity;

	import java.util.Date;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="orderdetails")
	public class Order {
	@Id
	@Column(name = "orderid")
	private Integer orderId;
	    @Column(name = "buyerid")
	    private Integer buyerId;
	    @Column(name = "amount")
	    private Double amount;
	    @Column(name = "date")
	    private Date date;
	    @Column(name = "address")
	    private String address;
	    @Column(name = "status")
	    private String status;
	public Integer getOrderId() {
	return orderId;
	}
	public void setOrderId(Integer orderId) {
	this.orderId = orderId;
	}
	public Integer getBuyerId() {
	return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
	this.buyerId = buyerId;
	}
	public Double getAmount() {
	return amount;
	}
	public void setAmount(Double amount) {
	this.amount = amount;
	}
	public Date getDate() {
	return date;
	}
	public void setDate(Date date) {
	this.date = date;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public String getStatus() {
	return status;
	}
	public void setStatus(String status) {
	this.status = status;
	}
	   
	   
}



