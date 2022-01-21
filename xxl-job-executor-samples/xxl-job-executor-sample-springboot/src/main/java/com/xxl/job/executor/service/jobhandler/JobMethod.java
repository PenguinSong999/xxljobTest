package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Service;

@Service
public class JobMethod {

    @XxlJob(value = "testJob")
    public void testJob(){
        XxlJobHelper.log("方法任务执行了");
        System.out.println("aaaaaaaa");
    }
}
