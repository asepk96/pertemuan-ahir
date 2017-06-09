package generic;
/**
 *
 * @author Asep Kurniawan
 */
public class Latihan {
    String hobi;
    
    public String getHobi(){
        return hobi;
    }
    public void setHobi(String hb){
     this.hobi = hb;   
    
    }
 
    private static <T> void Latihan (T free) {
        System.out.println(free);
    }    
    public static void main (String[] Args){
        Latihan ln = new Latihan();
        
        ln.setHobi("main games");
        System.out.println(ln.getHobi());
        Latihan("this example");
        
    }
    
}