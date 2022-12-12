public class ClassesAndObjects  {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Рома",20);

        person1.sayHello();
        person1.speak();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.sayHello();
        person2.speak();
        String s1 = "Аня";
        Person person3 = new Person();
        person3.setNameAndAge(s1,30);

        person3.sayHello();
        person3.speak();
        int year1 = person1.calculateYearsToRetirement();
        int year2 = person2.calculateYearsToRetirement();
        int year3 = person3.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии: " +year1+" лет");
        System.out.println("Второму человеку до пенсии: " +year2+" лет");
        System.out.println("Третьему человеку до пенсии: " +year3+" лет");
    }
}
class Person{
    String name;
    int age;
    int userage;

    void setNameAndAge(String userName, int userAge){
        name = userName;
        age = userAge;
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }
    void speak(){
        for(int i = 0; i<3; i++)
        System.out.println("Меня зовут "+name + ", мне "+age+" лет");
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}

