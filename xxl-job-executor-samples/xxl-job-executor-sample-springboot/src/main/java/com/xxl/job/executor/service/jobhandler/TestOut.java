package com.xxl.job.executor.service.jobhandler;

public class TestOut implements Test{

    public void test(){};

    class TestInner{
        public void testInner(){
            TestOut.this.test();
        }
    }
}


class Test5{

}