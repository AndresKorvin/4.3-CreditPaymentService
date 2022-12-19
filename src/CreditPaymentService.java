public class CreditPaymentService {
    public double calculate(int loanAmount, double interestRate, int numberOfMonths){
        double ps = interestRate /12 /100;
        return  (loanAmount * ps * Math.pow(1 + ps,numberOfMonths) / (Math.pow(1 + ps,numberOfMonths) - 1));

    }
}