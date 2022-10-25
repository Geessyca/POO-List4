package question5_8;

public class question5 {
	private String nome ;
	private int numero ;
	private static int identificador;
	private String agencia;
	private double saldo;
	private Data data = new Data(0,0,0);;
	
	
	Ex_5Conta(String nome){
		this.nome=nome;
		Ex_5Conta.identificador = Ex_5Conta.identificador + 1;
		}
		
	public double getIdentificador() {
		return this.identificador ;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	public double getSaldo() {
		return this.saldo ;
	}
	
	
	public void setNome(String valor) {
		this.nome = valor;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	public void setNumero(int valor) {
		this.saldo = valor;
	}
	public int getNumero() {
		return this.numero ;
	}
	
	
	public void setAgencia(String valor) {
		this.agencia = valor;
	}
	public String getAgencia() {
		return this.agencia ;
	}
	
	
	public void setData(int dia,int mes,int ano) {
		this.data.dia = dia;
		this.data.mes = mes;
		this.data.ano = ano;
	}
	public Data  getData() {
		return this.data ;
	}
	
	
	
	public void saca(double valorsacado) {
		this.saldo = this.saldo-valorsacado;
		System.out.print("\nsaldo : "+ this.saldo);
	}
	
	public void deposita(double deposito) {
		this.saldo = this.saldo+deposito;
		System.out.print("\nsaldo : "+ this.saldo);
	}
	
	public void CalcRendimento() {
		System.out.print("\nRendimento:"+this.saldo*0.1);
	}
	public void recuperaDadosParaImpressao() {
		System.out.print("\nNome:"+this.nome);
		System.out.print("\nNumero:"+this.numero);
		System.out.print("\nAgencia:"+this.agencia);
		System.out.print("\nSaldo:"+this.saldo);
		System.out.print("\nData:"  );
		this.data.Dados();

	}

}
