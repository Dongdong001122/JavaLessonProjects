public class Ex8c4 {
    int plus(int a,int b) {
        int s;
        s = a + b;
        return s;
    }

    int plus(int a, int b, int c) {
        int s;
        s=a+b+c;//要求调用两个参数的plus()方法，得到a + b + c的和
        return s;
    }

    int plus(int a, int b, int c, int d) {
        int s;
        s=a + b + c + d;//要求调用三个参数的plus()方法，得到a + b + c + d的和
        return s;
    }

    public static void main(String[] args) {
        Ex8c4  p = new Ex8c4();

        System.out.println("1+2="+p.plus(1,2));//调用plus()方法求1+2的值并显示
        System.out.println("1+2+3="+p.plus(1,2,3));//调用plus()方法求1+2+3的值并显示
        System.out.println("1+2+3+4="+p.plus(1,2,3,4));//调用plus()方法求1+2+3+4的值并显示
    }

}
