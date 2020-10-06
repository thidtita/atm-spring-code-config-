package th.ac.kmitl.atm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ATMConfig {
    @Bean
    public DataSource dataSource() {
        return new DataSourceDB();
    }

    @Bean
    public Bank bank() {
        return new Bank("MY BANK",dataSource());

    }
    @Bean
    public  ATM atm() {
        return new ATM(bank());
    }
}