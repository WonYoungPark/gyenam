package gyenam.bitcoinapiparser.repository;

import gyenam.bitcoinapiparser.domain.Ticker;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TickerRepository extends ReactiveMongoRepository<Ticker, String> {
}
