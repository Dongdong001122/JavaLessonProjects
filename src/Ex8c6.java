public class Ex8c6 {
    String strName;

//定义一个公共方法setName(String name),用于设置属性strName的值
public String setName(String name){
    strName=name;
    return name;
}
//定义一个公共方法getName(),用于返回属性strName的值
public String getName(){
    return setName(strName);
    }
    public static void main(String[] args) {
        Ex8c6 a = new Ex8c6();
        a.setName("张三");
        Ex8c6 b = a;
        b.setName("李四");
        Ex8c6 c = new Ex8c6();
        c.setName("王五");

        System.out.println("a的名字是" + a.getName());
        System.out.println("b的名字是" + b.getName());
        System.out.println("c的名字是" + c.getName());

        System.out.println(a==b ? "相等":"不相等");//比较对象a与b,根据比较结果，显示a与b相等或不相等

        System.out.println(a==c ? "相等":"不相等");//比较对象a与c,根据比较结果，显示a与c相等或不相等

    }

}
