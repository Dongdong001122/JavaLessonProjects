public class DoWhileSentence {
    public static void main(String[] args){
        int i = 100, s = 0;
        do {
			s+=i;         //将i累加到s上
			i--;         // i自减1
        }while(i>0);    //当i大于0时执行
        System.out.println("100 + 99 + 98 + ... + 1 = " + s);
    }
}
