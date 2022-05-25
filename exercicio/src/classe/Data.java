package classe;



public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	String  obterDataFormatada() {		
		
	return String.format("%d/%d/%d\n", dia,  mes, ano);		
		
	}
	
	Data (){
		dia = 1;
		mes = 1;
		ano = 1970;
	
	}
	Data (int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
		
	}
	
	
	int somar (int a, int b) {
		
		int c;
		c = a + b;	
		return c;
	}
	
	
	

}
