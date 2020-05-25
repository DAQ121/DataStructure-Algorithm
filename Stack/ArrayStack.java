/**
* 基于数组的顺序栈
* 功能:入栈，出栈，输出栈
* @author:代澳旗
*/

//抑制编译器警告
@SuppressWarnings("all")

public class ArrayStack {
    private String[] items;  // 定义数组
    private int count;       // 栈中元素个数
    private int n;           // 栈的大小


    // 初始化数组，数组长度为n
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
        }

    /**
     * 功能:入栈
     * 说明:数组入栈的入口为数组尾部
     * @param item :入栈的数据元素
     */
    public boolean push(String item) {
        // 栈满，返回 false，入栈失败。
        if (count == n){
            return false;
        }
        // 栈未满，将 item 放到下标为 count 的位置
        items[count] = item;
        //数组长度+1
        ++count;
        //入栈成功
        return true;
        }

    /**
     * 功能:出栈
     * @return:返回出栈元素
     */
    public String pop() {
        // 如果栈为空，返回 null
        if (count == 0) {
            return null;
        }
        // 栈不为空，返回下标为 count-1 的数组元素
        String tmp = items[count-1];
        //数组长度-1
        --count;
        //返回出栈数据元素
        return tmp;
    }

    //测试
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(7);
        as.push("1");
        as.push("2");
        as.push("3");
        System.out.println(as.pop());
    }
}