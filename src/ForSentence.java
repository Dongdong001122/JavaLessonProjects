public class ForSentence {public static void main(String[] args){
    int s = 0;
    for(int i=1;i<100;i++) {   //声明一个变量i,i从1到99，每次递增1
        s+=i;     //s和i相加，并将结果赋值给s
        i++;	  //i自增1
    }
    System.out.println("1 + 3 + 5 + ... + 99 = "+s);
}
}
