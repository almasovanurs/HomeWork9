package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

       /* Lion lion = context.getBean("lion", Lion.class);
        System.out.println(lion.getAge());
        System.out.println(lion.getAge());
        context.close();*/

        Giraffe giraffe = context.getBean("giraffe", Giraffe.class);
        giraffe.animalMinus();
        giraffe.animalPlus();
        System.out.println(giraffe.getBreed());
        System.out.println(giraffe.getGrowth());
        context.close();
    }
}
