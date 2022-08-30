package jhy;


import jhy.config.SpringConfig;
import jhy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class APP {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

//        StudentDao studentDao = ctx.getBean(StudentDao.class);
//        Student student = studentDao.findById(14);
//        System.out.println(student);

//        Service bookService = ctx.getBean(Service.class);
//        Student student = bookService.findById(14);
//        System.out.println(student);

//        Service service = ctx.getBean(Service.class);
//        service.findById(14);

//        BookDao bookDao = ctx.getBean(BookDao.class);
//        String name = bookDao.findName(100);
//        System.out.println(name);

//        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);
//        boolean flag = resourcesService.openURL("http://pan.baidu.com/haha", "   root    ");
//        System.out.println(flag);

        BookService bookService = ctx.getBean(BookService.class);
        System.out.println(bookService.getById(1));

    }
}

