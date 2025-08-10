package src.practice_aspora.factory;

public class Txn {
    int id;
    PaymentType type;
    int amount;

    public Txn(int id, PaymentType type, int amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type.getPaymentType();
    }

    public void setType(String type) {
        PaymentType paymentType = PaymentType.valueOf(type);
        this.type = paymentType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
