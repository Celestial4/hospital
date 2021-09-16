package io.hs.service.user;

import io.hs.entity.Patient;

import java.util.List;

/**
 * @author clm
 * @Date 2021/8/30 9:05
 */
public interface UserService {
    List<Patient> showAll();
}