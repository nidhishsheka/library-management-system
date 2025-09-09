//A_book.java
public class A_book{

      private String title;
      private String author;
      private int isbn;

      public A_book(String t,String a, int i){
          title=t;
          author=a;
          isbn=i;
      }
      public String getTitle(){
          return title;
      }
      public String getAuthor(){
          return author;
      }
      public int getIsbn(){
          return isbn;
      }
}