package com.offcn.mapper;

import com.offcn.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CourseMapper {
  Course selectAll(int cid);
}
