package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 19:48
 */
public interface Pipeline {
    /**
     * 启动管道
     */
    void start();

    /**
     * 得到context
     */
    MyContext getContext();

    /**
     * 添加handler到队首
     */
    void addHead(Handler ...handlers);

    /**
     * 添加handler到队尾
     */
    void addTail(Handler ...handlers);
}
