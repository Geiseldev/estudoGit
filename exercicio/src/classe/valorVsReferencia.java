package classe;

public class valorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;

		a++;
		b--;
		System.out.println(a + "\n" + b);

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;

		d1.dia = 31;
		d1.mes = 12;

		d1.ano = 2025;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

	}

}
