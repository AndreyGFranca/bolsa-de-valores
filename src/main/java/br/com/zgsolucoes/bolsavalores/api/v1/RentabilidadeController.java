package br.com.zgsolucoes.bolsavalores.api.v1;

import br.com.zgsolucoes.bolsavalores.api.v1.dto.RentabilidadeDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zgsolucoes.bolsavalores.service.RentabilidadeService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/ativo")
public class RentabilidadeController {

    private RentabilidadeService rentabilidadeService;

    public RentabilidadeController(RentabilidadeService rentabilidadeService) {
        this.rentabilidadeService = rentabilidadeService;
    }

    @RequestMapping("/operacaoLong")
    public List<RentabilidadeDTO> operacaoLong() {
        try {
            List<RentabilidadeDTO> rentabilidadeLong = Arrays.asList();
            //TODO receber o resultado do service
            if (rentabilidadeLong.isEmpty()) {
                return Arrays.asList();
            }
            return rentabilidadeLong;
        } catch (Exception e) {
            e.printStackTrace();
            return Arrays.asList();
        }
    }

    @RequestMapping("/operacaoShort")
    public List<RentabilidadeDTO> operacaoShort(){
        try {
            List<RentabilidadeDTO> rentabilidadeShort = Arrays.asList();
            //Todo receber o resultado do service
            if(rentabilidadeShort.isEmpty()){
                return Arrays.asList();
            }
            return rentabilidadeShort;
        }catch (Exception e){
            e.printStackTrace();
            return Arrays.asList();
        }
    }
}
