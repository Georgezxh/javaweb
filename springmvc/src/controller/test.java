package controller;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        float sum=0;
        float score=0;
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <21 ; i++) {
            float x=in.nextFloat();
            float y=in.nextFloat();
            score+=y;
            sum+=x*y;
        }
        float res=sum/score;
        System.out.println(sum);
        System.out.println(score);
        System.out.println(res);
    }
}
