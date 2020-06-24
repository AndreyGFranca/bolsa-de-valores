package br.com.zgsolucoes.bolsavalores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zgsolucoes.bolsavalores.domain.InstrumentQuote;

@Repository
public interface InstrumentQuoteRepository extends JpaRepository<InstrumentQuote, Long> {

    List<InstrumentQuote> findById();
}
