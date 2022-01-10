public class Ex5c7 {
    public static void main(String[] args) {
        int i;long s=1;
        for(i=1;i<=20;i++) {
            s *= i;
//            System.out.println(i);
//            System.out.println(s);
        }
        System.out.println(s);

        i=1;s=1;
        while(i<=20) s *=i++;
        System.out.println(s);

        i=0;s=1;
        do{
            s *=++i;
        }while(i<20);
        System.out.println(s);
    }
}
