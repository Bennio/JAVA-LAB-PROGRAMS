/**
 * This class is used to show the use of generics constructor.
 * @author MrinalWalia
 */
class Test {
	//Generics constructor
	public <T> Test(T item){
		 System.out.println(item.getClass().getName() + '=' + item);
	}
}
 
public class GenericsConstructor {	
	public static void main(String args[]){
		//String type test
		Test test1 = new Test("Loda mera hai itne inch ka");
		Test test2 = new Test(10);
	}
}