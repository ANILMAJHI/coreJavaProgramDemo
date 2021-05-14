import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
	@interface MyAnnotation
	{
		int value();
	}
	
	class AnnoationClass
	{
		@MyAnnotation(value=10)
		public void sayHello()
		{
			System.out.println("hello brother");
		}
	}
	
	public class CustomAnnotation {	
	
	public static void main(String[] args) throws Exception {

		AnnoationClass ac=new AnnoationClass();
		Method m=ac.getClass().getMethod("hello");
		System.out.println(m);
		/*MyAnnotation my=m.getAnnotation(MyAnnotation.class);
		System.out.println(my.value());
		*/
	}

}
