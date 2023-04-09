
public class TypeCasting {
	static int i;
	public TypeCasting()
	{
	i = 0;	
	}
	
	public static void main(String[] args) {
		System.out.println(i);

// double --> float --> long --> int --> short --> byte || Narrowing (Explicit) Type Casting ||
// byte --> short --> int --> long --> float --> double || Widening (Implicit) Type Casting  ||
		
		
		
	int number = 1012;	
	double d = 4.55d;
	float f = 1.25f;
	int i = (int) d ; // Narrowing (Explicit) Type Casting  || double --> int (d)
	double j = (double) f; // Widening (Implicit) Type Casting  || float --> double (f)
	int k = (int)f;	
	System.out.println(d);
	System.out.println(f);
	System.out.println(i);
	System.out.println(j);
	System.out.println(k);
	
 //-------------------------------------------------
	
int id =  1001;
float fd = 105.00f;

double id2 = (double) id;  // Widening (Implicit) type casting

int fd2 = (int) fd ; // Narrowing(Explicit) type casting

System.out.println(id); // 1001
System.out.println(id2); // 1001.0
System.out.println(fd); // 105.0
System.out.println(fd2); // 105
	
	
	
	
	}
}
