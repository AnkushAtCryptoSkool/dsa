package src.practice_aspora.Adapter;

public class ThirdPartyLegacyPayementGateway {
    public void completeTransaction(String currency, Double amount){
        System.out.println("Transaction is done for " + currency + " " + amount);
    }
}
