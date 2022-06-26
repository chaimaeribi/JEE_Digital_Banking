package org.sid.ebankingbackend.repositories;

import org.sid.ebankingbackend.entities.AccountOpreation;
import org.sid.ebankingbackend.entities.BankAccount;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOpreation,Long> {
    List<AccountOpreation> findByBankAccountId(String accountId);
    Page<AccountOpreation> findByBankAccountIdOrderByOperationDateDesc(String accountId, Pageable pageable);
}
