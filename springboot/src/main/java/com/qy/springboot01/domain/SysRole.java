package com.qy.springboot01.domain;

public class SysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLE.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLE.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLE.AVAILABLE
     *
     * @mbggenerated
     */
    private String available;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.ID
     *
     * @return the value of SYS_ROLE.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.ID
     *
     * @param id the value for SYS_ROLE.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.NAME
     *
     * @return the value of SYS_ROLE.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.NAME
     *
     * @param name the value for SYS_ROLE.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLE.AVAILABLE
     *
     * @return the value of SYS_ROLE.AVAILABLE
     *
     * @mbggenerated
     */
    public String getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLE.AVAILABLE
     *
     * @param available the value for SYS_ROLE.AVAILABLE
     *
     * @mbggenerated
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}