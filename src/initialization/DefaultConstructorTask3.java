package initialization;

/**
 * Created by kscsq on 27.04.2017.
 */
public class DefaultConstructorTask3 {
    public DefaultConstructorTask3(){
        System.out.print("Just a text!");
    }
    public DefaultConstructorTask3(String text){
        this();
        System.out.println(" " + text);
    }

    public static void main(String[] args) {
        new DefaultConstructorTask3();
        new DefaultConstructorTask3("+ Another text!");
    }
}
