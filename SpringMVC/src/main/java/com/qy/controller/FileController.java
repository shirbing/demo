package com.qy.controller;


import org.apache.commons.io.FileUtils;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FileController {

   @RequestMapping("/uploadmyfile")
    public String uploadmyfile(MultipartFile myfile){
        System.out.println(myfile);
        System.out.println("文件大小： "+myfile.getSize());
        System.out.println("文件名： "+myfile.getName());//上传过来的文件名
        System.out.println("文件名类型： "+myfile.getContentType());
        String filename=myfile.getOriginalFilename();
        File destFile=new File("C:\\Users\\Administrator\\Desktop\\picture\\"+filename);
        try {
            InputStream in =myfile.getInputStream();
            FileUtils.copyInputStreamToFile(in,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "index";

    }
    @RequestMapping("/uploadmyfile1")
    @ResponseBody
    public String uploadmyfile1(MultipartFile myfile, HttpServletRequest request){
        System.out.println(myfile);
        System.out.println("文件大小： "+myfile.getSize());
        System.out.println("文件名： "+myfile.getName());//上传过来的文件名
        System.out.println("文件名类型： "+myfile.getContentType());

        String filename=myfile.getOriginalFilename();
        String path2=request.getServletContext().getRealPath("images");
        System.out.println(path2);

        String path1="images\\"+filename;
        //System.out.println(path);
        File destFile=new File(path2+File.separatorChar+filename);
        try {
            InputStream in =myfile.getInputStream();
            FileUtils.copyInputStreamToFile(in,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return path1;

    }
}
