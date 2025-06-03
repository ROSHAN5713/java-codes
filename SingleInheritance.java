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
class SingleInheritance{
    public static void main(String[] args) 
    {
        child obj = new child();
        obj.display();
        obj.show();
    }
}