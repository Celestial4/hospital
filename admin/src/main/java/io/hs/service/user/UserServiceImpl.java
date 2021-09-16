package io.hs.service.user;

import io.hs.entity.Patient;
import io.hs.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author clm
 * @Date 2021/8/30 9:05
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    AdminRepository adminRepository;
    @Override
    public List<Patient> showAll() {
        return adminRepository.showAll();
    }
}