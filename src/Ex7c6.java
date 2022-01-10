public class Ex7c6 {
    public static void main(String[] args) {
        Dog little_dog=new Dog();
        little_dog.name="Test";
        little_dog.color="Blue";
        little_dog.age=12;
        System.out.println("little_dog.color = " + little_dog.color);
        System.out.println("little_dog.name = " + little_dog.name);
        System.out.println("little_dog.age = " + little_dog.age);
    }

}

class Dog{
    String name;
    String color;
    int age;
}

