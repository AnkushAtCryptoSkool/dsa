package src.practice_aspora.factory;

public enum PaymentType {
    NEFT("NEFT"),NetBanking("NetBanking"),Refund("Refund"),UPI("UPI");
    private final String paymentType;
    PaymentType(String paymentType){
     this.paymentType = paymentType;
    }
    public String getPaymentType(){
        return paymentType;
    }
}
