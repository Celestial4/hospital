package io.hs.controller;

import io.hs.service.user.UserService;
import io.hs.surpport.FileProcessUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @author clm
 * @Date 2021/8/30 7:34
 */
@Controller
@RequestMapping(path ="/",produces = {"application/json"})
public class AdminController {
    @Autowired
    UserService userService;

    @Autowired
    FileProcessUtil util;

    @PostMapping("upload")
    @ResponseBody
    public void upload(MultipartFile file, HttpServletRequest req) throws IOException {
        File f = util.getRealFile(file.getOriginalFilename());
        file.transferTo(f);
    }

    @RequestMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        byte[] bytes = FileUtils.readFileToByteArray(new File("D:\\image", "5298a31c-104a-4c4d-805c-8bc191d6f4bc.jpg"));
        response.getOutputStream().write(bytes);
    }




}