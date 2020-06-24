package br.com.zgsolucoes.bolsavalores.bolsavalores.api.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zgsolucoes.bolsavalores.bolsavalores.api.v1.dto.RentabilidadeDTO;
import br.com.zgsolucoes.bolsavalores.bolsavalores.service.AtivoService;

@RestController
@RequestMapping("/api/v1/ativo")
public class AtivoController {

    private AtivoService ativoService;

    public AtivoController(AtivoService ativoService) {
        this.ativoService = ativoService;
    }

    @GetMapping("/rentabilidade/{ativo}")
    public ResponseEntity<RentabilidadeDTO> obterRentabilidade(@PathVariable String ativo) {
        ativoService.obterRentabilidade(ativo);
    }

}
