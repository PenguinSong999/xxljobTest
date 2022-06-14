package com.xxl.job.executor.service.jobhandler;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
//        TestEnum.red.ordinal();
  /*      String name = TestEnum.RED.name();
        System.out.println(name);*/
//        int code = TestEnum.RED.getCode();
//        System.out.println(code);


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(("aaaa"+"\r\n"+"bbbbb").getBytes());
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
//        FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\swq\\Desktop\\aaa.txt"));
//        File file = new File("C:\\Users\\swq\\Desktop\\aaa.txt");
//        if (!file.exists()){
//            file.createNewFile();
//        }
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write(outputStream.toByteArray());
//        fileOutputStream.close();
        //本地建一个txt
        String result = "aaaaaaaaaaaaaa"+"\r\n"+"bbbbbbbbbbbbb这是在测试文件";
        String localpath = System.getProperty("user.dir") + File.separator + "SmartOperation";
        String localFile =localpath  +File.separator + "fileTest.txt";
        File dir=new File(localpath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File file=new File(localFile);
//        if (!file.exists()){
//            file.createNewFile();
//        }
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
        bos.write(result.getBytes());
        bos.flush();
        bos.close();
    }



}
