package br.com.codenation.challenge.core.model;

import br.com.codenation.challenge.core.enums.Environment;
import br.com.codenation.challenge.core.enums.ErrorLevel;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class LogError implements AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private ApplicationUser user;

    @NotNull
    private Environment environment;

    @Column(length = 100)
    @NotNull
    private String requestIp;

    @NotNull
    private ErrorLevel level;

    @NotNull(message = "The field 'title' is mandatory")
    @Column(nullable = false)
    private String title;

    @NotNull(message = "The field 'details' is mandatory")
    @Column(nullable = false)
    private String details;

    @Column
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdAt;


}
