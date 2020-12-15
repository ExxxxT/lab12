package task1;
public class Person {
    String name;
    String lastName;
    String middleName;

    public Person(String name, String lastName, String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public String getFullName() {
        if(!lastName.isEmpty()) {
            this.lastName += " ";
        }
        if(!name.isEmpty()) {
            name = "" + name.charAt(0);
            name += ".";
        }
        if(!middleName.isEmpty()) {
            middleName = "" + middleName.charAt(0);
            middleName += ".";
        }
        return new StringBuilder().append(lastName).append(name).append(middleName).toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Aleksandr", "Gayzer", "Sergeevich");
        Person person2 = new Person("", "Gayzer", "Sergeevich");
        Person person3 = new Person("Aleksandr", "", "Sergeevich");
        Person person4 = new Person("Aleksandr", "Gayzer", "");
        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
        System.out.println(person4.getFullName());
    }
}