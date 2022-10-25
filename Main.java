package question5_8;

public class Main {
public static void main(String[] args) {
		
		//question2 TesteConta2 = new question2();
		//System.out.println(TesteConta2.nome);
		//TesteConta2.nome = "Gessyca";
		
		
		question2 TesteConta3 = new question2();
		TesteConta3.setAgencia("1111");
		TesteConta3.setData(22,22,22);
		TesteConta3.setNome("Gessyca");
		TesteConta3.setNumero(3333);
		TesteConta3.setSaldo(4444);
		TesteConta3.recuperaDadosParaImpressao();
		
		question4 TesteConta4 =new question4("Gessyca");
		TesteConta4.recuperaDadosParaImpressao();

		question5 TesteConta51 =new question5("Gessyca");
		TesteConta51.recuperaDadosParaImpressao();
		question5 TesteConta52 =new question5("Gessyca");
		TesteConta52.recuperaDadosParaImpressao();
		
		question6 TesteConta61 =new question6("Gessyca");
		TesteConta61.setData(10, 20, 12);	
		
		
		
		
	}
}
