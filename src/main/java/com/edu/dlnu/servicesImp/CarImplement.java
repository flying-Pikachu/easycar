package com.edu.dlnu.servicesImp;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.been.CarExample;
import com.edu.dlnu.mapper.CarMapper;
import com.edu.dlnu.mapper.OrderMapper;
import com.edu.dlnu.services.CarServices;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarImplement implements CarServices {
    @Autowired
    private CarMapper carMapper;

    @Autowired
    private OrderMapper orderMapper;

    /**
     * create by: xzp
     * description:按照车辆品牌得到车辆的信息
     * create time: 下午10:46 2018/6/28
     *
     * @param carBrand 车辆的品牌
     * @return java.util.List<com.edu.dlnu.been.Car>
     */
    public List<Car> getCarsByBrand(final String carBrand) {
        return new ArrayList<Car>(){
            {
                CarExample carExample = null;
                if (!carBrand.equals("")) {
                    carExample = new CarExample();
                    carExample.or().andCarbrandEqualTo(carBrand);
                }
                for (Car c : carMapper.selectByExample(carExample)) {
                    add(c);
                }
            }
        };
    }

    /**
     * create by: xzp
     * description: 得到全部的没有被租用的车辆
     * create time: 上午9:06 2018/6/30
     *
     * @return java.util.List<com.edu.dlnu.been.Car>
     */
    public PageInfo getCarsWithoutHire(int pn) {
        return getCarsWithoutHireByCarBrand(pn, "");
    }

    /**
     * create by: xzp
     * description: 得到某一种类型的未被租用的车辆
     * create time: 上午9:10 2018/6/30
     *
     * @param carBrand
     * @return com.github.pagehelper.PageInfo
     */
    public PageInfo getCarsWithoutHireByCarBrand(int pn, String carBrand) {
        PageHelper.startPage(pn, 3);
        List<Car> itemList = carMapper.selectCarsWithoutHireByCarBrand(carBrand);
        PageInfo<Car> pageInfo = new PageInfo<Car>(itemList);
        return pageInfo;
    }

    /**
     * create by: xzp
     * description: 通过车品牌，最低价，最高价查询
     * create time: 上午9:10 2018/7/1
     *
     * @param pn
     * @param carBrand
     * @param lowPrice
     * @param highPrice
     * @return com.github.pagehelper.PageInfo
     */
    public PageInfo getCarsWithoutHireByBrandAndPrice(int pn, String carBrand, double lowPrice, double highPrice) {

        System.out.println("lowPrice = " + lowPrice);
        System.out.println("highPrice = " + highPrice);
        PageHelper.startPage(pn, 3);
        List<Car> list = carMapper.selectCarsWithoutHireByBrandAndPrice(carBrand, 0, 1000);
        PageInfo<Car> pageInfo = new PageInfo<Car>(list);
        return pageInfo;
    }

    /**
     * create by: xzp
     * description: 查询全部的车辆牌子
     * create time: 下午6:02 2018/6/29
     *
     * @return java.util.List<java.lang.String>
     */
    public List<String> getCarsBrands() {
        return carMapper.selectCarsBrands();
    }

    /**
     * create by: xzp
     * description:通过carID获得车辆的信息
     * create time: 上午10:12 2018/6/29
     *
     * @param carID 车辆的ID
     * @return com.edu.dlnu.been.Car
     */
    public Car getCarByCarID(String carID) {
        return carMapper.selectByPrimaryKey(carID);
    }

    /**
     * create by: xzp
     * description:通过车辆ID删除车辆
     * create time: 下午10:59 2018/6/28
     *
     * @param carID 需要删除的车辆ID
     * @return int
     */
    public int delete(String carID) {
        System.out.println(carID);
        return carMapper.deleteByPrimaryKey(carID);
    }

    /**
     * create by: xzp
     * description:通过ID更新车辆信息
     * create time: 上午10:10 2018/6/29
     *
     * @param car 需要更新的车辆
     * @return int
     */
    public int update(Car car) {
        return carMapper.updateByPrimaryKey(car);
    }

    /**
     * create by: xzp
     * description:
     * create time: 下午5:07 2018/6/29
     *
     * @param car
     * @return int
     * @throws
     */
    public int add(Car car) {
        return carMapper.insert(car);
    }
}
