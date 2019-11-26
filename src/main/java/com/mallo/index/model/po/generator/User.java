package com.mallo.index.model.po.generator;

import java.io.Serializable;

/**
 * This class corresponds to the database table user
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class User implements Serializable {
    /**
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @mbg.generated
     */
    public Integer getAge() {
        return age;
    }

    /**
     *
     * @mbg.generated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}