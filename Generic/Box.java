package Generic;

public class Box<T> {
    T container;
    Box(T container){
        this.container = container;
    }

    public T getContainer() {
        System.out.println();
        return container;
    }
//    String container1;
//    Box1(String container1){
//        this.container1 = container1;
//    }
//
//    public String getContainer1() {
//        System.out.println();
//        return container1;
//    }
}

