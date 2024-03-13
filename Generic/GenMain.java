package Generic;

public class GenMain {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>("Shivam");
        box1.container = "Umesh";
        System.out.println(box1.getContainer());
    }
}
