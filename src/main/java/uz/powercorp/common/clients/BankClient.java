package uz.powercorp.common.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.powercorp.common.dto.request.CardTransactionsCountsRequestDTO;
import uz.powercorp.common.dto.response.bank.BankResponseDTO;
import uz.powercorp.common.dto.response.bank.CardResponseDTO;

import java.util.List;

@FeignClient(name = "bank-service", path = "/bank", configuration = FeignAuthInterceptor.class)
public interface BankClient {
    @GetMapping("/{bankId}")
    BankResponseDTO getBankById(@PathVariable("bankId") Long bankId);

    @PostMapping("/get-banks-by-ids")
    List<BankResponseDTO> getAllBanksByIDs(List<Long> ids);

    @GetMapping("get-cards-of-bank/{bankID}")
    List<CardResponseDTO> getCardsOfBank(@PathVariable("bankID") Long bankID);

    @GetMapping("/get-cards-of-bank/{bankID}")
    List<CardResponseDTO> getCardsByBankId(@PathVariable("bankID") Long bankID);

    @GetMapping("/agent-web/cards/without-paging")
    List<CardResponseDTO> getAllAgentCards();

    @PostMapping("/update-cards-transactions-counts")
    void  updateCardsTransactionsCounts(CardTransactionsCountsRequestDTO request);
}
