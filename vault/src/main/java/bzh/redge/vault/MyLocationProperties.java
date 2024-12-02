package bzh.redge.vault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("location")
@Data
public class MyLocationProperties {
    private String country;
    private String city;
}
