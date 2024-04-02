package OOP_Exercise;

public class Main {

    public static void main(String[] args) {

//        Bulgarian newBG = new Bulgarian("i1", 'm', "none", "QA", "8601192020", "Bulgaria");
//        System.out.println(newBG);

        Person newPerson = new Person("Person Name", 'm', "none", "Bulgarian", "QA", "USA", "0611192020", "USA");
//        System.out.println(newPerson.isAdult());

        American newAmerican = new American("John", 'm', "orthodox", "DevOps", "8901012020", "USA");
        Bulgarian newBulgarian = new Bulgarian("Georgi", 'M', "catholic", "Dev", "9105203030", "Bulgaria");
        Italian newItalian = new Italian("Antonia", 'F', "Catholic", "PO", "8808088808", "Italy");
        Child newChild = new Child("Ema", 'f', "none", "English", "American", "2246061919", "France");

        System.out.println("Person:");
        newPerson.sayHello();
        System.out.println("Can take a loan: " + newPerson.canTakeLoan());
        System.out.println("Is adult: " + newPerson.isAdult());
        newPerson.celebrateEaster();
        System.out.println();

        System.out.println("American:");
        newAmerican.sayHello();
        System.out.println("Can take a loan: " + newAmerican.canTakeLoan());
        newAmerican.celebrateEaster();
        System.out.println("Is adult: " + newAmerican.isAdult());
        newAmerican.eatsBurger();
        System.out.println();

        System.out.println("Bulgarian:");
        newBulgarian.sayHello();
        newBulgarian.danceHoro();
        System.out.println("Is adult: " + newBulgarian.isAdult());
        System.out.println("Can take a loan: " + newBulgarian.canTakeLoan());
        newBulgarian.celebrateEaster();
        System.out.println();

        System.out.println("Italian:");
        newItalian.sayHello();
        System.out.println("Can take a loan: " + newItalian.canTakeLoan());
        newItalian.celebrateEaster();
        System.out.println("Is adult: " + newItalian.isAdult());
        newItalian.eatsPasta();
        System.out.println();

        System.out.println("Child:");
        newChild.canTakeLoan();
        newChild.isAdult();
        newChild.sayHello();
        newChild.celebrateEaster();
    }
}
