package com.zhang.mapper;

import com.zhang.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    Dept getDeptAndEmpByStepOne(@Param("deptId") Integer deptId);
}
