package gyenam.bitcoinapiparser.domain;

import lombok.Data;

@Data
public class Ticker {
    private String status;
    private String opening_price;
    private String closing_price;
    private String min_price;
    private String max_price;
    private String average_price;
    private String units_traded;
    private String volume_1day;
    private String volume_7day;
    private String buy_price;
    private String sell_price;
}
