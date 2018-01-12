package gyenam.bitcoinapiparser;

import gyenam.bitcoinapiparser.repository.TickerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class BitcoinApiParserApplication {
	@Autowired
	private TickerRepository tickerRepository;

	public static void main(String[] args) {
		System.setProperty("reactor.ipc.netty.workerCount", "2");
		System.setProperty("reactor.ipc.netty.pool.maxConnections", "2000");

		SpringApplication.run(BitcoinApiParserApplication.class, args);
	}

	//@Bean
	public CommandLineRunner demoData() {
		return (str) -> {
		};
	}
}
