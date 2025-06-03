class parent{
    void display()
    {
        System.out.println("Parent class");
    }
}
class child1 extends parent{
    void show()
    {
        System.out.println("1st Child class");
    }
}
class child2 extends parent{
    void show1()
    {
        System.out.println("2nd Child class");
    }
}
class MultipleInheritance{
    public static void main(String[] args)
    {
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        obj1.display();
        obj1.show();
        obj2.display();
        obj2.show1();
    }
}