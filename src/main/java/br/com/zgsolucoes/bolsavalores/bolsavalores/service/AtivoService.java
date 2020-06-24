package br.com.zgsolucoes.bolsavalores.bolsavalores.service;

import org.springframework.stereotype.Service;

import br.com.zgsolucoes.bolsavalores.bolsavalores.repository.AtivoRepository;

@Service
public class AtivoService {

    private AtivoRepository ativoRepository;

    public AtivoService(AtivoRepository ativoRepository) {
        this.ativoRepository = ativoRepository;
    }


    public void obterRentabilidade(String ativo) {
        //TODO: implementar
    }

    public void isOperacaoShort() {

    }

    public void isOperacaoLong() {

    }
}
