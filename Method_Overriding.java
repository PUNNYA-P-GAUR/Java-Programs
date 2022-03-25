import java.lang.Class;
import java.util.Scanner;
class Fruit{
    String name;
    String taste;
    String size;
    Fruit(String n,String t, String s){
        name=n;
        taste=t;
        size=s;

    }
    void eat(){
        System.out.println(name+" "+taste+" "+size);
    }
}
class Apple extends Fruit{

    Apple(String n, String t, String s) {
        super(n, t, s);
    }
    void eat(){
        System.out.println(name+" "+taste+" "+size);
    }
}
class orange extends Fruit{
    orange(String n,String t,String s){
        super(n,t,s);
    }
    void eat(){
        System.out.println(name+" "+taste+" "+size);
    }
}
class Fruit1{
    public static void main(String[] args) {
        Apple app=new Apple("Apple","Sweet","Oval");
        orange org=new orange("Orange","Sour","spherical");
        app.eat();
        org.eat();
    }
}
