package com.edu.dlnu.servicesImp;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.been.CarExample;
import com.edu.dlnu.mapper.CarMapper;
import com.edu.dlnu.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarImplement implements CarServices {
    @Autowired
    private CarMapper carMapper;

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
                for (Car c : carMapper.selectByExample(carExample))
                    add(c);
            }
        };
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

    public int add(Car car) {
        return carMapper.insert(car);
    }
}
