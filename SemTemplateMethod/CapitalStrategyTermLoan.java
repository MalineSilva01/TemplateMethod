package SemTemplateMethod;

public class CapitalStrategyTermLoan extends CapitalStrategy {

	public double capital(Loan loan){
		System.out.println("retorna loan.getCommitmente()*duration(loan)*riskFactorFor(loan)");
		return 0;
	}
	
	
}
