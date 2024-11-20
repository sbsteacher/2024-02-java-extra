package com.green.javaextra.day03;

class BookDtoTest {
    public static void main(String[] args) {
        BookDto bookDto = new BookDto();
        bookDto.setBookName("책제목");
        bookDto.setBookId(3);
        bookDto.setPrice(15000);
        bookDto.setPublisher("출판사명");
        String d = bookDto.toString();
        //String d = "com.green.javaextra.day03.BookDto@404b9385";
        System.out.println(d);
    }
}

public class BookDto extends Object {
    private int bookId;
    private String bookName;
    private String publisher;
    private int price;

    public String toString() {
        return String.format("[BookDto - bookId: %d, bookName: %s, publisher: %s, price: %,d]",
                bookId, bookName, publisher, price);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
