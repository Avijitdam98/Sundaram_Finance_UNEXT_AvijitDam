package com.Java8;

interface i1
{
    int meth(int a,int b);
}
public class LambdaExpDemo{

    public static void main(String[] args) {
        i1 obj=(  m, n)->	{
            m++;n++;
            return(m+n);
        };
        System.out.println(obj.meth(13,14));
    }
}
