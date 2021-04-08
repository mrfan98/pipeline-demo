package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 20:18
 */
public class PipelineMain {
    public static void main(String[] args) {
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        OrderPipeline orderPipeline = new OrderPipeline(new MyContext("zhangfan"));
       // orderPipeline.addTail(handler1,handler2,handler3);
        orderPipeline.addHead(handler1,handler2,handler3);

        orderPipeline.start();
    }
}
