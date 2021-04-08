package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 20:23
 */
public class Handler3 implements Handler{
    public Boolean handle(MyContext context) {
        System.out.println("handler3......handle");
        return true;
    }
}
