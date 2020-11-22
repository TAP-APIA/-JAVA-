package 实验;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
String b = new String();
        try {
            File A = new File("C:\\Users\\TAP-APIA\\Desktop\\A.txt");
            File B = new File("C:\\Users\\TAP-APIA\\Desktop\\B.txt");
            Writer out = new FileWriter(A, true);
            Reader in = new FileReader(B);
            char chars[] = new char[238];
            int n = -1;
            while ((n = in.read(chars)) != -1) {
                out.write(chars, 0, n);
            }
            out.flush();
            out.close();
            n = 0;
            a:
            while (n < 238) {
                if ((n+1) % 14 == 1 && n!=0) {
                    b = b + "。\n" + chars[n];
                } else {
                    if ((n+1) % 7 == 1 && n!=0) {
                        b = b + "," + chars[n];
                    } else {
                        b = b + chars[n];
                    }
                }
                n = n + 1;
            }
        b = b + "。";
        Scanner q = new Scanner(System.in);
        System.out.println("请依次输入姓名，班级，学号并以回车分割");
        Scanner w = new Scanner(System.in);
        Scanner e = new Scanner(System.in);
        student xiaoB = new student(q.next(),w.next(),e.nextInt());
        FileOutputStream fos = new FileOutputStream("C:\\Users\\TAP-APIA\\Desktop\\A.txt");
        fos.write((xiaoB.toString() + b).getBytes());
        System.out.println("找点啥");
        Scanner r = new Scanner(System.in);
        String t = r.next();
        char input[] = t.toCharArray();
        char output[] = (b+"。").toCharArray();
        int z = 0;
        n = 0;
        int p = 0;
        int k;
        while(n<272){
            p = 0;
            if (input[p]==output[n]){
                k = 0;
                while (k<t.length()){
                    if (input[p]==output[n]) {
                        p = p + 1;
                        n = n + 1;
                        k = k + 1;
                    }else break;
                }if((k) == t.length()){
                    z = z + 1;
                }
            }n = n + 1;
        }
        System.out.println(z+"次重复");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
