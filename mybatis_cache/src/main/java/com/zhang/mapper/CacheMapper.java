package com.zhang.mapper;

import com.zhang.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface CacheMapper {
    Emp getEmpById(@Param("empId") Integer empId);
}
