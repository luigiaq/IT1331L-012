package com.uap.it1311l.passwordencryptorapi.config;



import com.uap.it1311l.passwordencryptorapi.webclient.EncryptionApiClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class EncryptionApiConfig {

    @Bean
    public EncryptionApiClient encryptionApi() {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://encryption-apil.p.rapidapi.com/api/Cryptor")
                .defaultHeader("X-RapidAPI-Key", "bf798bc916msh6cb8dbaf6476bc7p127c4cjsn0f5a65c40a64")
                .defaultHeader("X-RapidAPI-Host", "encryption-apil.p.rapidapi.com")
                .build();

        HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build();

        return httpServiceProxyFactory.createClient(EncryptionApiClient.class);
    }
}

