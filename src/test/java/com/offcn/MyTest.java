package com.offcn;

import com.offcn.mapper.CourseMapper;
import com.offcn.pojo.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@SpringBootTest
public class MyTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    public  void select(){
        Course course = courseMapper.selectAll(3);
        System.out.println("courses = " + course);
    }

}
