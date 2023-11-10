package People;

public abstract class Parent implements Human, WriterInfo {
    protected String fio;
    protected boolean gender; // true жен
    protected int age;

    protected int countChildren;
    protected String workPlace;

    public Parent()
    {
        fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 20;

        countChildren = 2;
        workPlace = "бгуир";
    }

    public Parent(int c, String w)
    {
       fio = "Раскоша Ольга Сергеевна";
        gender  = true;
        age = 20;
        countChildren = c;
        workPlace = w;
    }

    public Parent(int c,String w,  String f,boolean g, int a)
    {
        fio = f;
        gender  = g;
        age = a;
        countChildren = c;
        workPlace = w;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public int getCountChildren() {
        return countChildren;
    }

    
    
}
