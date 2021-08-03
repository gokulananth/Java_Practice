package exception;
public class Basic {
    public static void main(String... args){
        try{
            int divide=100/0;

        }catch (ArithmeticException e)
        {System.out.println(e);}
        System.out.println("Below Code");
    }

}
