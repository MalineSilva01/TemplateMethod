package ComTemplateMethod;

import SemTemplateMethod.Loan;

public abstract class CapitalComTemplete {
	
		
	public double capitalTemplete( Loan loan ){
        return(duration(loan) * riskFactorFor(loan));
    }

	protected double riskFactorFor(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}



	private double duration(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double capital (Loan loan){
		System.out.println("valor a ser tomado como emprestimo");
		return 0;
	}
	

	

	

   
		
		
	
	

}
