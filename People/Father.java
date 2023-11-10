package People;

public class Father extends Parent {

    public String Name(){
        return "Василий";
    }

    public Father()
    {
        super();
        fio = "Пупкин Василий Васильевич";
        gender  = false;
    }

    public Father(int c,String w,  String f, int a)
    {
        super(c, w,  f,false, a);
    
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
