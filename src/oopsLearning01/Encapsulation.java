package oopsLearning01;
/*
wrapping up data member and function together in a single unit
DM are properties or state
function are behaviour and methods

A fully encapsulated class => all--> DM are private(so these are approached by same class)
ADVANTAGE....
data ko hide kart han
if we want to mark class ReadOnly.
Code Reusability
Unit testing
*/
public class Encapsulation {
    public static void main(String[] args) {

    }
    public class Student{
        private String name;
        int age;
        int height;

        public Student(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

}
