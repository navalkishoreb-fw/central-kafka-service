package edu.navalkishoreb.centralkafkaservice.service;

import com.freshworks.boot.common.AccountFetcher;
import edu.navalkishoreb.centralkafkaservice.dto.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountFetcherService
        implements AccountFetcher<Account> {
    @Override
    public Account fetchAccount(String service, long accountID) {
        return new Account();
    }
}
