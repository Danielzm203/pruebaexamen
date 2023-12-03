import java.util.Scanner;

public class holamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //reparar el buffer de teclado para poder escribor. Crear un objeto apartir de un molde
		int n;
		int s;
		int a;
		int b;
		int c;
		int d;
System.out.println("Hola mundo");
System.out.println("Dame un numero");
n=sc.nextInt();
System.out.println("Dame otro numero:");
s=sc.nextInt();
a=n+s;
b=n-s;
c=n*s;
d=n/s;

System.out.println("El total de la suma es: " +a);
System.out.println("El total de la resta es: " +b);
System.out.println("El total de la multiplicacion es: " +c);
System.out.println("El total de la division es: " +d);

	}

}
