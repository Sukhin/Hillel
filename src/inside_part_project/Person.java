package inside_part_project;

public class Person {

    public String name;
    public int age;
    public String profession;

    public Person(String name, int age, String profession) {

        this.name = name;
        this.age = age;
        this.profession = profession;

    }

    public void setProfession(String newProfession) {

        this.profession = newProfession;
    }

}
