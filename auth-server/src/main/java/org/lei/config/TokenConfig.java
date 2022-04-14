package org.lei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * @Description:
 * @Date: Created in 2022/4/12 22:16
 * @Author: WangLei
 * @Version: 1.0.0
 */
@Configuration
public class TokenConfig {
    @Bean
    TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }
}
