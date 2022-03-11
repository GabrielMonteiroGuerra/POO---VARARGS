
public class Teste {
	
	public static void main (String args[]) {
	Aritmetica ar = new Aritmetica();
	
	double soma1 = ar.soma2Nums(2.1, 3.2);
	
	double soma2 = ar.soma2Nums(soma1, 2);
	
	int soma3 = ar.somavetor(new int [] {5, 3, 10});
	
	int soma4 = ar.somaVarargs(5,3,10);
	
	System.out.println("Somando variavéis função simples com 2 valores: "+soma1);
	System.out.println("Somando variáveis função simples com 3 valores: "+soma2);
	System.out.println("Somando utilizando vetor: "+soma3);
	System.out.println("Somando utilizando Varargs: "+soma4);
	
	}
}
