package SemTemplateMethod;

public abstract class CapitalStrategy {
		
	public double capital (Loan loan){
		System.out.println("valor a ser tomado como emprestimo");
		return 0;
	}
	public double duration(Loan loan){
		System.out.println("duração de parcelas");
		return 0;
	}
	
	protected double riskFactorFor(Loan loan){
		System.out.println("valor dos juros");
		return 0;
	}
	
	
	
	
	
	

	
}
