import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCalculator {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<Calcultor> cls = Calcultor.class;

		Calcultor obj = cls.newInstance();
		
		Method method[]=cls.getDeclaredMethods();
		
		for(int i=0; i < method.length;i++){
			System.out.println(method[i].invoke(obj, null));
		}
		
		
		
		//System.out.println(obj.add());
	}

}
