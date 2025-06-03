class animal {
    void sound() {
        System.out.println("animal make sound");
    }
}
class dog extends animal {
    void voice() {
        System.out.println("dog make sound");
    }
}
public class soundanimal {
    public static void main(String[] args) {
        dog a = new dog();
        a.sound();
        a.voice();
    }
}