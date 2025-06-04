//write a program to create a class called rectangle, private variable: length and width, provide public get, set methods to access the variables to get area.
class abc{
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
class rectangle1{
    public static void main(String[] args){
        abc r = new abc();
        r.setLength(2.5);
        r.setWidth(1.5);
        double length = r.getLength();
        double width = r.getWidth();
        System.out.println("length is "+length);
        System.out.println("width is "+width);
        double area = length*width;
        System.out.println("area is "+area);
    }ṁ
}