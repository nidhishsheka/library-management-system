//LibraryTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest{
    private Library x;

    @BeforeEach
    void setup(){
        x=new Library(3);
        x.add_new_book("Zero to One","Peter Thiel",396);
    }

    @Test
    void test_check_availability(){
        assertTrue(x.check_availability(396));
    }

    @Test
    void test_issue_book(){
        x.issue_book(396);
        assertFalse(x.check_availability(396));
    }

    @Test
    void test_return_book(){
        x.issue_book(396);
        x.return_book(396);
        assertTrue(x.check_availability(396));
    }
}