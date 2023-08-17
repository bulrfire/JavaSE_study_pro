package com.buefire_fox.loop;

public class BreakAndContinueDemo8 {
    public static void main(String[] args) {
        //目标：掌握break和continue的作用
        //1.break：跳出并结束当前所在循环的执行
        /*
        需求：输出5句Hello World
            输出到第三句时停止输出
         */
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World" + i);
            if(i == 3) {
                //停止输出
                break;//跳出并结束当前所在循环的执行
            }
        }

        //2.continue:直接跳出当前循环执行，直接进入下一次执行
        /*
         输出5次Hello World,
         第三次时不输出
         之后继续输出
         */
        for (int i = 1; i <= 5; i++) {
            if(i == 3) {
                continue;
            }
            System.out.println("Hello World ===" + i);
        }

//        if (3 < 9){
//            break;
//            System.out.println("2");
//        }

//        if (3 < 9){
//            continue;
//            System.out.println("2");
//        }
    }
}
