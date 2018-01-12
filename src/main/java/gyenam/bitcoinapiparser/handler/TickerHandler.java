package gyenam.bitcoinapiparser.handler;

import gyenam.bitcoinapiparser.domain.Ticker;
import gyenam.bitcoinapiparser.repository.TickerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

@Component
@Slf4j
public class TickerHandler {
    @Autowired
    private TickerRepository tickerRepository;

    public Mono<ServerResponse> getList(ServerRequest request) {
        return ServerResponse.ok()
                .body(tickerRepository.findAll(), Ticker.class);
    }

    public Mono<ServerResponse> save(ServerRequest request) {
        final String HOST = "https://api.bithumb.com";
        final String URI  = "/public/ticker/{currency}";

//        WebClient webClient = WebClient.builder()
//                .baseUrl(HOST)
//                .build();
//
//        webClient.get().uri(URI, "BTC")
//        .exchange()
//                .then(response -> ServerResponse.ok().build());
////                .map((response) -> {
////                    log.info(response.toString());
////                    return response;
////                })
//
////        .then(response -> ServerResponse.ok().body(fromObject(response)));
//        return WebClient.builder()
//                .baseUrl(HOST)
//                .build().get().uri(URI, "BTC")
//                .exchange()
//                .then(response -> {
//                   return ServerResponse.ok().build();

        return ServerResponse.ok().body(fromObject(""));
    }


    public Mono<ServerResponse> test(ServerRequest request) {
        log.info("1");

        Mono<ServerResponse> result = ServerResponse
                .ok()
                .body(Mono.fromSupplier(() -> test()), String.class)
                .log();

        log.info("2");
        return result;
    }


    private String test() {
        log.info("test-메소드 실행");
        return "test-end";
    }
}
