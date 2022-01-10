import java.util.Scanner;
public class WhileSentence {
    public static void main(String[] args){
        int a = 0, i = 1, s = 0;
        Scanner reader = new Scanner(System.in);
        while(a<50 | a>100) {   //当a<50或者a>100时执行
			System.out.println("Please type in an integer from 50 to 100");       //在屏幕上显示“从键盘输入一个50~100的整数”
			a = reader.nextInt();       //读入一个整数，并且赋值给a
        }
        System.out.println("你输入的数是" + a);
        while(i<=a) {   //当i不大于a时执行
			s+=i;         //将i累加到s上
			i++;         //i自增1
        }
        System.out.println("1 + 2 + 3 + ... + " + a + " = " + s);
    }
}
