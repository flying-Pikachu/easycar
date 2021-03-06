package com.edu.dlnu.been;

import java.util.Date;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orderNum
     *
     * @mbg.generated
     */
    private String ordernum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.userName
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.carID
     *
     * @mbg.generated
     */
    private String carid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.pickupTime
     *
     * @mbg.generated
     */
    private Date pickuptime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.returnTime
     *
     * @mbg.generated
     */
    private Date returntime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orderStatus
     *
     * @mbg.generated
     */
    private Integer orderstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.orderCost
     *
     * @mbg.generated
     */
    private Double ordercost;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orderNum
     *
     * @return the value of orders.orderNum
     *
     * @mbg.generated
     */
    public String getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orderNum
     *
     * @param ordernum the value for orders.orderNum
     *
     * @mbg.generated
     */
    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.userName
     *
     * @return the value of orders.userName
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.userName
     *
     * @param username the value for orders.userName
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.carID
     *
     * @return the value of orders.carID
     *
     * @mbg.generated
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.carID
     *
     * @param carid the value for orders.carID
     *
     * @mbg.generated
     */
    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.pickupTime
     *
     * @return the value of orders.pickupTime
     *
     * @mbg.generated
     */
    public Date getPickuptime() {
        return pickuptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.pickupTime
     *
     * @param pickuptime the value for orders.pickupTime
     *
     * @mbg.generated
     */
    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.returnTime
     *
     * @return the value of orders.returnTime
     *
     * @mbg.generated
     */
    public Date getReturntime() {
        return returntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.returnTime
     *
     * @param returntime the value for orders.returnTime
     *
     * @mbg.generated
     */
    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orderStatus
     *
     * @return the value of orders.orderStatus
     *
     * @mbg.generated
     */
    public Integer getOrderstatus() {
        return orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orderStatus
     *
     * @param orderstatus the value for orders.orderStatus
     *
     * @mbg.generated
     */
    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.orderCost
     *
     * @return the value of orders.orderCost
     *
     * @mbg.generated
     */
    public Double getOrdercost() {
        return ordercost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.orderCost
     *
     * @param ordercost the value for orders.orderCost
     *
     * @mbg.generated
     */
    public void setOrdercost(Double ordercost) {
        this.ordercost = ordercost;
    }
}