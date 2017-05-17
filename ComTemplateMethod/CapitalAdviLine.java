package ComTemplateMethod;

public class CapitalAdviLine extends CapitalComTemplete {

	
	public double tempoRisco(Loan loan) {
		return (loan.getCommitment() * loan.getUnusedPecentage());  
	}

	
	

	
	

}
