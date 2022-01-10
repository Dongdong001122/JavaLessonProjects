class Ex7c5{
    public static void main(String[] args) {
        float r=2;//定义半径r为单精度类型，值为2
        float c_Perimeter;				//定义圆周长变量c_Perimeter
        float c_Area;					//定义圆面积变量c_Area
        Circle c=new Circle();//创建Circle类对象c
        c_Perimeter = c.perimeter(r); //调用c对象的perimeter方法
        c_Area = c.area(r); //调用c对象的area方法

        System.out.println("半径为2的圆周长为：" + c_Perimeter);
        System.out.println("半径为2的圆周长为：" + c_Area);
    }
}


class Circle {
    float cr;//此代码用于定义单精度类型变量cr
    public static final float PI=(float) 3.14; //此代码用于定义单精度类型常量PI=3.142
    float perimeter(float r) {
        cr = r;
        return 2*PI*cr;//返回圆周长值
    }
    float area(float r) {
        cr = r;
        return (float) ((float) PI*Math.pow((double) cr,2));//返回圆面积值
    }
}