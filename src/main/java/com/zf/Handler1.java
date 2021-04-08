package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 20:19
 */
public class Handler1 implements Handler {

    public Boolean handle(MyContext context) {
        System.out.println("handler1......handle");
        return true;
    }
}
