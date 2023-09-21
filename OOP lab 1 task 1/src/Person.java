public class Person
{
    String name;
    int birthYear;
    int deathYear;
    public Person(String n, int b, int d){
        name =n;
        birthYear = b;
        deathYear = d;
    }
    Person(Person person){
        name = person.name;
        birthYear = person.birthYear;
        deathYear = person.deathYear;


    }
    public String getName() {
        return name;
    }

    public  int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("BirthYear: " + birthYear);
        if (deathYear == 0) {
            System.out.println("Death date: -1");
        } else {
            System.out.println("Death date: " + deathYear);
        }
    }



    public static void main(String[] args) {
        Person p1= new Person("Abdul Sattar Eidhi", 1908,2016);
        p1.getName();
        p1.getBirthYear();
        p1.getDeathYear();
        p1.print();

    }
}