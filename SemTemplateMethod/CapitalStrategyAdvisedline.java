package SemTemplateMethod;

public class CapitalStrategyAdvisedline extends  CapitalStrategy {
	
	@Override
	public double capital(Loan loan){
		System.out.println("retorna loan.getCommitmente()*loan.getUnusedPercentagen()*duration(loan)*riskFactorFor(loan)");
		return 0;
	}

	

}
