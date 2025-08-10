package src.practice_aspora.Adapter;

import com.sun.tools.javac.Main;

public class PayementAdapter implements MainPaymentProcessor {

    ThirdPartyLegacyPayementGateway payementGateway;

    public PayementAdapter(ThirdPartyLegacyPayementGateway payementGateway){
        this.payementGateway = payementGateway;
    }

    @Override
    public void pay(Double amount) {
        payementGateway.completeTransaction("Rs",amount);
    }
}
