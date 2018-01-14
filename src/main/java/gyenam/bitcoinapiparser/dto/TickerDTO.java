package gyenam.bitcoinapiparser.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by One0 on 2018. 1. 14..
 *
 * bithumb 거래소 마지막 거래 정보
 * https://api.bithumb.com/public/ticker/{currency}
 * {currency} = BTC, ETH, DASH, LTC, ETC, XRP, BCH, XMR, ZEC, QTUM, BTG, EOS (기본값: BTC), ALL(전체)
 */
@Getter
@Setter
public class TickerDTO {
    @NotNull
    @Min(value = 0)
    private long opening_price;  // 최근 24시간 내 시작 거래금액

    @NotNull
    @Min(value = 0)
    private long closing_price;  // 최근 24시간 내 마지막 거래금액

    @NotNull
    @Min(value = 0)
    private long min_price;      // 최근 24시간 내 최저 거래금액

    @NotNull
    @Min(value = 0)
    private long max_price;      // 최근 24시간 내 최고 거래금액

    @NotNull
    @Min(value = 0)
    private double average_price;// 최근 24시간 내 평균 거래금액

    @NotNull
    @Min(value = 0)
    private double units_traded; // 최근 24시간 내 Currency 거래량

    @NotNull
    @Min(value = 0)
    private double volume_1day;  // 최근 1일간 Currency 거래량

    @NotNull
    @Min(value = 0)
    private double volume_7day;  // 최근 7일간 Currency 거래량

    @NotNull
    @Min(value = 0)
    private long buy_price;      // 거래 대기건 최고 구매가

    @NotNull
    @Min(value = 0)
    private long sell_price;     // 거래 대기건 최소 판매가

    private String date;         // 현재 시간 Timestamp

    @Getter
    @Setter
    public static class GET_ALL {
        private String status;
        private Data data;

        public static class Data {
            public TickerDTO BTC;
            public TickerDTO ETH;
            public TickerDTO DASH;
            public TickerDTO LTC;
            public TickerDTO ETC;
            public TickerDTO XRP;
            public TickerDTO BCH;
            public TickerDTO XMR;
            public TickerDTO ZEC;
            public TickerDTO QTUM;
            public TickerDTO BTG;
            public TickerDTO EOS;
            public String date;
        }
    }

    @Getter
    @Setter
    public static class GET {
        private String status;
        private TickerDTO data;
    }
}
