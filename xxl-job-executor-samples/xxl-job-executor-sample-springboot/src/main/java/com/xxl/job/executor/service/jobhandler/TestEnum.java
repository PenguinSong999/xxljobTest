package com.xxl.job.executor.service.jobhandler;

public enum TestEnum {
    RED("红",1),GREEN("绿",2);


    private String name;
    private int code;

    TestEnum(String name,int code){
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    //     red,
//     green,

}

