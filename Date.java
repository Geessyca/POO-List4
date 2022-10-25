package List4;

public class Date {
	int day;
	int month;
	int year;
	Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void showDate() {
		System.out.print("\nDia:"+this.day);
		System.out.print(" Mês:"+this.month);
		System.out.print(" Ano:"+this.year);
	}
	
	String formatada() {
		String res = Integer.toString(day)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
		
		return res;
	}
}
