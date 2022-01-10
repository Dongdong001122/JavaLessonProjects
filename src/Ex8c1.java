class Person{
    String name;
    private int age;//定义一个私有整型属性age
    public boolean setAge(int newAge) {
        boolean b =5 <= newAge && newAge <= 20;
        age=newAge;
        return b;/* 如果 5≤newAge≤20，则将newAge赋值给age并返回true；
否则返回false  */
    }

    public int getAge() {
        return age;//返回age属性
    }
}
public class Ex8c1 {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.name = "张三";
        if(s1.setAge(25)) System.out.printf("The age of "+s1.name+" is "+s1.getAge());
        else System.out.printf("Age ERROR!");
        /*为s1的age属性设置年龄25，如果成功，显示s1的姓名和年龄，否则显示“年龄错误”      */

    }
}
