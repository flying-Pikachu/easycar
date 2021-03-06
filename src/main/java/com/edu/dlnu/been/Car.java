package com.edu.dlnu.been;

public class Car {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.carID
     *
     * @mbg.generated
     */
    private String carid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.carBrand
     *
     * @mbg.generated
     */
    private String carbrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.carModel
     *
     * @mbg.generated
     */
    private String carmodel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.carStruct
     *
     * @mbg.generated
     */
    private String carstruct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.carDisplacement
     *
     * @mbg.generated
     */
    private Double cardisplacement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.isManual
     *
     * @mbg.generated
     */
    private Byte ismanual;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.maxMum
     *
     * @mbg.generated
     */
    private Integer maxmum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.originalPrice
     *
     * @mbg.generated
     */
    private Double originalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.discount
     *
     * @mbg.generated
     */
    private Double discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cars.img
     *
     * @mbg.generated
     */
    private String img;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carID
     *
     * @return the value of cars.carID
     *
     * @mbg.generated
     */
    public String getCarid() {
        return carid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carID
     *
     * @param carid the value for cars.carID
     *
     * @mbg.generated
     */
    public void setCarid(String carid) {
        this.carid = carid == null ? null : carid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carBrand
     *
     * @return the value of cars.carBrand
     *
     * @mbg.generated
     */
    public String getCarbrand() {
        return carbrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carBrand
     *
     * @param carbrand the value for cars.carBrand
     *
     * @mbg.generated
     */
    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carModel
     *
     * @return the value of cars.carModel
     *
     * @mbg.generated
     */
    public String getCarmodel() {
        return carmodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carModel
     *
     * @param carmodel the value for cars.carModel
     *
     * @mbg.generated
     */
    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel == null ? null : carmodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carStruct
     *
     * @return the value of cars.carStruct
     *
     * @mbg.generated
     */
    public String getCarstruct() {
        return carstruct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carStruct
     *
     * @param carstruct the value for cars.carStruct
     *
     * @mbg.generated
     */
    public void setCarstruct(String carstruct) {
        this.carstruct = carstruct == null ? null : carstruct.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.carDisplacement
     *
     * @return the value of cars.carDisplacement
     *
     * @mbg.generated
     */
    public Double getCardisplacement() {
        return cardisplacement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.carDisplacement
     *
     * @param cardisplacement the value for cars.carDisplacement
     *
     * @mbg.generated
     */
    public void setCardisplacement(Double cardisplacement) {
        this.cardisplacement = cardisplacement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.isManual
     *
     * @return the value of cars.isManual
     *
     * @mbg.generated
     */
    public Byte getIsmanual() {
        return ismanual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.isManual
     *
     * @param ismanual the value for cars.isManual
     *
     * @mbg.generated
     */
    public void setIsmanual(Byte ismanual) {
        this.ismanual = ismanual;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.maxMum
     *
     * @return the value of cars.maxMum
     *
     * @mbg.generated
     */
    public Integer getMaxmum() {
        return maxmum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.maxMum
     *
     * @param maxmum the value for cars.maxMum
     *
     * @mbg.generated
     */
    public void setMaxmum(Integer maxmum) {
        this.maxmum = maxmum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.originalPrice
     *
     * @return the value of cars.originalPrice
     *
     * @mbg.generated
     */
    public Double getOriginalprice() {
        return originalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.originalPrice
     *
     * @param originalprice the value for cars.originalPrice
     *
     * @mbg.generated
     */
    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.discount
     *
     * @return the value of cars.discount
     *
     * @mbg.generated
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.discount
     *
     * @param discount the value for cars.discount
     *
     * @mbg.generated
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cars.img
     *
     * @return the value of cars.img
     *
     * @mbg.generated
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cars.img
     *
     * @param img the value for cars.img
     *
     * @mbg.generated
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carid='" + carid + '\'' +
                ", carbrand='" + carbrand + '\'' +
                ", carmodel='" + carmodel + '\'' +
                ", carstruct='" + carstruct + '\'' +
                ", cardisplacement=" + cardisplacement +
                ", ismanual=" + ismanual +
                ", maxmum=" + maxmum +
                ", originalprice=" + originalprice +
                ", discount=" + discount +
                ", img='" + img + '\'' +
                '}';
    }
}