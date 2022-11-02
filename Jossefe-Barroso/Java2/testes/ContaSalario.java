package testes;

public class ContaSalario extends conta {
	private double ReceberSalario;
	 
    public double getChequeEspecial() {
        return ReceberSalario;
    }
 
    public void setChequeEspecial(double chequeEspecial) {
        this.ReceberSalario = ReceberSalario;
    }
   
    public ContaSalario() {
    }
   
    public ContaSalario(String agencia, String numero, double saldo, double ReceberSalario) {
        super(agencia, numero, saldo);
       
        this.ReceberSalario = ReceberSalario;
    }
}


