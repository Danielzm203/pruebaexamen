import java.util.Scanner;

public class operando {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Cuantos casos hay?");
		int n=sc.nextInt();
		sc.nextLine();
		String[] calcula= new String[n];
		System.out.println("Ingresame las operaciones:");
		for (i=0; i<n; i++) {
			calcula[i]=sc.nextLine();
		}
		for (j=0; j<n; j++) {
			 //  for (i = 0; i < calcula[j].length(); i++) {
	                int num1 =calcula[j].charAt(0)-'0';
	                char operador = calcula[j].charAt(1);
	                int num2 = calcula[j].charAt(2)-'0';
	                		//Character.getNumericValue(opcion);
	                switch (operador) {
	                case '+':
	                	int suma=num1+num2;
	                	System.out.println(suma);
	                	break;
	                case '-':
	                	int resta=num1-num2;
	                	System.out.println(resta);
	                	break;
	                case '*':
	                	int multiplica=num1*num2;
	                	System.out.println(multiplica);
	                	break;
	                case '/':
	                	int division=num1/num2;
	                	System.out.println(division);
	                	break;
	                	default:
	                		System.out.println("Opcion no valida");
	                	

	                }
	                
	                
	         //   }
		}
		