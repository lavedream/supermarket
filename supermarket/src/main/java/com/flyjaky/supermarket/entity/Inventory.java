package com.flyjaky.supermarket.entity;

import java.util.Date;

public class Inventory {
    private Long inid;

    private Long pid;

    private String remark;

    private Date created_at;

    private Date updated_at;

    private Long numbers;

    public Long getInid() {
        return inid;
    }

    public void setInid(Long inid) {
        this.inid = inid;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public Long getNumbers() {
        return numbers;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }
}