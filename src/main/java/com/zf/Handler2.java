package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 20:21
 */
public class Handler2 implements Handler{

    public Boolean handle(MyContext context) {
        System.out.println("handler2......handle");
        return true;
    }
}
