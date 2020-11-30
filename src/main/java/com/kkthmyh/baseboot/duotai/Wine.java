package com.kkthmyh.baseboot.duotai;

/**
 * @Author kkthmyh
 * @Date 2020/11/26 16:01
 * @Version 1.0
 * @Description
 */
public class Wine {

    public void fun1() {
        System.out.println("这是Wine的fun方法");
        fun2();
    }

    public void fun2() {
        System.out.println("这是Wine的fun2方法");
    }

}

class JNC extends Wine{

    public void fun1(String str) {
        System.out.println("JNC的fun1");
        fun2();
    }

    @Override
    public void fun2() {
        System.out.println("JNC的fun2");
    }

}

class Test{
    public static void main(String[] args) {
        String msg = Code.CODE_001.getMsg();
        System.out.println(msg);

    }
}
