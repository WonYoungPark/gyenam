package gyenam.bitcoinapiparser.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document(collection = "ticker")
@Data
@Builder
public class Ticker {
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

    @NotBlank
    private String date;         // 현재 시간 Timestamp
}
