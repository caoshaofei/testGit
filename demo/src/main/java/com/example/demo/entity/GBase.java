/**
 * 
 */
package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Version;

import org.hibernate.annotations.ColumnDefault;

/**
 * @author user
 *
 */
public abstract class GBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * 版本用户数据软锁 执行save的时候，version必须指定为null,否则会发生异常
     */
    @Version
    protected Integer version = -1;

    /** 数据的更新者 */
    @Column(name = "updater")
    @ColumnDefault("-1")
    protected String updater;

    /** 数据更新时间 update time */
    @Column(name = "update_time")
    protected Timestamp updateTime;

    /** 数据的创建者, 不使用关联关系，防止拖累访问速度 */
    @Column(name = "creator")
    @ColumnDefault("-1")
    protected String creator;

    /** 数据插入时间 */
    @Column(name = "insert_time")
    protected Timestamp insertTime;

    /** 数据是否被禁用 */
    @Column(name = "disable_flg")
    @ColumnDefault("false")
    protected Boolean disabled;

    /** 数据的删除状态 */
    @Column(name = "del_flg")
    @ColumnDefault("false")
    protected Boolean deleted;

    /** 数据的领域权限 */
    @Column(name = "domain")
    @ColumnDefault("-1")
    protected Long domain;

    /**
     * 获取版本用户数据软锁 执行save的时候，version必须指定为null,否则会发生异常
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设定版本用户数据软锁 执行save的时候，version必须指定为null,否则会发生异常
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取数据的更新者
     * @return the updator
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * 设定数据的更新者
     * @param updator the updator to set
     */
    public void setUpdater(String updater) {
        this.updater = updater;
    }

    /**
     * 获取数据更新时间 update time
     * @return the updateTime
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * 设定数据更新时间 update time
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取数据的创建者, 不使用关联关系，防止拖累访问速度
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设定数据的创建者, 不使用关联关系，防止拖累访问速度
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取数据插入时间
     * @return the insertTime
     */
    public Timestamp getInsertTime() {
        return insertTime;
    }

    /**
     * 设定数据插入时间
     * @param insertTime the insertTime to set
     */
    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 获取数据是否被禁用
     * @return the disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * 设定数据是否被禁用
     * @param disabled the disabled to set
     */
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * 获取数据的删除状态
     * @return the deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设定数据的删除状态
     * @param deleted the deleted to set
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取数据的领域权限
     * @return the domain
     */
    public Long getDomain() {
        return domain;
    }

    /**
     * 设定数据的领域权限
     * @param domain the domain to set
     */
    public void setDomain(Long domain) {
        this.domain = domain;
    }


}
