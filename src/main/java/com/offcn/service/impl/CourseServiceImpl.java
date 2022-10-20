package com.offcn.service.impl;

import com.offcn.mapper.CourseMapper;
import com.offcn.pojo.Course;
import com.offcn.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CourseServiceImpl implements CourseService {
    @Resource
    private CourseMapper courseMapper;
    @Override
    public Course selectById(int cid) {
        return courseMapper.selectAll(cid);
    }
}
