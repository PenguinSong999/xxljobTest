package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.executor.XxlJobExecutor;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.springframework.stereotype.Service;

@JobHandler(value = "BeanDemoJobHandler")
@Service
public class BeanDemoJobHandler extends IJobHandler{
    @Override
    public void execute() throws Exception {
        System.out.println("Bean模式执行");
        XxlJobExecutor.registJobHandler("BeanDemoJobHandler", new BeanDemoJobHandler());
    }
}
