package com.flyjaky.supermarket.entity;

import java.util.Date;

public class RoleUserTab {
    private Long ruid;

    private Long rid;

    private Long uid;

    private Date createdAt;

    private Date updatedAt;

    public Long getRuid() {
        return ruid;
    }

    public void setRuid(Long ruid) {
        this.ruid = ruid;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
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
}