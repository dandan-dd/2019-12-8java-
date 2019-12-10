package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Arrays;

public class IfElseTest {

    @Test
    public void testIfElse() {
        int[] aa=new int[4];
        int[] bb=new int[4];
        for(int i=10;i<=99;i++){
            for(int j=10;j<=99;j++){
                int sum=i*j;
                if(sum<1000||sum>9999){
                    continue;
                }
                aa[0]=i/10;
                aa[1]=i%10;
                aa[2]=j/10;
                aa[3]=j%10;
                bb[0]=sum/1000;
                bb[1]=(sum%1000)/100;
                bb[2]=((sum%1000)%100)/10;
                bb[3]=sum%10;
                Arrays.sort(aa);
                Arrays.sort(bb);
               if( Arrays.equals(aa,bb)){
                  System.out.println(i+"*"+j+"="+sum);
               }
            }
        }
    }

}
