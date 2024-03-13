package homework;

public class Book {
    int bookid;
    String bookname;
    String authorname;

    Book(int bookid, String bookname, String authorname){
        this.bookid = bookid;
        this.bookname = bookname;
        this.authorname = authorname;
    }
    public int getBookid(){
        return bookid;
    }
    public String getBookname(){
        return bookname;
    }
    public String getAuthorname(){
        return authorname;
    }
}
