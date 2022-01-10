public class Ex5c4 {
    public static void main(String[] args) {
        int i =100;

        for( ;i<1000;i++){
//            System.out.println(i);
//            i=371;
            double a=(double) (i/100);
            double b=(double)((i/10)%10);
            double c=(double) (i%10);
//            System.out.println("i="+i+"hundred"+a+"ten"+b+" "+c);
            if(i==(int)Math.pow(a,3)+(int) Math.pow(b,3)+(int) Math.pow(c,3))
                System.out.print(i+" ");}
        i=100;
        while (i<=1000) {
            double  a=(double) (i/100);
            double  b=(double)((i/10)%10);
            double  c=(double) (i%10);
            if (i == (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3))
                System.out.print(i+" ");
            i++;
        }

        i=100;
        do {
            double  a=(double) (i/100);
            double  b=(double)((i/10)%10);
            double  c=(double) (i%10);
            if (i == (int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3))
                System.out.print(i+" ");
            i++;
        }while (i<=1000);
    }
}
