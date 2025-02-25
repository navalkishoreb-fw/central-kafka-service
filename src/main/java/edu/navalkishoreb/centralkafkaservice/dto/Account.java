package edu.navalkishoreb.centralkafkaservice.dto;

import com.freshworks.boot.common.context.account.IAccount;

public class Account
        implements IAccount {
    @Override
    public long getAccountId() {
        return 1L;
    }
}
