import java.util.Scanner;

public class Ex8c7 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input an integer number.");
        int a_int  = input.nextInt();
        System.out.println("Please input a double float number.");
        double a_double = input.nextDouble();
        add_ Add=new add_();
        int sum=Add.Addition(a_int,a_double);
        System.out.println("The sum of int and double is "+sum);
    }
}

class add_{
    public int Addition(int anInt, double aDouble){
        double sum= anInt +aDouble;
        return (int) sum;
    }}