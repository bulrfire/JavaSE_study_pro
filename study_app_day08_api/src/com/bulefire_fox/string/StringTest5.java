package com.bulefire_fox.string;

import java.util.Random;

public class StringTest5 {
    public static void main(String[] args) {
        //目标：产生随机验证码
        System.out.println(creatCode(4));
        System.out.println(creatCode(6));
    }

    //1.设计方法生成验证码
    public static String creatCode(int n){
        Random r = new Random();

        //2.记住所有字符，最终的随机字符
        String code = "";
        String data = "qwertyuioplkjhgfdsazxcvbnmQAZWSXEDCRFVTGBNHYUJMKIOLP0123456789";

        //3.产生随机字符
        for (int i = 0; i < n; i++) {
            //4.随机一个合法索引
            int index = r.nextInt(0,data.length());

            //5.提取字符
            code += data.charAt(index);
        }
        return code;
    }
}
