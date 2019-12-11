package String;

import org.testng.annotations.Test;

public class StringTest {
    @Test
    public void test字符串内存使用(){
        String str1="hello";
        String str2="hello";
        System.out.println(str1==str2);
        String str3="hello word";
        String str4=str1+"word";
        System.out.println(str3==str4);
        //String str5=new String{ original:"hello"};
        //String str6=new String{ original:"hello"};
        //System.out.println(str5==str6);

        String str7=str4.intern();
        System.out.println(str4==str7);


    }
    @Test
    public void testLength(){
        String str1="tdt78bf55g7";
        System.out.println(str1.length());
    }
}
