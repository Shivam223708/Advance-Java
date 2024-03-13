package homework;

import java.util.ArrayList;

public class bookmain {
    public static void main(String[] args) {
        ArrayList<Book> obj = new ArrayList<>();
        obj.add(new Book(01,"Science","Newton"));
        obj.add(new Book(02,"Social Science","Obama"));
        obj.add(new Book(03,"Mathematics","Ramanujan"));
        for(Book obj2 : obj){
            System.out.println("Bookid = " + obj2.getBookid() + "\nBookname = " + obj2.getBookname() + "\nAuthorname = " + obj2.getAuthorname());
        }
    }
}
