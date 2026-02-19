package project_part2;

public class Employee {

    private String fullName;
    private String position;
    private String numberPhone;
    private String email;
    private byte age;

    public Employee(String fullName, String position, String email, String numberPhone, byte age) {

        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        setAge(age);

    }

    public void setFullName(String fullName) {

        this.fullName = fullName;

    }

    public void setPosition(String position) {

        this.position = position;

    }

    public void setEmail(String email) {

        this.email = email;

    }

    public void setNumberPhone(String numberPhone) {

        this.numberPhone = numberPhone;

    }

    public void setAge(byte age) {

        if (age >= 18) {

            this.age = age;

        }

        else {

            System.out.println("The age is less then allowed!");

        }

    }

    public String getFullName() {

        return fullName;

    }

    public String getPosition() {

        return position;

    }

    public String getEmail() {

        return email;

    }

    public String getNumberPhone() {

        return numberPhone;

    }

    public byte getAge() {

        return age;

    }

}