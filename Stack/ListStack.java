/**
 * 基于链表实现栈：链栈
 * 功能:入栈、出栈、输出栈
 * @author : 代澳旗
 */
@SuppressWarnings("all")
public class ListStack {
    //定义栈顶指针
    private Node top = null;
    //定义栈结点
    private static class Node {
        private int data;//栈结点数据域
        private Node next;//栈结点指针域
        public Node(int data, Node next) {//构造函数
            this.data = data;
            this.next = next;
        }
        //获取数据域
        public int getData() {
            return data;
        }
    }

    /**
     * 功能:入栈
     * @param value:要入栈的数据值
     */
    public void push(int value) {
        //创建一个栈结点 
        Node newNode = new Node(value, null);
        // 利用栈顶指针top来判断栈是否为空
        if (top == null) {
            //如果栈为空，就将入栈的值作为栈的第一个元素
            top = newNode;
        } else {
            //否则插入到top栈结点前（头插法）
            newNode.next = top;
            top = newNode;
        }
    }

    /**
     * 功能 : 出栈
     * @return: -1 为栈中没有数据
     */
    public int pop() {
        // 如果栈的最顶层栈结点为null,栈为空
        if (top == null){
            return -1;
        }

        //否则执行出栈操作，现将栈顶结点的数据元素赋值给 Value
        int value = top.data;
        //将 top 指针向下移动
        top = top.next;
        //返回出栈的值
        return value;
    }

    /**
     * 功能:输出栈中所有元素
     */
    public void printAll() {
        //将栈顶指针赋值给p
        Node p = top;
        //循环遍历栈(遍历单链表)
        while (p != null) {
            System.out.print(p.data + " ");
            //指向下一个结点
            p = p.next;
        }
        System.out.println();
    }

    //测试
    public static void main(String[] args) {
        //创建实例
        ListStack ls = new ListStack();
        //调用入栈方法，存入值
        ls.push(3);
        ls.push(4);
        ls.push(5);
        ls.push(6);
        //每次出栈，都是栈顶元素
        ls.pop();
        ls.pop();
        //输出栈中所有元素
        ls.printAll();
    }
}