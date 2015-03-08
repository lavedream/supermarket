package com.flyjaky.supermarket.entity;

import java.util.Date;

public class Product {
    private Long pid;

    private String product_name;

    private Double purchase_price;

    private Double sales_price;

    private Byte is_show_purchase_price;

    private String project_code;

    private Date created_at;

    private Date updated_at;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name == null ? null : product_name.trim();
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Double getSales_price() {
        return sales_price;
    }

    public void setSales_price(Double sales_price) {
        this.sales_price = sales_price;
    }

    public Byte getIs_show_purchase_price() {
        return is_show_purchase_price;
    }

    public void setIs_show_purchase_price(Byte is_show_purchase_price) {
        this.is_show_purchase_price = is_show_purchase_price;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code == null ? null : project_code.trim();
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}