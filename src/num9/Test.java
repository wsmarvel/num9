package num9;

public class Test {
	public static void main(String args[]) {
		String string = "my code";
		System.out.println("1."+string+ " is low now");
		String a = "a";
		String b = "b";
		String c = a + b;
		String d = "ab";
		if(c==d) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
		System.out.println(c);
		
		 StringBuffer sBuffer = new StringBuffer("website£º");
		    sBuffer.delete(1,2);
		    System.out.println(sBuffer);
		    sBuffer.insert(1,111);
		    System.out.println(sBuffer);
		    sBuffer.replace(0,4,"hello ");
		    System.out.println(sBuffer);
	}

}
