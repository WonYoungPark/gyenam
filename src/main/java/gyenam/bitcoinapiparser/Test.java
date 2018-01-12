package gyenam.bitcoinapiparser;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class Test {
    private static WebClient webClient = WebClient.create("https://api.bithumb.com");

    public static void main(String[] args) {
        log.info("시작");

        Mono<Object> obj = webClient.get()
                .uri("/public/ticker/BTC")
                .accept(MediaType.ALL)
                .retrieve()
                .bodyToMono(Object.class)
                //.bodyToMono(Ticker.class)
                //.bodyToMono(String.class)
//                .flatMap(response ->
//                    response.bodyToMono(Common.class)
//                )

                ;

        log.info("끝");


    }
}
