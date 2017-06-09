package generic;
/**
 *
 * @author Asep Kurniawan
 */
class GetApp2 <T> {
    private T type;
    
    public T getType() {
        return type;
        
    }
    
    public void setType (T type) {
        this.type = type;
    }
    private static <Z> void whatYouDo (){
        System.out.println();
    }
    
    private static <N,T> void anythingYouWanted(N freeParType, T freeTwo) {
        System.out.println(freeParType);
        System.out.println(freeTwo);
    }
    public static void main (String[]Args) {
        anythingYouWanted(1,"Star");
        
        
        
    }
    
}