import java.util.Vector;
public class Day2Vector {
    public static void main(String[] args) {
        Vector<Object> v= new Vector();
        v.add(3);
            v.add("Hello");
            v.add(2.4);
            for(Object i : v ){
                System.out.println(i);
            }
        
    }

    
}
