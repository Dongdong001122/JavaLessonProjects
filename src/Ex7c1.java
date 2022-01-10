public class Ex7c1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 13;
        s1.chinese = 80;
        s1.math = 90;
        s1.english = 85;
        System.out.println("你好，我叫" + s1.name + "," + "我今年" + s1.age + "岁");
        System.out.println("我的总分是" + s1.total());
        System.out.println("我的平均分是" + s1.average());

        Student s2=new Student();
        s2.name="Li Si";
        s2.age=121;
        s2.chinese=34;
        s2.math=23;
        s2.english=343;
        System.out.println("你好，我叫" + s2.name + "," + "我今年" + s2.age + "岁");
        System.out.println("我的总分是" + s2.total());
        System.out.println("我的平均分是" + s2.average());

        Student s3=new Student();
        s3.setStudent("王五",12,89,98,99);



        if(s1.total()>s3.total())//如果s1的总分比s2的总分高
            System.out.println(s1.name + "的成绩好");
        else if(s1.total()<s3.total())  //如果s1的总分比s2的总分低
            System.out.println(s3.name + "的成绩好");
        else
            System.out.println(s1.name + "和" + s3.name + "的成绩一样");

    }
}


class Student {

    String name;
    int age;
    int chinese;//定义一个整型属性 chinese
    int math;//定义一个整型属性 math
    int english;//定义一个整型属性 english

    public Student(String 李四, int i) {
    }

    public Student() {

    }

    int total() {
        return chinese+math+english;//返回chinese、math、english三个整数属性的总和
    }
    int average() {
        return (chinese+math+english)/3;//返回chinese、math、english三个整数属性的平均值
    }

    void setStudent(String n, int a,int c,int m,int e) {
        name=n;//将参数n赋值给属性name
        age=a;//将参数a赋值给属性age
        chinese=c;//将参数c赋值给属性chinese
        math=m;//将参数m赋值给属性math
        english=e;//将参数e赋值给属性english
    }

}
