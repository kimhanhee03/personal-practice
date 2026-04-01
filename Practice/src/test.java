class A
{
	int aa=100;
} 
class B 
{
	public void setAA(A a) 
	{
		a.aa=1000;
	}
	public void setStr(String s)
	{
		s="홍길동";
	}    
} 

public class test {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		 A a=new A();
	        System.out.println(a.aa);
	        B b=new B();
	        b.setAA(a); 
	        System.out.println(a.aa);  
	        String name="심청이";
	        System.out.println(name);
	        b.setStr(name);
	        System.out.println(name);
	}

}
