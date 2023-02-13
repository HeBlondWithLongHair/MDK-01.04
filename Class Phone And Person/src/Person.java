class Person
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        person1.move();
        person1.talk();
        Person person2 = new Person("Иван", 18);
        person2.move();
        person2.talk();


    }

    String fullName;
    int age;

    public void move()
    {
        System.out.println(fullName + " Двигается");
    }
    public void talk()
    {
        System.out.println(fullName + " Говорит");
    }

    public Person()
    {
        fullName = "Андрей";
        
    }

    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;

    }

}
