package People;

public class Teenager implements Human, WriterInfo {
    protected String fio;
    protected boolean gender; // true жен
    protected int age;

    protected int schoolNumber;
    protected int rating;  // средний балл

    public Teenager()
    {
       fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 10;
        schoolNumber = 70;
        rating = 9;
    }

    public Teenager(int s, int r)
    {
        fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 10;
        schoolNumber = s;
        rating = r;
    }

    public Teenager(int s,int r,  String f,boolean g, int a)
    {
        fio = f;
        gender  = g;
        age = a;

        schoolNumber = s;
        rating = r;
    }

    public String Name(){return "Оля";}

    public int getRating() {
        return rating;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void print()
    {
        System.out.println("Данные о подростке:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Номер номер школы:"+schoolNumber);
        System.out.println("Успеваемость:"+rating);

        System.out.println("Способ обращения:"+this.Name());
    }
}
