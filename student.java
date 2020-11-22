package 实验;

public class student {
    String xm;
    String bj;
    int xh;
     student(String xm,String bj,int xh){
         this.xm = xm;
         this.bj = bj;
         this.xh = xh;
    }

    @Override
    public String toString() {
        return "姓名:" + xm + "\n班级:" + bj + "\n学号:" + xh + "\n";
    }
}
