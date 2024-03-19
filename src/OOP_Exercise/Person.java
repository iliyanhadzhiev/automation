package OOP_Exercise;

import java.time.LocalDate;

public class Person {
    private String name;
//    private String sex;
    private char sex;
    private String religion;
    private String language;
    private String job;
    private String nationality;
    //EGN
    private String egn;
    //Date of birth
    private LocalDate dateOfBirth;
    //Age
    private int age;
    //Country of residence
    private String country;

    public Person(String name, char sex, String religion, String language, String job, String nationality, String egn, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.language = language;
        this.job = job;
        this.nationality = nationality;
        this.egn = validateEGN(egn);
        this.country = country;
        this.dateOfBirth = getDateOfBirth(egn);
        this.age = getAge(dateOfBirth);
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    private int getAge(LocalDate dateOfBirth) {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    private LocalDate getDateOfBirth(String egn) {
        String yearString = egn.substring(0, 2); // Takes String arrays indexes 0 through 2 but 2 is EXCLUSIVE
        int year = Integer.parseInt(yearString);
        int month = Integer.parseInt(egn.substring(2, 4));
        int day = Integer.parseInt(egn.substring(4, 6));

        if(month > 40) {
            year = year + 2000;
            month = month - 40;
        } else {
            year = year + 1900;
        }

        return LocalDate.of(year, month, day);
    }

    private String validateEGN(String eng) {
        if (egn.length() == 10 && containsOnlyDigits(egn)) {
            return egn;
        } else {
            throw new IllegalArgumentException("The provided EGN is not valid! The EGN must contain only 10 digits!");
        }
    }

    private boolean containsOnlyDigits(String egn) {
        try {
            return Long.parseLong(egn) > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void sayHello() {
        switch (nationality.toLowerCase()) {
            case "bulgarian":
                System.out.println("Здравей!");
                break;
            case "italian":
                System.out.println("Ciao!");
                break;
            default:
                System.out.println("Hello!");
        }
    }

    public void celebrateEaster() {
        if (religion.equalsIgnoreCase("orthodox") || religion.equalsIgnoreCase("catholic")) {
            System.out.println("I am celebrating Easter");
        } else {
            System.out.println("I am not celebrating Easter");
        }
    }


}
