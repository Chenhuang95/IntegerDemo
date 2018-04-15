/**
 * 基本数据类型对象包装类
 * 关键字  类
 * byte  Byte
 * int  Integer
 * char  Character
 * double  Double
 * 基本数据类型包装类最常用是在基本数据类型和字符串之间做转化
 * 1、   str = 34 + "";
 * 2\    str = Integer.toString(34);
 *
 * 字符串转基本数据类型：
 *   int i = Integer.parseInt("6");
 *   long x = Long.parseLong("60");
 *   十进制转其他进制：toBinaryString();
 *   其他进制转十进制：parseInt(str,int radix) radix = 10就是十进制 radix=16就是输入数据为16进制
 */

public class IntegerDemo {
    public static void main(String[] args)
    {
            int i = Integer.parseInt("6");
            long x = Long.parseLong("60");
            System.out.println(i);
            System.out.println(x);

            Integer num = new Integer("4");
            num = num+2;//num自动拆箱，变成 int类型，随后运算，再装箱；
            System.out.println(num);


            Integer n = 126;
            Integer m = 126;
            System.out.println("m==n:"+(m==n));//结果为true,当Integer的值再1byte以内，如果该值存在，则不会产生新对象
    }
}
