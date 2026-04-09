package Day4.java;

import java.util.Scanner;

public class basic {

    // *************encapsulation**************
    // private String name;
    // private Integer age;

    // // getter
    // public String getName() {
    //     return name;
    // }

    // public Integer getAge(){
    //     return age;
    // }

    // public void setName(String newName) {
    //     this.name = newName;
    // }

    // public void setAge(Integer age){
    //     if(age >0){
    //         this.age = age;
    //     }
    // }


    // inheritance 
    // static class Animal{
    //     void eat(){
    //         System.out.println("Animal is eating");
    //     }
    // }

    // static class Dog extends Animal{
    //     void bark(){
    //         System.out.println("Dog is barking");
    //     }
    // }




    // polymorphism
    // static class Animal{
    //     void Sound(){
    //         System.out.println("Animal is sounding");
    //     }
    // }

    // static class Dog extends Animal{
    //     @Override
    //     void Sound(){
    //         System.out.println("Dog is barking");
    //     }
    // }







    // public class Main{
    public static void main(String[] args) {
        // basic p = new basic();
        // // p.setName("Bishal");
        // p.setAge(24);

        // System.out.println(p.getName());
        // System.out.println(p.getAge());


        // Dog d = new Dog();
        // d.eat();
        // d.bark();


        // Animal a = new Dog();

        // a.Sound();


        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inside try block");
            int result = 10/0;
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
