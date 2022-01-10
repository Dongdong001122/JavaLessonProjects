public class Ex6c2 {public static void main(String[] args) {
    int i,j,n = 9  ;
    System.out.print(" * |");
    for(i = 1; i <= n ; i++) {
        System.out.printf("%4d",i);
    }
    System.out.print("\n---|");
    for(i = 1;  i<=9 ; i++) {
        System.out.print("----");
    }
    System.out.println();
    for (i = 1; i <= n; i++){
        System.out.print(" "+ i +" |");
        for(j = 1; j<=9 ; j++) {
//            System.out.print(" " );
            System.out.printf("%4d",i*j);
        }
        System.out.println();
    }
}

}
