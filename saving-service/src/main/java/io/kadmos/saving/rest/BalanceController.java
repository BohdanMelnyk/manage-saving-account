package io.kadmos.saving.rest;

import io.kadmos.saving.rest.request.UpdateBalanceRequest;
import io.kadmos.saving.service.BalanceService;
import io.kadmos.saving.service.dto.BalanceDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
@RequiredArgsConstructor
@Slf4j
public class BalanceController {

    private final BalanceService balanceService;

    @GetMapping
    public BalanceDTO fetchBalance() {
        log.info("Balance fetched()");
        return balanceService.fetchBalance();
    }

    @PostMapping
    public BalanceDTO updateBalance(@RequestBody UpdateBalanceRequest request) {
        return balanceService.updateBalance(request.getAmount());
    }

}
