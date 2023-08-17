package com.bkuefire_fox.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //目标：掌握自增，自减运算符的使用
        int a = 10;
        //a++;//a = a + 1
        ++a;
        System.out.println(a);

        //a--;//a = a - 1
        --a;
        System.out.println(a);

        //System.out.println(2++);//自增自减只能操作变量不能操作字面量

        System.out.println("-------------------------------------------------");

        int i = 10;
        int rs = ++i;//先加再用
        System.out.println(a);
        System.out.println(rs);

        int j =10;
        int rs2 = j++;//先用后加
        System.out.println(j);
        System.out.println(rs2);

        int m = 5;
        int n = 3;
        //m 5 6 5 4
        //n 3 4 3
        //            6  - 5   + 5  -   4  + 4  +3
        int result = ++m - --m + m-- - ++n + n-- +3;
        System.out.println(result);//9
        System.out.println(m);//4
        System.out.println(n);//3

        //练习题
        int c = 10;
        int d = 5;
        //c 11 12 11
        //d 4 5
        //        10  + 12  - 4   -  5  + 1 + 12
        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
        System.out.println(rs3);//26
        System.out.println(c);//11
        System.out.println(d);//5

    }
}
