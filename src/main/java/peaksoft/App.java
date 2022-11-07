package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//        Animal animal = context.getBean("animal", Animal.class);
//        animal.animalMinus();
//        animal.animalPlus();
//
//        Cat cat = context.getBean("cat", Cat.class);
//        System.out.println(cat.getName());
//        System.out.println(cat.getAge());
//        System.out.println(cat.getBreed());
//        System.out.println(cat.getColor());
//
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person.getName());
//        System.out.println(person.getAge());




        Person person = context.getBean("person", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        person.getAnimal().animalMinus();
        person.getAnimal().animalPlus();
        System.out.println(person);

        System.out.println();

        person2.getAnimal().animalMinus();
        person2.getAnimal().animalPlus();
        System.out.println(person2);


    }
}
