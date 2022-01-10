import java.util.Scanner;

public class Ex6c3 {
    public static void main(String[] args) {
        System.out.println("Please type in the number of line");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = " ";
        String repeated = str.repeat(3);
        for(int i=1;i<=num;i++) {
            System.out.print(str.repeat(num-i));
            for(int j=1;j<i*2;j++)
                System.out.print('*');
            System.out.print('\n');
        }
        for(int i=num-1;i>0;i--) {
            System.out.print(str.repeat(num-i));
            for(int j=1;j<i*2;j++)
                System.out.print('*');
            System.out.print('\n');
        }
    }
}
