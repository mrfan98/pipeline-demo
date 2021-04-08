package com.zf;

/**
 * @author zhang fan
 * @date 2021/4/8 19:54
 */
public class OrderPipeline implements Pipeline{
    private HandlerNode head = new HandlerNode();
    private HandlerNode tail=head;
    private MyContext context;



    public void start() {

        head.getNext().exec(context);
    }

    public MyContext getContext() {
        return context;
    }

    public OrderPipeline(MyContext context) {
        this.context = context;
    }

    /**
     * 添加Handler到头部
     * @param handlers
     */
    public void addHead(Handler... handlers) {

        HandlerNode next = head.getNext();
        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);
            handlerNode.setNext(next);
            next=handlerNode;
        }
        head.setNext(next);


    }

    /**添加handler到尾部
     * @param handlers
     */
    public void addTail(Handler... handlers) {
        HandlerNode node = tail;
        for (Handler handler : handlers) {
            HandlerNode handlerNode = new HandlerNode();
            handlerNode.setHandler(handler);
            node.setNext(handlerNode);
            node = handlerNode;
        }

        tail = node;


    }
}
