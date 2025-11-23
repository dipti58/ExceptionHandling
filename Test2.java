public class Test2 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            System.exit(0);             //jvm will shutdown
        }
        catch(ArithmeticException e){
            System.out.println("catch");
        }
        finally{
            System.out.println("program end");
        }
        
    }
}
