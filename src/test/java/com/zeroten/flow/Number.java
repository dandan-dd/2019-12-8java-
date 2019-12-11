package com.zeroten.flow;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
    static boolean ispalindrome(int i){
        boolean p;
        String a=String.valueOf(i);
        int[] aa=new int[a.length()];
        int[] b=new int[a.length()];
        for(int k=0;k<a.length();k++){
            aa[k]=a.charAt(k);
        }
        for(int j=a.length()-1;j>=0;j--){
            b[a.length()-1-j]=a.charAt(j);
        }
        if(Arrays.equals(aa,b)){
            p=true;
        }else{
            p=false;
        }
        return p;
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int ii=sc.nextInt();
      String ii1=String.valueOf(ii);
      // System.out.println(ii1);
        char[] aa2=new char[ii1.length()];

      boolean q=ispalindrome(ii);
      if(q==true) {
          System.out.println("true");
      }else {
          System.out.println("false");
          System.out.print("从左到右是"+ii+",从右到左是");
          for(int i=0;i<ii1.length();i++){
              aa2[i]=ii1.charAt(ii1.length()-1-i);
              System.out.print(aa2[i]);
          }
          System.out.print("，因此它不是回文数字");

      }
    }
}
