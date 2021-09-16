package io.hs.repository;


import io.hs.entity.Patient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author clm
 * @Date 2021/8/27 17:41
 */
@Mapper
public interface AdminRepository {

    List<Patient> showAll();
}