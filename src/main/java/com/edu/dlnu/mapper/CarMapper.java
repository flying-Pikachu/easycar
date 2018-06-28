package com.edu.dlnu.mapper;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.been.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    long countByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int deleteByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String carid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int insert(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int insertSelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    List<Car> selectByExample(CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    Car selectByPrimaryKey(String carid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cars
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Car record);
}