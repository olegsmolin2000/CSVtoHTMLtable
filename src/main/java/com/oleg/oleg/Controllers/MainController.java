package com.oleg.oleg.Controllers;

import com.oleg.oleg.Models.Car;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.*;
import java.util.Comparator;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String output(Model model){

        try {
            CSVReader reader=new CSVReader(new FileReader("src/main/resources/Input.csv"));

            CsvToBean<Car> csvToBean=new CsvToBeanBuilder<Car>(reader)
                    .withType(Car.class)
                    .build();

            List<Car> carList= csvToBean.parse();

            for(int i=0;i<carList.size();i++){
                if(carList.get(i).getMileage()>100000)
                    carList.remove(i--);
            }

            carList.sort(Comparator.comparingInt(Car::getYear));

            model.addAttribute("carList",carList);
        } catch (Exception e){
            e.getStackTrace();
        }
        return "output";
    }
}
