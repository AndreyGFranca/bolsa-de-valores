package br.com.zgsolucoes.bolsavalores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zgsolucoes.bolsavalores.domain.UserTrade;

@Repository
public interface UserTradeRepository extends JpaRepository<UserTrade, Long> {

}
