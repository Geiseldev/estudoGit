package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Notebook";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);		
		System.out.println(p1.desconto);
		
		double precoFinal1 = p1.preco * (1- p1.desconto);
		double precoFinal2 = p2.preco * (1- p2.desconto);
		System.out.println((precoFinal1 + precoFinal2)/2);
		
		System.out.println(p2.nome);		
		System.out.println(p2.preco);
		System.out.println(p2.desconto);
	}
	
	

}
