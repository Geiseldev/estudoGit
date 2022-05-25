package classe;

public class AreaCirc {
	
	double raio;
	double pi;
	
	
	AreaCirc(double raioinicial) {
		pi = 3.14;
		raio = raioinicial;	
	}
	
	double area() {
		
		return raio * raio * pi;
		
	}
	
	

}
