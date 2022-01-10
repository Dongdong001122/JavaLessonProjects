import java.util.Scanner;

public class c6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader =new Scanner(System.in );

        System.out.println("Please type  characters	");
        String ch = reader.nextLine();
        System.out.println("The number you typed is "+ch);

        System.out.println("Please type a int	");
        int i = reader.nextInt();
        System.out.println("The number you typed is"+i);

        System.out.println("Please type a float ");
        float f = reader.nextFloat();
        System.out.println("The number you typed is"+f);

        System.out.println("Please type a double float	");
        double d = reader.nextDouble();
        System.out.println("The number you typed is"+d);

    }

}
