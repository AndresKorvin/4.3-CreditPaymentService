public class Main {
    public static void main(String[] args) {

        int loanAmount = 1_000_000; double interestRate = 9.99; int numberOfMonths = 12;
        var amountPerMonth =  new CreditPaymentService().calculate(loanAmount, interestRate,numberOfMonths);
        System.out.println("Ежемесячный платеж " + String.format("%.0f", amountPerMonth) + " руб. Процентная ставка " + interestRate + "%.");

        numberOfMonths = 24;
        amountPerMonth = new CreditPaymentService().calculate(loanAmount, interestRate,numberOfMonths);
        System.out.println("Ежемесячный платеж " + String.format("%.0f", amountPerMonth) + " руб. Процентная ставка " + interestRate + "%.");

        numberOfMonths = 36;
        amountPerMonth = new CreditPaymentService().calculate(loanAmount, interestRate,numberOfMonths);
        System.out.println("Ежемесячный платеж " + String.format("%.0f", amountPerMonth) + " руб. Процентная ставка " + interestRate + "%.");
    }
}

