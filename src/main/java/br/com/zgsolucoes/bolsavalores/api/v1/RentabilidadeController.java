package br.com.zgsolucoes.bolsavalores.api.v1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zgsolucoes.bolsavalores.service.RentabilidadeService;

@RestController
@RequestMapping("/api/v1/ativo")
public class RentabilidadeController {

    private RentabilidadeService rentabilidadeService;

    public RentabilidadeController(RentabilidadeService rentabilidadeService) {
        this.rentabilidadeService = rentabilidadeService;
    }

}
