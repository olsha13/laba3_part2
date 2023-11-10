package People;


public class Child implements Human, WriterInfo{

    protected String fio;
    protected boolean gender; // true жен
    protected int age;

    protected int gardenNumber;

    public Child()
    {
        fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 10;
        gardenNumber = 34;
    }

    public Child(int g)
    {
        fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 10;
        gardenNumber = g;
    }

    public Child(int g, String f,boolean gg, int a)
    {
        fio = f;
        gender  = gg;
        age = a;

        gardenNumber = g;
    }

    public String Name(){return "Ольчик";}


    public int getGardenNumber() {
        return gardenNumber;
    }

    public void print()
    {
        System.out.println("Данные о ребенке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Номер детского сада:"+gardenNumber);

        System.out.println("Способ обращения:"+this.Name());
    }

    
}
