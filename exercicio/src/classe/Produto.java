package classe;

public class Produto {
	double desconto;
	double preco;
	String nome;
	
	double precoComDessconto ( ) {
		
		return preco  * (1 - desconto);		
	}
	
	Produto (){		
		
	}
	
	

}
