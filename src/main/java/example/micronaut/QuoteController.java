package example.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

@Controller("/quotes")
public class QuoteController {

    private static final Logger LOG = LoggerFactory.getLogger(QuoteController.class);

    private final QuoteService quoteService;

    private final Long wait = Optional.ofNullable(System.getenv("WAIT")).map(Long::parseLong).orElse(0L);

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @Get("/random")
    public Quote randomQuote() {
        LOG.info("Got request - sleeping for " + wait + "ms");
        if (wait > 0L) {
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return quoteService.randomQuote();
    }
}
