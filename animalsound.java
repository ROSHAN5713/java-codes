class Shape {
    void getArea() {
        System.out.println(" ");
    }
    void getPerimeter(){
        System.out.println(" ");
    }
}
class circle extends Shape {
    void sound() {
        
    }
}
class rectangle extends Shape {
    void sound() {
        System.out.println("Bird Chirps");
    }
}
class triangle extends Shape {
    void sound() {
        System.out.println("Bird Chirps");
    }
}
public class animalsound {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        bird b = new bird();
        b.sound();
        Cat c = new Cat();
        c.sound();
    }
}