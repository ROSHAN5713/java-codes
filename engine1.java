class vehical {
    void state() {
        System.out.println("vehical is running");
    }
    void state2(){
        System.out.println("vehicle is stopped");
    }
}
class car extends vehical {
    void state() {
        System.out.println("engine starts");
    }
    void state2() {
        System.out.println("engine stops");
    }
}
class motorcycle extends vehical {
    void state() {
        System.out.println("engine starts");
    }
    void state2() {
        System.out.println("engine stops");
    }
}

public class engine1 {
    public static void main(String[] args) {
        vehical a = new vehical();
        a.state();
        a.state2();
        car b = new car();
        b.state();
        b.state2();
        motorcycle c = new motorcycle();
        c.state();
        c.state2();
    }
}