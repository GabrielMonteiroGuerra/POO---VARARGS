
public class Aritmetica {
	
	double res;
	
	//função 1 = somando 2 valores e retornando resultado
	public double soma2Nums (double n1, double n2) {
		return res = n1 + n2;
	}
	
	//função 2 = somando 3 valores e retornando o resultado
	public double soma3Nums (double n1, double n2, double n3) {
		return res = n1+ n2+ n3;
	}
	
	//função 3 = somando valores com vetor
	
	public int somavetor (int nums[]) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			 res += nums[i];
		}
		return res;
	}
	
	//função 4 = somando valores com varargs
	public int somaVarargs (int ... nums) {
		int s = 0;
		for (int valor : nums) {
			s += valor;
		}
		return s;
	}
	
}
