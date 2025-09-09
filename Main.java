public class Main{
    public static void main(String[] args){
        Library l=new Library(7);


        //adding books
        l.add_new_book("The Alchemist","Paulo Coelho",529);
        l.add_new_book("Beyond Entrepreneurship","James C. Collins",46);
        l.add_new_book("Zero to One","Peter Thiel",396);

        System.out.println(l.check_availability(46));
        l.issue_book(46);
        System.out.println(l.check_availability(46));
        l.return_book(46);
        System.out.println(l.check_availability(46));

    }

}
