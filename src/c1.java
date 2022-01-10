import java.util.Scanner;

public class c1 {
    public static void main(String args[]){

        for(int i=0;i<=12;i++){
            int a = -1;
            Scanner reader = new Scanner(System.in);
            System.out.println("请输入月份");
            int d;
            a=reader.nextInt();//【代码1】  从键盘输入0-6的整数，并将其赋值给a
            switch(a) {
                case 2:
                    System.out.println(a+"月，有");
                    d=29;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    d=31;
                    break;
                default:
                    d=30;

            }System.out.println(a+"月，"+d+"天");
        }}

}
