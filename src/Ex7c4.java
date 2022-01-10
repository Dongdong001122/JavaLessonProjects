public class Ex7c4 {
    public static void main(String[] args) {
        MaxArray ob=new MaxArray();//利用类MaxArray创建对象ob
        int[] a = {2,5,7,3,18,9},b = {33,43,6,12,8};
        System.out.println("数组a中最大值是" + ob.findMax(a,6));
        System.out.println("数组b中最大值是" + ob.findMax(b,5));//输出数组b的最大值
    }
}


class MaxArray{
    public static void main(String[] args) {

    }
    int findMax(int[] a,int n) {
        int max = a[0];
        for(int i =1;i < n;i++)
            if(a[i] > max)
                max = a[i];
        return max;//返回max的值
    }
}