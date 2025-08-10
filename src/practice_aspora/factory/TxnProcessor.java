package src.practice_aspora.factory;

public class TxnProcessor {
    public Processor getProcosser(String type){
        switch (type){
            case "NEFT":
                return new NEFTProcessor();
            case "NetBanking":
                return new NetBankingProcessor();
            case "Refund":
                return new RefundProcessor();
            case "UPI":
                return new UPIProcessor();
            default:
                throw new IllegalArgumentException("Payment Type Not Supported");
        }
    }
}
