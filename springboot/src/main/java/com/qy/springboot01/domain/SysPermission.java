package com.qy.springboot01.domain;

import java.math.BigDecimal;

public class SysPermission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.ID
     *
     * @mbggenerated
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.TYPE
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.URL
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.PERCODE
     *
     * @mbggenerated
     */
    private String percode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.PARENTID
     *
     * @mbggenerated
     */
    private BigDecimal parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.PARENTIDS
     *
     * @mbggenerated
     */
    private String parentids;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.SORTSTRING
     *
     * @mbggenerated
     */
    private String sortstring;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_PERMISSION.AVAILABLE
     *
     * @mbggenerated
     */
    private String available;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.ID
     *
     * @return the value of SYS_PERMISSION.ID
     *
     * @mbggenerated
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.ID
     *
     * @param id the value for SYS_PERMISSION.ID
     *
     * @mbggenerated
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.NAME
     *
     * @return the value of SYS_PERMISSION.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.NAME
     *
     * @param name the value for SYS_PERMISSION.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.TYPE
     *
     * @return the value of SYS_PERMISSION.TYPE
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.TYPE
     *
     * @param type the value for SYS_PERMISSION.TYPE
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.URL
     *
     * @return the value of SYS_PERMISSION.URL
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.URL
     *
     * @param url the value for SYS_PERMISSION.URL
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.PERCODE
     *
     * @return the value of SYS_PERMISSION.PERCODE
     *
     * @mbggenerated
     */
    public String getPercode() {
        return percode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.PERCODE
     *
     * @param percode the value for SYS_PERMISSION.PERCODE
     *
     * @mbggenerated
     */
    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.PARENTID
     *
     * @return the value of SYS_PERMISSION.PARENTID
     *
     * @mbggenerated
     */
    public BigDecimal getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.PARENTID
     *
     * @param parentid the value for SYS_PERMISSION.PARENTID
     *
     * @mbggenerated
     */
    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.PARENTIDS
     *
     * @return the value of SYS_PERMISSION.PARENTIDS
     *
     * @mbggenerated
     */
    public String getParentids() {
        return parentids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.PARENTIDS
     *
     * @param parentids the value for SYS_PERMISSION.PARENTIDS
     *
     * @mbggenerated
     */
    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.SORTSTRING
     *
     * @return the value of SYS_PERMISSION.SORTSTRING
     *
     * @mbggenerated
     */
    public String getSortstring() {
        return sortstring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.SORTSTRING
     *
     * @param sortstring the value for SYS_PERMISSION.SORTSTRING
     *
     * @mbggenerated
     */
    public void setSortstring(String sortstring) {
        this.sortstring = sortstring == null ? null : sortstring.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_PERMISSION.AVAILABLE
     *
     * @return the value of SYS_PERMISSION.AVAILABLE
     *
     * @mbggenerated
     */
    public String getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_PERMISSION.AVAILABLE
     *
     * @param available the value for SYS_PERMISSION.AVAILABLE
     *
     * @mbggenerated
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}