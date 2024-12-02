package bzh.redge.vault;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("myconf")
@Data
public class MyAuthProperties {
    private String login;
    private String password;
}
