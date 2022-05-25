package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		System.out.println(d1.obterDataFormatada());

		d1.dia = 15;
		d1.mes = 11;
		d1.ano = 2021;
		System.out.println(d1.obterDataFormatada());

		Data d2 = new Data(31, 12, 2020);
		System.out.println(d2.obterDataFormatada());

	}

}
