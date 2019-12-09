package br.com.codenation.challenge.core.repository;


import br.com.codenation.challenge.core.model.LogError;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LogErroRepository extends PagingAndSortingRepository<LogError, Long> {
}
