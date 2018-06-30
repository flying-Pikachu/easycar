package com.edu.dlnu.controller;

import com.edu.dlnu.been.Car;
import com.edu.dlnu.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("cars")
public class CarController {

    @Autowired
    private CarServices carServices;

    /**
     * create by: xzp
     * description:得到全部的车辆信息
     * create time: 下午3:38 2018/6/29
     *
     * @param model
     * @return java.lang.String
     */
    @RequestMapping("allCars")
    public String getAllCars(Model model) {
        model.addAttribute("cars", carServices.getCarsByBrand(""));
        for (Car c : carServices.getCarsByBrand(""))
            System.out.println(c);
        return "ManagerUpdate";
    }

    /**
     * create by: xzp
     * description: 通过车辆牌子进行查询
     * create time: 下午3:37 2018/6/29
     *
     * @param model
     * @param carBrand
     * @return java.lang.String
     */
    @RequestMapping("allCarsByBrand")
    public String getCarsByBrand(Model model, String carBrand) {
        model.addAttribute("cars", carServices.getCarsByBrand(carBrand));
        System.out.println("------------------------------");
        for (Car c : carServices.getCarsByBrand(""))
            System.out.println(c);
        return "ManagerUpdate";
    }

    /**
     * create by: xzp
     * description:通过车辆的ID得到这辆车的全部信息
     * create time: 下午7:38 2018/6/29
     *
     * @param model
     * @param carID
     * @return java.lang.String
     */
    @RequestMapping({"carByCarID", "/"})
    public String getCarByCarID(Model model, @RequestParam String carID, String userName) {
        System.out.println(carID);
        model.addAttribute("car", carServices.getCarByCarID(carID));
        model.addAttribute("userName", userName);
        return "UserExchange";
    }

    /**
     * create by: xzp
     * description: 按照车辆号进行删除
     * create time: 下午3:37 2018/6/29
     *
     * @param model
     * @param carID
     * @return java.lang.String
     */
    @RequestMapping({"delete", "/"})
    public String delete(Model model, @RequestParam String carID) {
        System.out.println("执行删除过程");
        int isDelete = carServices.delete(carID);
        if (isDelete > 0)
            model.addAttribute("isSucc", "true");
        else
            model.addAttribute("isSucc", "false");
        return getAllCars(model);
    }

    /**
     * create by: xzp
     * description: 按照用户添加的信息进行添加
     * create time: 下午3:35 2018/6/29
     *
     * @param model
     * @param carBrand
     * @param carModel
     * @param carStruct
     * @param carDisplacement
     * @param isManual
     * @param maxMum
     * @param originalPrice
     * @param discount
     * @return java.lang.String
     */
    @RequestMapping("add")
    public String add(Model model, final String carBrand, final String carModel, final String carStruct, final double carDisplacement, final String isManual, final int maxMum, final double originalPrice, final double discount) {
        System.out.println("执行添加操作");
        int i = 1;
        while (carServices.getCarByCarID("" + i) != null) {
            i++;
        }
        final String carID = "" + i;
        Car car = new Car(){
            {
                setCarbrand(carBrand);
                setCardisplacement(carDisplacement);
                setCarid(carID);
                setCarmodel(carModel);
                setCarstruct(carStruct);
                if (isManual.equals("0"))
                    setIsmanual(Byte.parseByte("0"));
                else
                    setIsmanual(Byte.parseByte("1"));
                setMaxmum(maxMum);
                setOriginalprice(originalPrice);
                setDiscount(discount);
            }
        };
        int isInsert = carServices.add(car);
        if (isInsert > 0)
            model.addAttribute("isSucc", "true");
        else
            model.addAttribute("isSucc", "false");
        return getAllCars(model);
    }

    /**
     * create by: xzp
     * description: 需要修改的车辆的ID，用来查询出全部的车辆的信息
     * create time: 下午3:38 2018/6/29
     *
     * @param model
     * @param carID
     * @return java.lang.String
     * @throws
     */
    @RequestMapping({"updateGetCar", "/"})
    public String updateGetCar(Model model, @RequestParam String carID) {
        System.out.println("执行更新查找过程");
        System.out.println(carID);
        Car car = carServices.getCarByCarID(carID);
        model.addAttribute("car", car);
        return "ManagerModify";
    }

    /**
     * create by: xzp
     * description: 按照用户填写的信息对数据库进行修改
     * create time: 下午3:34 2018/6/29
     *
     * @param model
     * @param carID
     * @param carBrand
     * @param carModel
     * @param carStruct
     * @param carDisplacement
     * @param isManual
     * @param maxMum
     * @param originalPrice
     * @param discount
     * @return java.lang.String
     */
    @RequestMapping({"update", "/"})
    public String update(Model model, @RequestParam final String carID, final String carBrand, final String carModel, final String carStruct, final double carDisplacement, final String isManual, final int maxMum, final double originalPrice, final double discount) {

        System.out.println("执行更新过程");
        System.out.println(carID);
        Car car = new Car(){
            {
                setCarbrand(carBrand);
                setCardisplacement(carDisplacement);
                setCarid(carID);
                setCarmodel(carModel);
                setCarstruct(carStruct);
                if (isManual.equals("0"))
                    setIsmanual(Byte.parseByte("0"));
                else
                    setIsmanual(Byte.parseByte("1"));
                setMaxmum(maxMum);
                setOriginalprice(originalPrice);
                setDiscount(discount);
            }
        };
        System.out.println("hahah" + car);
        int isUpdate = carServices.update(car);
        if (isUpdate > 0)
            model.addAttribute("isSucc", "true");
        else
            model.addAttribute("isSucc", "false");
        return getAllCars(model);

    }
}
