package br.com.codenation.challenge.log.endpoint.controller;

import br.com.codenation.challenge.core.model.LogError;
import br.com.codenation.challenge.log.endpoint.service.LogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/courses")
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Api(value = "Endpoints to manage course")
public class LogController {
    private final LogService logService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation(value = "List all available locs", response = LogError[].class)
    public ResponseEntity<Iterable<LogError>> list(Pageable pageable) {
        return new ResponseEntity<>(logService.list(pageable), HttpStatus.OK);
    }
}
