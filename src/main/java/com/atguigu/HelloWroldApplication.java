package com.atguigu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

/**
 * @SpringBootApplication 来标注一个主程序类，说明
 */
@SpringBootApplication
public class HelloWroldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWroldApplication.class,args);
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWroldApplication.main");
        System.out.println("args = " + args);
        for (int i = 0; i < 100; i++) {

        }
        ArrayList list= new ArrayList();
        list.add(123);
        for (int i = 0; i < list.size(); i++) {
            
        }
        if (list == null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }

    }

}
