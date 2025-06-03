class parent{
    void display()
    {
        System.out.println("Parent class");
    }
}
class child extends parent{
    void show()
    {
        System.out.println("Child class");
    }
}
class child2 extends child{
    void show1()
    {
        System.out.println("Child2 class");
    }
}
class MultiLevelInheritance{
    public static void main(String[] args) 
    {
        child2 obj = new child2();
        obj.display();
        obj.show();
        obj.show1();
    }
}