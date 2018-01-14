package gyenam.bitcoinapiparser.dto;

/**
 * Created by One0 on 2018. 1. 14..
 *
 * bithumb 거래소 거래 체결 완료 내역
 * https://api.bithumb.com/public/recent_transactions/{currency}
 * {currency} = BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS (기본값: BTC)
 */
public class RecentTransactionsDTO {
    private String transaction_date; // 거래 채결 시간
    private String type;             // 판/구매 (ask, bid)
    private String units_traded;     // 거래 Currency 수량
    private String price;            // 1Currency 거래 금액
    private String total;            // 총 거래금액
}
