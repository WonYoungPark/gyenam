package gyenam.bitcoinapiparser.handler;

import gyenam.bitcoinapiparser.common.CoinType;
import gyenam.bitcoinapiparser.dto.TickerDTO;
import gyenam.bitcoinapiparser.repository.TickerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class TickerHandler {
    @Autowired
    private TickerRepository tickerRepository;

    public Mono<ServerResponse> get(ServerRequest request) {
        String currency = request.pathVariable("currency");
        String coinType = CoinType.valueOf(currency).getValue();

        final String HOST = "https://api.bithumb.com";
        final String URI  = "/public/ticker/{currency}";

        return WebClient.create(HOST).get().uri(URI, coinType).accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(response -> response.bodyToMono(TickerDTO.GET.class))
                .flatMap(mono -> ServerResponse.ok().syncBody(mono))
                ;
    }

    public Mono<ServerResponse> getList(ServerRequest request) {
        final String HOST = "https://api.bithumb.com";
        final String URI  = "/public/ticker/{currency}";

        return WebClient.create(HOST).get().uri(URI, CoinType.ALL).accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(response -> response.bodyToMono(TickerDTO.GET_ALL.class))
                .flatMap(mono -> ServerResponse.ok().syncBody(mono))
                ;
    }
}
