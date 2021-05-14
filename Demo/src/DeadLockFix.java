
public class DeadLockFix {
	
	    /**
	     * Both method are now requesting lock in same order, first Integer and then String.
	     * You could have also done reverse e.g. first String and then Integer,
	     * both will solve the problem, as long as both method are requesting lock
	     * in consistent order.
	     */
	    public void method1() {
	        synchronized (String.class) {
	            System.out.println("Aquired lock on Integer.class object");

	            synchronized (Integer.class) {
	                System.out.println("Aquired lock on String.class object");
	            }
	        }
	    }

	    public void method2() {
	        synchronized (String.class) {
	            System.out.println("Aquired lock on Integer.class object");

	            synchronized (Integer.class) {
	                System.out.println("Aquired lock on String.class object");
	            }
	        }
	    }
	public static void main(String[] args) {
		
		DeadLockFix d=new DeadLockFix();
		d.method1();
		d.method2();
	}
}
