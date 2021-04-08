package com.zf;

import lombok.Data;

/**
 * @author zhang fan
 * @date 2021/4/8 19:55
 */
@Data
public class HandlerNode {
    private Handler handler;
    private HandlerNode next;
    public void exec(MyContext context){
        Boolean res = handler.handle(context);
        if(res){
            if(next!=null){
                next.exec(context);
            }
        }
    }
}
