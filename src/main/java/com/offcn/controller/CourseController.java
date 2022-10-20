package com.offcn.controller;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.offcn.pojo.Course;
import com.offcn.service.CourseService;
import javafx.scene.chart.PieChart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.applet.Main;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class CourseController {
@Autowired
private CourseService courseService;

    @RequestMapping("zk/{cid}")
    public Course select(@PathVariable("cid") int cid){
       return courseService.selectById(cid);
    }

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat ft =new SimpleDateFormat("yyyy-dd-mm hh:MM:ss");
        System.out.println("ft.format(date) = " + ft.format(date));

    }
}
