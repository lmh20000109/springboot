import com.lmh.SpringbootO4JunitApplication;
import com.lmh.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.awt.print.Book;

@SpringBootTest(classes = SpringbootO4JunitApplication.class)
//@ContextConfiguration(classes = SpringbootO4JunitApplication.class)
public class Test {


    @Autowired
    private BookDao bookDao;




    @org.junit.jupiter.api.Test
    public void save(){
        bookDao.save();
    }

}
