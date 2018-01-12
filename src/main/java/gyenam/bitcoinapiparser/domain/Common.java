package gyenam.bitcoinapiparser.domain;

import lombok.Data;

@Data
public class Common<T> {
    private String status;
    private T data;
}
