public class Phone
{ 
    public static void main(String[] args)
    {
        Phone phone1 = new Phone(" 89042597945 ","R2D2",80.2f);
        System.out.print(phone1.getNumber());
        phone1.receiveCall("Иван");
        Phone phone2 = new Phone(" +79042597945 ","R1D1",70.5f);
        System.out.print(phone2.getNumber());
        phone2.receiveCall("Михаил");
        Phone phone3 = new Phone(" 88005553535 ","R0D0",120.5f);
        System.out.print(phone3.getNumber());
        phone3.receiveCall("Виктор ");

        Phone.receiveCall("Андрей ", "89004326702");
        Phone.sendMessage(new String[]{"89317659054", "880032112312", "89102310121"}, 3);

    }

    public String number;
    public String model;
    public float weight ;

    public static void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }
    public static void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name + number);
    }
    public String getNumber()
    {
        return this.number;
    }
    public static void sendMessage(String[] numbers , int lenght)
    {
        if(numbers.length > lenght)
        {
            System.out.println("Номеров телефонов больше!");
            return;
        }
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Сообщение было отправленно на номер " + numbers[i]);
        }

    }

    public Phone(String number,String model,float weight)
    {
        this(number,model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model)
    {
        this.number = number;
        this.model = model;
    }
    public Phone()
    {

    }

}

