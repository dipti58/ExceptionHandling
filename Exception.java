class Exception{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        try{
            System.out.println(a[3]);
            for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("it is array indexoutofboundexception");
        }
        finally{
            System.out.println("end the program");
        }
        
    }
}