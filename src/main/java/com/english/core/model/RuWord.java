package com.english.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(of = "meaning")
@NoArgsConstructor
@Entity
@Table(name = "ru_words")
public class RuWord {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String meaning;
    @OneToMany(mappedBy = "ruWord", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Card> cards;
}
