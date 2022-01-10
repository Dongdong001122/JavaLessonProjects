public class Ex5c6 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =1;i<=1000;i++) {
            if ((i % 7 == 0) && (i % 11 == 0)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("sum is"+sum);
        int i=1;sum=0;
        while(i<=1000){
            if ((i%7==0) && (i%11==0)) {
                System.out.println(i);

                sum += i;
            } i++;
        }
        System.out.println("sum is"+sum);
        i=1;sum=0;///////////////
        do{
            if ((i%7==0) && (i%11==0)) {
                System.out.println(i);
                sum += i;
            }
            i++;
        }while(i<=1000);
        System.out.println("sum is"+sum);
    }
}
