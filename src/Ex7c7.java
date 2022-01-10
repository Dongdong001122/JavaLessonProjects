import java.util.Scanner;

class Ex7c7{
    public static void main(String[] args) {
        System.out.print("Please input the number: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle circle= new Circle();
        circle.area((float) r);
        System.out.println("The area of circle is   "+circle.area((float) r));
        System.out.println("The perimeter of circle is  "+circle.perimeter((float) r));

    }
}