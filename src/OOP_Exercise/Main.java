package OOP_Exercise;

public class Main {

    public static void main(String[] args) {

//        Bulgarian newBG = new Bulgarian("i1", 'm', "none", "QA", "8601192020", "Bulgaria");
//        System.out.println(newBG);

        Person newPerson = new Person("Person Name", 'm', "none", "Bulgarian", "QA", "USA", "0641192020", "USA");
        System.out.println(newPerson.isAdult());

    }
}
