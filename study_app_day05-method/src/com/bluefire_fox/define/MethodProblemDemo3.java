package com.bluefire_fox.define;

public class MethodProblemDemo3 {

    public static void printHelloWorld(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
    }
    public static int sum(int a,int b){
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        // 目标：搞清楚使用方法时的几个常见问题
//        1.10方法的编写顺序无所谓，方法与方法之间是平级关系，不能嵌套定义。
        printHelloWorld();
//        2.方法的返回值类型为void（无返回值），方法内则不能使用return返回数据，如果方法的返回值类型写了具体类型，方法内部则必须使用return返回对应类型的数据。

//        3.return语句下面，不能编写代码，因为永远执行不到，属于无效的代码。

//        4.方法不调用就不执行,  调用时必须严格匹配方法的参数情况。

//        5.有返回值的方法调用时可以选择定义变量接收结果，或者直接输出调用，甚至直接调用；
        //定义变量接收结果
        int rs = sum(10,20);
        System.out.println(rs);

        //直接输出调用
        System.out.println(sum(10,90));

        //直接调用
        sum(100,200);
//        无返回值方法的调用只能直接调用。
        printHelloWorld();

        //int rs2 = printHelloWorld();
        //System.out.println(printHelloWorld());
    }
}
