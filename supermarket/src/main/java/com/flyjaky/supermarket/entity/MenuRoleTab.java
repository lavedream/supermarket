package com.flyjaky.supermarket.entity;

import java.util.Date;

public class MenuRoleTab {
    private Long mrid;

    private Long rid;

    private Date createdAt;

    private Date updatedAt;

    private Long mid;

    public Long getMrid() {
        return mrid;
    }

    public void setMrid(Long mrid) {
        this.mrid = mrid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }
}