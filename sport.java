//write a java program to create a base class sports with a method called play().
//create three subclasses: football, basketball, and rugby. override the play() method in each method in each subclass to play a specific statement for each sport.
class sports {
    void play() {
        System.out.println("Playing a sport");
    }
}
class football extends sports {
    void play() {
        System.out.println("Playing football");
    }
}
class basketball extends sports {
    void play() {
        System.out.println("Playing basketball");
    }
}
class rugby extends sports {
    void play() {
        System.out.println("Playing rugby");
    }
}
public class sport {
    public static void main(String[] args) {
        sports s = new sports();
        football f = new football();
        basketball b = new basketball();
        rugby r = new rugby();
        s.play();
        f.play();
        b.play();
        r.play();
    }
}