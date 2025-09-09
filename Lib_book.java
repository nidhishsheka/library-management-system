//Lib_book.java
public class Lib_book extends A_book
            implements Issueable {
                public boolean available=true;
          
           public Lib_book(String t,String a, int i){
               super(t,a,i);
           }
         public void issueBook(){
             if(!available){
                System.out.println("not available");
             }else
             available=false;
         }
        public void returnBook(){
            available=true;
        }
        public boolean isAvailable(){
            return available;
        }

      }