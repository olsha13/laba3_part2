package People;

public class Mother extends Parent {

    public Mother()
    {
        super();
        gender  = true;
    }

    public Mother(int c,String w,  String f, int a)
    {
        super(c, w,  f,true, a);
    
    }

    public String Name(){
        return "Ольга";
    }

    public void print()
    {
        System.out.println("Данные о родителе:");
        System.out.println("ФИО: "+fio);
        System.out.println("Пол:"+gender);
        System.out.println("Возраст"+age);
        System.out.println("Место работы:"+workPlace);
        System.out.println("Количество детей:"+countChildren);

        System.out.println("Способ обращения:"+this.Name());
    }
    
}
