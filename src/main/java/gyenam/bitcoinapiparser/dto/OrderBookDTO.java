package gyenam.bitcoinapiparser.dto;

/**
 * Created by One0 on 2018. 1. 14..
 *
 * bithumb 거래소 판/구매 등록 대기 또는 거래 중 내역 정보
 * https://api.bithumb.com/public/orderbook/{currency}
 * {currency} = BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS (기본값: BTC), ALL(전체)
 */
public class OrderBookDTO {
    private String timestamp; // 현재 시간 Timestamp
    private String order_currency; // 주문 화폐단위
    private String payment_currency; // 결제 화폐단위
    private String bids; // 구매요청
    private String asks; // 판매요청

    private String quantity; // Currency 수량
    private String price; // 1Currency당 거래금액

}
