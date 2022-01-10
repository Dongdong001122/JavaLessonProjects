public class Ex8c2 {
    String name;
    int age;
    public Ex8c2() {

    }

    public Ex8c2(String name) {
        this.name=name;
        System.out.println("Ex8c2()构造方法被调用");
    }

    /*定义一个Ex8c2类构造方法，该方法接收一个字符串参数，
在方法体中，把该参数赋给name属性，并显示“Ex8c2(String newName)构造方法被调用”   */
    public Ex8c2(String name,int age){
        this.name=name;
        this.age=age;
        System.out.printf("Ex8c2(String newName,int newAge)构造方法被调用");
    }
	/*定义一个Ex8c2类构造方法，该方法接收一个字符串参数与一个整型参数，
在方法体中，把字符串参数赋给name属性，把整型参数赋值给age属性，并显示“Ex8c2(String newName,int newAge)构造方法被调用”  */

    public static void main(String[] args) {
        Ex8c2 s1=new Ex8c2();//创建Ex8c2类的一个对象s1,不传入参数
        Ex8c2 s2=new Ex8c2("张三");//创建Ex8c2类的一个对象s2，传入一个参数“张三”
        Ex8c2 s3=new Ex8c2("李四",15);//创建Ex8c2类的一个对象s3，传入两个参数“李四”和15
    }

}