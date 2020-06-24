package br.com.zgsolucoes.bolsavalores.service;

import org.springframework.stereotype.Service;

import br.com.zgsolucoes.bolsavalores.repository.InstrumentQuoteRepository;
import br.com.zgsolucoes.bolsavalores.repository.UserTradeRepository;

@Service
public class RentabilidadeService {

    private InstrumentQuoteRepository instrumentQuoteRepository;
    private UserTradeRepository userTradeRepository;

    public RentabilidadeService(InstrumentQuoteRepository instrumentQuoteRepository, UserTradeRepository userTradeRepository) {
        this.instrumentQuoteRepository = instrumentQuoteRepository;
        this.userTradeRepository = userTradeRepository;
    }

    public void obterRentabilidade(String ativo) {
        //TODO: implementar
    }

    public void isOperacaoShort() {

    }

    public void isOperacaoLong() {

    }
}
