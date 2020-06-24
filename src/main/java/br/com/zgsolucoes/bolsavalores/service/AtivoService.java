package br.com.zgsolucoes.bolsavalores.service;

import org.springframework.stereotype.Service;

import br.com.zgsolucoes.bolsavalores.repository.AtivoRepository;

@Service
public class AtivoService {

    private AtivoRepository ativoRepository;

    public AtivoService(AtivoRepository ativoRepository) {
        this.ativoRepository = ativoRepository;
    }


}
