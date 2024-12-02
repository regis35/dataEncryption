package bzh.redge.vault;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MyService {

    private final MyAuthProperties myAuth;
    private final MyLocationProperties myLocation;

    @PostConstruct
    public void init() {

        log.info("login '{}' password '{}'", myAuth.getLogin(), myAuth.getPassword());
        log.info("location -> country '{}' city '{}'", myLocation.getCountry(), myLocation.getCity());

    }

}
