package com.danieltessi.spring_specifications_with_query.domain;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Metier2 {
  long id;
  String numId;
}
