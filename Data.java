package question5_8;

public class Data {
	int dia;
	int mes;
	int ano;
	Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public void Dados() {
		System.out.print("\ndia:"+this.dia);
		System.out.print(" mes:"+this.mes);
		System.out.print(" ano:"+this.ano);
	}
	
	String formatada() {
		String res = Integer.toString(dia)+"/"+Integer.toString(mes)+"/"+Integer.toString(ano);
		
		return res;
	}
}
