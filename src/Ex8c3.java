public class Ex8c3 {
    private String name;
    private int age;
    private double salary;
    public Ex8c3(String newName,int newAge,double newSalary) {
        this(newAge,newSalary);
        new Ex8c3(15,123);//调用两个参数的构造方法，传入参数 newAge和newSalary
        System.out.println("三个参数的构造方法被调用");
        name = newName;
        new Ex8c3();
    }

    public Ex8c3(int newAge,double newSalary) {
        new Ex8c3(456.12);//要求调用一个参数的构造方法，传入参数newSalary
        System.out.println("两个参数的构造方法被调用");
        age = newAge;
    }

    public Ex8c3(double newSalary) {
        new Ex8c3();//要求调用没有参数的构造方法
        System.out.println("一个参数的构造方法被调用");
        salary = newSalary;
    }

    public Ex8c3() {
        System.out.println("没有参数的构造方法被调用");
    }

    void setAge(int newAge) {
        int age = 0;
        //设置age属性的值为newAge                
    }

    int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Ex8c3 s1 = new Ex8c3("李四",30,8000);
        s1.setAge(31);
        System.out.println("年龄是" + s1.getAge());
    }
}
