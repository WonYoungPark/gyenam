package gyenam.bitcoinapiparser.router;

import gyenam.bitcoinapiparser.handler.TickerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TickerRouter {
    private static final String URI_VERSION_V1  = "/v1";
    private static final String URI_PATH        = "/tickers";

    @Bean
    public RouterFunction<?> tickerRouterFunction(TickerHandler tickerHandler) {
        return nest(path(URI_VERSION_V1),
                nest(accept(MediaType.APPLICATION_JSON_UTF8),
                        route(GET(URI_PATH + "/{currency}"), tickerHandler::get)
                        .andRoute(GET(URI_PATH), tickerHandler::getList)
                        .andRoute(POST(URI_PATH), tickerHandler::get)
                ));
    }
}
