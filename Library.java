public class Library{
          private Lib_book[] book;
          private int count;

          public Library(int size){
              book= new Lib_book[size];
          }

          public void add_new_book(String t,String a, int i){
              if(count>=book.length){
                  System.out.println("library full");
                  return;
              }else{
                  book[count++]=new Lib_book(t,a,i);
              }
          }
          public void issue_book(int isbn){
            Lib_book b=find(isbn);
            if(b==null){
            System.out.println("book not found");
            return;
        }
        b.issueBook();
    }

          public void return_book(int isbn){
            Lib_book b=find(isbn);
            if(b==null){
            System.out.println("book not found");
            return;
        }
        b.returnBook();
    }

          public boolean check_availability(int isbn){
            Lib_book b=find(isbn);
            if(b==null){
            System.out.println("book not found");
            return false;
        }
        return b.isAvailable(); 
    }

          private Lib_book find(int isbn){
            for(int i=0;i<count;i++){
            if(book[i].getIsbn() == isbn){
            return book[i];
            }
          }
           return null;
          }


     }
