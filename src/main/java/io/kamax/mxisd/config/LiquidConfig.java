package io.kamax.mxisd.config;

import io.kamax.mxisd.auth.provider.AuthenticatorProvider;
import io.kamax.mxisd.backend.liquid.LiquidAuthenticator;
import io.kamax.mxisd.backend.liquid.LiquidProvider;
import io.kamax.mxisd.lookup.provider.IThreePidProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConfigurationProperties("liquid")
public class LiquidConfig {

    private Logger log = LoggerFactory.getLogger(LiquidConfig.class);

    @Autowired
    private MatrixConfig mxCfg;

    private boolean enabled;
    private String credentials;
    private String database;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @PostConstruct
    public void build() {
        log.info("--- Liquid configuration ---");
        log.info("Enabled: {}", isEnabled());
    }

    @Bean
    public AuthenticatorProvider getAuthProvider() {
        return new LiquidAuthenticator(enabled);
    }

    @Bean
    public IThreePidProvider getLookupProvider() {
        return new LiquidProvider(enabled);
    }

}
