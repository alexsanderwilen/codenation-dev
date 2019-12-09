package br.com.codenation.challenge.log.endpoint.service;

import br.com.codenation.challenge.core.model.LogError;
import br.com.codenation.challenge.core.repository.LogErroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LogService {
    private final LogErroRepository logErroRepository;

    public Iterable<LogError> list(Pageable pageable) {
        log.info("Listing all errors");
        return logErroRepository.findAll(pageable);
    }
}
