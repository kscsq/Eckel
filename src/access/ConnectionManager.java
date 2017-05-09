package access;

/**
 * Created by kscsq on 03.05.2017.
 */
class Connection {
    private Connection(){}

    public static Connection getConnection(){

        return new Connection();
    }
}
public class ConnectionManager {
    private static Connection[] con = new Connection[10];
    static {
        for (int i = 0; i < 10; i++)
            con[i] = Connection.getConnection();
    }
    private static int count = 0;
    public static Connection get(){
        if (count == 10)
            return null;
        else {
            count++;
            return con[count-1];
        }
    }
    public static void main(String[] args) {
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
        System.out.println(get());
    }
}
