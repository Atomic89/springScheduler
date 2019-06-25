package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    @Async("asyncTaskExecutor")
    public void igm() throws InterruptedException {
        TimeUnit.SECONDS.sleep(15);
        log.info(Thread.currentThread().getName());
    }
}
