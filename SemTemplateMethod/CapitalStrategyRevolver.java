package SemTemplateMethod;

public class CapitalStrategyRevolver extends CapitalStrategy{

	@Override
	public double capital(Loan loan){
		System.out.println("retorna loan.outstandingRiskAmount9)* duration(loan)*riskFactorFor(loan)"
				+ "*(loan.unusedRiskAmount()* duration(loan)* unusedRiskFactor(loan))");
		return 0;
	}

	

	

}
