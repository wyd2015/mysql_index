package com.mallo.index.model.po.generator;

import java.io.Serializable;
import java.util.Date;

/**
 * This class corresponds to the database table sys_department
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysDepartment implements Serializable {
    /**
     *   主键
     *
     * @mbg.generated
     */
    private Integer depId;

    /**
     *   机构名称
     *
     * @mbg.generated
     */
    private String depName;

    /**
     *   当前机构的父级机构id，机构的parentId均为0
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *   当前结构所属层级，机构均为1，部门依次加1
     *
     * @mbg.generated
     */
    private Integer depLevel;

    /**
     *   当前机构的层级字符串编码，具体按机构层级划分定义如：#1#2...
     *
     * @mbg.generated
     */
    private String depCode;

    /**
     *   机构/部门创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *   结构/部门更新时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *   当前机构下的人员总数
     *
     * @mbg.generated
     */
    private Integer userNum;

    /**
     *   添加/更改部门的用户id
     *
     * @mbg.generated
     */
    private Integer operateUserId;

    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @mbg.generated
     */
    public Integer getDepId() {
        return depId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    /**
     *
     * @mbg.generated
     */
    public String getDepName() {
        return depName;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDepName(String depName) {
        this.depName = depName;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getDepLevel() {
        return depLevel;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDepLevel(Integer depLevel) {
        this.depLevel = depLevel;
    }

    /**
     *
     * @mbg.generated
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     *
     * @mbg.generated
     */
    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getUserNum() {
        return userNum;
    }

    /**
     *
     * @mbg.generated
     */
    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getOperateUserId() {
        return operateUserId;
    }

    /**
     *
     * @mbg.generated
     */
    public void setOperateUserId(Integer operateUserId) {
        this.operateUserId = operateUserId;
    }
}