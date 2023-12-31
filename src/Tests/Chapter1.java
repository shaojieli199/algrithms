package Tests;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Chapter1 {
    public static void main(String[] args) {
        // test1_1_1();
        // test1_1_2();
        // test1_1_3(args);
        // test1_1_4();
        // test1_1_5(args);
        // test1_1_6();
        // test1_1_7();
        // test1_1_8();
        // test1_1_9(4);
        // test1_1_10();
        // test1_1_11();
        // test1_1_12();
        // test1_1_13(3,2);
        // test1_1_14(2);
        // test1_1_15(10);
        // test1_1_16();
        // test1_1_18();
        // test1_1_19();
        // test1_1_20();
        // test1_1_21(2);
        // test1_1_22();
        // test1_1_23(args);
        test1_1_24();
    }

    static void test1_1_1(){
        // 1.1.1 给出以下表达式的值：
        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);
    }

    static void test1_1_2(){
        // 1.1.2 给出以下表达式的类型和值：
        System.out.println((1 + 2.236) / 2);
        System.out.println(1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1 + 2 + "3");
    }

    static void test1_1_3(String[] args){
        if (args.length != 3){
            System.out.println("wrong input!");
            return;
        }
        // 1.1.3 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal。
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        if (a==b && b==c){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    static void test1_1_4(){
        int a = 0, b = 0, c = 0;
        // if(a > b) then c = 0;
        if (a > b){
            c = 0;
        }else{
            b = 0;
        }
    }

    static void test1_1_5(String[] args){
         if (args.length != 2){
            System.out.println("wrong input!");
            return;
        }
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        if (a > 0 && a < 1 && b > 0 && b < 1){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

    static void test1_1_6(){
        // 斐波那契数列
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    static void test1_1_7(){
        // 牛顿迭代法开平方
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001){
            t = (9.0/t +t) / 2.0;
            }
        System.out.printf("%.10f\n", t);
        
        int sum = 0;
        for (int i = 1; i < 1000; i++){
            for (int j = 0; j < i; j++){
                sum++;
                // 1 + 2 + 3 + ...+ 999 = 1000 * 999 / 2 = 499500
            }
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 1; i < 1000; i *= 2){
            for (int j = 0; j < 1000; j++){
                sum++;
                // ((1 * 2) ^ 10 = 1024 > 1000) 512共乘了10次
                // 1000 * 10 = 10000
            }
        }
        System.out.println(sum);
    }

    static void test1_1_8(){
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a'+ 4));
    }

    static void test1_1_9(int N){
        String s = "";
        for(int n = N; n > 0; n = n / 2){
            s = n % 2 + s; // 注意顺序！
        }
        System.out.println(s);
    }
    
    static void test1_1_10(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = i * i;
        }
        System.out.println(Arrays.toString(a));
    }

    static void test1_1_11(){
        // 打印带列号行号的布尔数组
        boolean[][] A = {{true,false,false},{false,true,true}};
        for (int i = 0; i < A.length; i++){
            if (i==0){
                    System.out.print(" ");
                    for (int j = 0; j < A[i].length; j++ ){
                         System.out.print(j);
                    }
                    System.out.println();
                }
            for (int j = 0; j < A[i].length; j++ ){
                
                if (j==0){
                    System.out.print(i);
                }
                if (A[i][j]){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void test1_1_12(){
        int[] a = new int[10];
        for (int i = 0; i < 10; i++){
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++){
            a[i] = a[a[i]];
        }
        System.out.println(Arrays.toString(a));
    }

    static void test1_1_13(int M, int N){
        // 矩阵转置
        int[][] A = new int[M][N];
        int[][] T = new int[N][M];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                A[i][j] = StdRandom.uniformInt(100);
            }
        }
        
         for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                T[i][j] = A[j][i];
            }
        }
        
        for (int i = 0; i < M; i++){
            System.out.println(Arrays.toString(A[i]));
        }
        
        for (int i = 0; i < N; i++){
            System.out.println(Arrays.toString(T[i]));
        }
    }

    static int test1_1_14(int N){
        int num = 1;
        int i = 0;
        while (num <= N/2){
            num += num;
            i++;
        }
        System.out.println("不大于log"+ N +"的最大整数是"+ i);
        return i;
    }

    static int[] test1_1_15(int M){
        int a[] = new int[StdRandom.uniformInt(100)];
        int [] result = new int[M];

        // init a[]
        for (int i = 0; i < a.length; i++){
            a[i] = StdRandom.uniformInt(0, M);
        }

        for (int i = 0; i < M; i++){
            int num_i = 0;
            for (int j = 0; j < a.length; j++){
                if (a[j] == i){
                    num_i++;
                }
            }
            result[i] = num_i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(result));
        return result;
    }

    static void test1_1_16(){
        System.out.println(exR1(6));
        /**
         * e(6) = e(3)+6+e(4)+6
         * e(3) = e(0)+3+e(1)+3
         * e(0) = ''
         * e(1) = e(-2)+1+e(-1)+1
         * --
         * e(6) = 3+1+1+3+6+e(4)+6
         * e(4) = e(1)+4+e(2)+4
         * e(2) = e(-1)+2+e(0)+2
         * e(6) = 3+1+1+3+6+1+1+4+2+2+4+6
         */
    }

    static String exR1(int n){
        if (n <= 0) {
            return "";
        }
        return exR1(n-3) + n + exR1(n-2) + n;
    }

    static void test1_1_18(){
        System.out.println(mystery2(3,11));
         /**
          * mystory
          * a=2
          * b=25     25 12 6  3  1
          *          1  0  0  1  1
          *          2  4  8  16 32
          * =2+16+32=50
          *
          * a=3
          * b=11  11 5 2  1
          *       1  1 0  1
          *       3  6 12 24
          * =3+6+24=33   
          *
          * mystory2
          * a=2
          * b=25 25 12 6  3   1
          *      1  0  0  1   1
          *      2  4  16 256 65536    
          * =2*256*65536=33554432
          *
          * a=3
          * b=11 11 5 2  1
          *      1  1 0  1
          *      3  9 81 6561
          * =3*9*6561=177147
          */ 
    }

    static int mystery(int a, int b){
        if (b == 0) return 0;
        if (b % 2 ==0 ) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    static int mystery2(int a, int b){
        if (b == 0) return 1;
        if (b % 2 ==0 ) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    static void test1_1_19(){
        long[] result = new long[100];
        for (int N = 0; N < 100; N++){
            // System.out.println(N + " " + F(N));
            result[N] = F2(N, result);
            System.out.println(N + " " + result[N]);
        }
    }

    static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    static long F2(int N, long[] result){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return result[N-1] + result[N-2];
    }

    static void test1_1_20(){
        System.out.println(ln(3));
    }

    static long ln(long n){
        if (n == 1) return 1;
        else return n*ln(n-1);
    }

    static void test1_1_21(int N){
        String[] name = new String[N];
        int[] a = new int[N];
        int[] b = new int[N];
        int index = 0;
        while (!StdIn.isEmpty() && index < N){
            name[index] = StdIn.readString();
            a[index] = StdIn.readInt();
            b[index] = StdIn.readInt(); 
            index++;
        }
        for (int i = 0; i < index; i++){
            System.out.printf("%s %d %d %.3f\n", name[i], a[i], b[i], (double)a[i]/b[i]);
        }
    }

    static void test1_1_22(){
        int [] array = new int[StdRandom.uniformInt(10, 100)];
        for (int i = 0; i < array.length; i++){
            array[i] = StdRandom.uniformInt(1000);
        }
        Arrays.sort(array);

        int key = StdRandom.uniformInt(1000);

        rank(key, array );
    }

    static int rank(int key, int[] a){
        int deep = 0;
        return rank(key, a, 0, a.length - 1, deep);
    }

    static int rank(int key, int[] a, int lo, int hi, int deep){
        
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        // System.out.printf("lo = %d, hi = %d, mid = %d deep = %d\n",lo, hi, mid, ++deep);
        if (key < a[mid])       return rank(key, a, lo, mid - 1, deep);
        else if (key > a[mid])  return rank(key, a, mid + 1, hi, deep);
        else                    return mid;
    }

    static void test1_1_23(String[] args){
        if (args.length < 2){
            return;
        }
        int[] whitelist = new In(args[0]).readAllInts();
        String display_control = args[1];
        Arrays.sort(whitelist);
        while (! StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (display_control.equals("+")){
                if(rank(key, whitelist) < 0){
                    System.out.println(key);
                }  
            }else if(display_control.equals("-")){
                if(rank(key, whitelist) > 0){
                    System.out.println(key);
                }  
            }
        }
    }

    static void test1_1_24(){
        System.out.println(gcd(32,2));
    }

    static int gcd(int a, int b){
        /**gcd(a,b) = gcd(b,a%b)
         *
         * https://www.bilibili.com/read/cv18449834/
         * https://juejin.cn/post/7140890852573839391
         * https://zhuanlan.zhihu.com/p/42707457
         * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
          */
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }

}