import java.io.IOException;
//here we are creating the Parent Class
class ExceptionDemo {//Add Throw statement with IOException 
    protected static void test(int num) throws  IOException, ClassNotFoundException{
    	//here we are applying condition for checked Exception
         if(num==1){
                throw new IOException("Exception Message1");
         }else{
                throw new ClassNotFoundException("Exception Message2");
         } 
    }
}
/**
 * here we are creating the child class with throw statement
 * here It will give compilation error because child class is 
 * throwing exception which has larger scope than the exception 
 * thrown by parent class.
 */

public class ExceptionDemoChild extends ExceptionDemo {
	public static void main(String [] args) throws NullPointerException, ClassNotFoundException, IOException{
        //calling the function in child class requires handling the same exception as in the parent method declaration
        System.out.println("Calling the function in child class requires handling the same exception as in the parent method declaration");
        //here we are calling the test method
        test(1);

}
}
/*
 * This can be resolve only if we throw EXCEPTION in Parent class and IOEXCEPTION
 * in Child class.
 * Because EXCEPTION has broader scope than IOEXCEPTION .	
 */
	

