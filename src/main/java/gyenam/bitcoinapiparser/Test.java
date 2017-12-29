package gyenam.bitcoinapiparser;

import gyenam.bitcoinapiparser.domain.Common;
import gyenam.bitcoinapiparser.domain.Ticker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Component
public class Test {
    private static WebClient webClient = WebClient.create("https://api.bithumb.com");

    public static void main(String[] args) {
        log.info("시작");

        Common<Ticker> common = webClient.get()
                .uri("/public/ticker/ALL")
                .accept(MediaType.ALL)
                .exchange()
                //.retrieve()
                //.bodyToMono(String.class)
                .flatMap(response ->
                    response.bodyToMono(Common.class)
                )
                .block()
                ;

        log.info("끝");


    }
}
