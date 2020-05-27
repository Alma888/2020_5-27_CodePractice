//题目：求最小公倍数

// 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
//    设计一个算法，求输入A和B的最小公倍数。
//  【输入描述】 输入两个正整数A和B。
//  【输出描述】 输出A和B的最小公倍数。
//  【示例1】输入  5 7
//                  输出  35
//  【题目解析】：这类题目是典型的考察我们如何将之前熟悉的数学问题转换
//       为程序代码的能力。最小公倍数和最大公约数应该是我们初中数学学习
//       的知识，大家可以在草稿纸上列举几个不太大的数字，先看我们自己是
//       如何求出一个数的最小公倍数和最大公约数，然后只需要把我们解决问
//       题的过程代码化即可。
//  【解题思路】：求最小公倍数
//       两个数a,b的最小公倍数是a*b/gcd(a,b)。由于两个数的乘积等于这两个
//       数的最大公约数与最小公倍数的积，即（a，b）× [a，b] = a × b  所以，
//       求两个数的最小公倍数，就可以先求出它们的最大公约数，然后用上述
//       公式求出它们的最小公倍数。
//              求最大公约数：
//              1. a/b，令r为所得余数（0≤r<b） 若r=0，算法结束，a即为答案
//              2. 互换：置 a←b，b←r，并返回第一步
import java.util.Scanner;

public class day7_01{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            System.out.println(gbs(n1,n2));
        }
    }
    public static int gbs(int a,int b){
        return (a*b)/gys(a,b);
    }
    public static int gys(int a,int b){
        if(b==0){
            return a;
        }else{
            return gys(b,a%b);
        }
    }
}