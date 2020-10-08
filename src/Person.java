public class Person {
    public static void main(String[] args) {
        Child1 child1 = new Child1();

        Person child = new Person();
        Person.Child2 child2 = child.new Child2();

        System.out.println(child1.hello());
        System.out.println(child2.hello());

    }
    //вложенный класс
     static class Child1{
        String hello(){
            return "привет";
        }
    }

    //Внутренний класс
     class Child2{
        String hello(){
            return "servus";
        }
    }

    Child2 ch = new Child2();


}
