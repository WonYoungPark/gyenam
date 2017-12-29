package gyenam.bitcoinapiparser.domain;

import lombok.Data;

import java.util.Map;

@Data
public class Common<T> {
    private String status;
    private Map<String, Ticker> data;
}
